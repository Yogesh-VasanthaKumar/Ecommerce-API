package com.test.ecommerce.controller;

import com.test.ecommerce.dto.AddressRequest;
import com.test.ecommerce.model.Address;
import com.test.ecommerce.service.EcommerceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AddressController {
    @Autowired
    EcommerceService service;
    @PostMapping("/addaddress")
    public ResponseEntity<String> addAddress(@RequestBody AddressRequest addressRequest){
        if(service.addAddress(addressRequest).equals("Please signup to add Address")){
            return new ResponseEntity<>("Please signup to add Address",HttpStatus.BAD_REQUEST);
        }
        return new ResponseEntity<>(service.addAddress(addressRequest), HttpStatus.CREATED);
    }
}
