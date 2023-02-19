package com.test.ecommerce.dto;

import com.test.ecommerce.model.User;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class AddressRequest {
    private int addressId;
    private String name;
    private String landmark;
    private String phoneNumber;
    private String zipcode;
    private String state;
    private User user;
}
