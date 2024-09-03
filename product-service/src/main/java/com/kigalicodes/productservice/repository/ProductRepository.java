package com.kigalicodes.productservice.repository;

import com.kigalicodes.productservice.model.Product;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface ProductRepository extends MongoRepository<Product, String> {
}
