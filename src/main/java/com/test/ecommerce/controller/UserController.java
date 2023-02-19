package com.test.ecommerce.controller;

import com.test.ecommerce.dto.UserRequest;
import com.test.ecommerce.model.User;
import com.test.ecommerce.service.EcommerceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
public class UserController {
    @Autowired
    EcommerceService service;

    @PostMapping("/signup")
    public ResponseEntity<String> signUp(@RequestBody UserRequest userRequest){

        return new ResponseEntity<>(service.signUp(userRequest), HttpStatus.CREATED);

    }

    @GetMapping("/getuser/{id}")
    public ResponseEntity<User> getUserById(@PathVariable int id){
        return new ResponseEntity<>(service.getUserById(id), HttpStatus.OK);
    }

}
