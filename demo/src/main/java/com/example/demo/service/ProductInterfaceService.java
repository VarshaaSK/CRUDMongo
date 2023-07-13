package com.example.demo.service;

import com.example.demo.entity.Product;

import java.util.List;

public interface ProductInterfaceService {
    Product createProduct(Product product);
    List<Product> createProducts(List<Product> products);
    List<Product> getProduct();
    Product getProductById(Long id);
    Product getProductByName(String name);
    String deleteProductById(Long id);
}
