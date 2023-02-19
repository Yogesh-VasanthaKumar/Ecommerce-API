package com.test.ecommerce.controller;

import com.test.ecommerce.dto.ProductRequest;
import com.test.ecommerce.model.Product;
import com.test.ecommerce.repository.ProductRepository;
import com.test.ecommerce.service.EcommerceService;
import lombok.Data;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class ProductController {
    @Autowired
    EcommerceService service;

    @PostMapping("/addproduct")
    public ResponseEntity<String> addProduct(@RequestBody ProductRequest productRequest){
        return new ResponseEntity<>(service.addProduct(productRequest), HttpStatus.CREATED);
    }

    @GetMapping("/products")
    public ResponseEntity<List<Product>> getProduct(){
        return new ResponseEntity<>(service.getProduct(),HttpStatus.OK);
    }

    @GetMapping("/products/category")
    public ResponseEntity<List<Product>> getProductByCategory(@RequestParam String cat){
        return new ResponseEntity<>(service.getProductByCat(cat),HttpStatus.OK);
    }

    @DeleteMapping("/deleteproduct/{id}")
    public ResponseEntity<String> removeProduct(@PathVariable int id){
        return new ResponseEntity<>(service.removeProductById(id),HttpStatus.OK);
    }
}
