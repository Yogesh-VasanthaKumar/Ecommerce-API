package com.test.ecommerce.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name="address-db")
public class Address {
@Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int addressId;
private String name;
private String landmark;
private String phoneNumber;
private String zipcode;
private String state;

@ManyToOne
@JoinColumn(name="userId")
    private User user;
}
