package com.project.farmsmart.service;

import com.project.farmsmart.entities.Product;

import java.util.List;

public interface ProductService {
    Product saveProduct(Product product);
    Product getProduct(Long id);
    List<Product> getAllProducts();
    Product updateProduct(Product product);
    void deleteProductById(Long id);
}
