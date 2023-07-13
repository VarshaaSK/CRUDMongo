package com.example.demo.controller;

import com.example.demo.entity.Product;
import com.example.demo.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/crudMongoDb")
public class ProductController {
    @Autowired
    public ProductService productService;

    @PostMapping("/createItem")
    public Product addProduct(@RequestBody Product product){
        return productService.createProduct(product);
    }

    @PostMapping("/createItems")
    public List<Product> addItems(@RequestBody List<Product> products){
        return productService.createProducts(products);
    }

    @GetMapping("/getItems")
    public List<Product> getItem(){
        return productService.getProduct();
    }

    @GetMapping("/getItemById/{id}")
    public Product getItemById(@PathVariable Long id){
        return productService.getProductById(id);
    }

    @GetMapping("/getItemByName/{name}")
    public Product getItemByName(String name){
        return productService.getProductByName(name);
    }

    @DeleteMapping("/deleteItem/{id}")
    public String deleteItemById(@PathVariable Long id){
        return productService.deleteProductById(id);
    }

}
