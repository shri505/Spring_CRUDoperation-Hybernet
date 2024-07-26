package com.example.service;

import com.example.model.Product;

import java.util.List;

public interface ProductService {
    Product createProduct(Product product);
    Product updateProduct(Product product);
    List<Product> getAllProduct();
    Product getProductById(long productId);

    void deleteProduct(long id);

}
