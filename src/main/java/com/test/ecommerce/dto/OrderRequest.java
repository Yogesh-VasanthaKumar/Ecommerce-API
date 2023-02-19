package com.test.ecommerce.dto;

import com.test.ecommerce.model.Address;
import com.test.ecommerce.model.Product;
import com.test.ecommerce.model.User;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class OrderRequest {
    private int orderId;
    private User user;
    private Product product;
    private Address address;
}
