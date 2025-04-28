package edu3431.matiukhin.softwarequal5.service;/*
@author sasha
@project SoftwareQuality5
@class ProductService
@version 1.0.0
@since 25.04.2025 - 08 - 49
*/

import edu3431.matiukhin.softwarequal5.model.Product;
import edu3431.matiukhin.softwarequal5.repository.ProductRepository;
import jakarta.annotation.PostConstruct;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
@RequiredArgsConstructor
public class ProductService {
    private final ProductRepository productRepository;
    public List<Product> products = new ArrayList();
    {
        products.add(new Product("1","Smartfones and mobile phones", "Smartphone", "Redmi Note 5A", 3333,"00001", "Made in China."));
        products.add(new Product("2","Furniture", "Office chair", "Art Metal Furniture A-36 black", 4444,"00002", "Just usual office chair"));
        products.add(new Product("3","Large household appliances", "Fridges", " MPM MPM-46-CJ-01", 3333,"00003", "Refrigerator with freezer compartment"));
    }


    @PostConstruct
    public void init() {
        this.productRepository.deleteAll();
        this.productRepository.saveAll(this.products);
    }

    public List<Product> getAll() {
        return this.productRepository.findAll();
    }

    public Product getById(String id) {
        return (Product) this.productRepository.findById(id).orElse( null);
    }

    public Product createItem(Product product) {
        this.productRepository.save(product);
        return product;
    }

    public Product updateItem(Product product) {
        this.productRepository.save(product);
        return product;
    }

    public void deleteById(String Id) {
        this.productRepository.deleteById(Id);
    }
}
