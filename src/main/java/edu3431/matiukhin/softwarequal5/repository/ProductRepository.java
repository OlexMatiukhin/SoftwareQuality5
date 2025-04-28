package edu3431.matiukhin.softwarequal5.repository;/*
@author sasha
@project SoftwareQuality5
@class ItemRepository
@version 1.0.0
@since 14.04.2025 - 15 - 28
*/


import edu3431.matiukhin.softwarequal5.model.Product;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface ProductRepository extends MongoRepository<Product, String> {
}