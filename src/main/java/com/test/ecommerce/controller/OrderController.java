package com.test.ecommerce.controller;

import com.test.ecommerce.dto.OrderRequest;
import com.test.ecommerce.model.Order;
import com.test.ecommerce.service.EcommerceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
public class OrderController {
    @Autowired
    EcommerceService service;
    @PostMapping("placeorder")
    public ResponseEntity<String> placeOrder(@RequestBody OrderRequest orderRequest){
        return new ResponseEntity<>(service.placeOrder(orderRequest), HttpStatus.OK);
    }

    @GetMapping("/oders/{id}")
    public ResponseEntity<Order> orderById(@PathVariable int id){
        return new ResponseEntity<>(service.getOrderById(id),HttpStatus.OK);
    }
}
