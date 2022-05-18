package com.springboot.storespring.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.springboot.storespring.model.Product;
import com.springboot.storespring.repository.ProductRepository;

@RestController
@RequestMapping("/api")
@CrossOrigin("http://localhost:3000/")
public class ProductController {

    @Autowired
    private ProductRepository productRepository;

    @GetMapping("/products")
    public List<Product> fetchProducts(){
        return productRepository.findAll();
    }
    
    @PostMapping("/products")
    public Product updateProducts(Product product) {
    	Product product_ = productRepository.save(new Product(product.getProduct_name(), product.getProduct_desc()));
    	return product;
    }
}