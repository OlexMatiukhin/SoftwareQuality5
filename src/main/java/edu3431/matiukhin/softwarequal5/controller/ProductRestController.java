package edu3431.matiukhin.softwarequal5.controller;/*
@author sasha
@project SoftwareQuality5
@class ProductRestController
@version 1.0.0
@since 25.04.2025 - 08 - 47
*/


import edu3431.matiukhin.softwarequal5.model.Product;
import edu3431.matiukhin.softwarequal5.service.ProductService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping({"/api/v1/products"})
public class ProductRestController {
    private final ProductService productService;

    @GetMapping
    public List<Product> getAllItems() {
        return this.productService.getAll();
    }

    @GetMapping({"/{id}"})
    public Product getItemById(@PathVariable String id) {
        return this.productService.getById(id);
    }

    @PostMapping
    public Product createItem(@RequestBody Product item) {
        return this.productService.createItem(item);
    }

    @PutMapping
    public Product updateItem(@RequestBody Product item) {
        return this.productService.updateItem(item);
    }

    @DeleteMapping({"/{id}"})
    public void deleteItem(@PathVariable String id) {
        this.productService.deleteById(id);
    }


}
