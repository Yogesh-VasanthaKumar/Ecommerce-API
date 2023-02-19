package com.test.ecommerce.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class UserRequest {
    private int userId;
    private String name;
    private String email;
    private String password;
    private String phoneNumber;


}
