package com.example.demo.service;

import com.example.demo.entity.Product;
import com.example.demo.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class ProductService implements ProductInterfaceService{

    @Autowired
    public ProductRepository productRepository;

    @Override
    public Product createProduct(Product product){
        return productRepository.save(product);
    }

    @Override
    public List<Product> createProducts(List<Product> products){
        return productRepository.saveAll(products);
    }

    @Override
    public List<Product> getProduct(){
        return productRepository.findAll();
    }

    @Override
    public Product getProductById(Long id){
        return productRepository.findById(id).orElse(null);
    }

    @Override
    public Product getProductByName(String name){
        return productRepository.findByName(name);
    }

    @Override
    public String deleteProductById(Long id){
        productRepository.deleteById(id);
        return "Product deleted" + id;
    }
}
