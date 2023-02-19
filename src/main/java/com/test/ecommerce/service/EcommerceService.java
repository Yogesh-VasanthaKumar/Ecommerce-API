package com.test.ecommerce.service;

import com.test.ecommerce.dto.AddressRequest;
import com.test.ecommerce.dto.OrderRequest;
import com.test.ecommerce.dto.ProductRequest;
import com.test.ecommerce.dto.UserRequest;
import com.test.ecommerce.model.Address;
import com.test.ecommerce.model.Order;
import com.test.ecommerce.model.Product;
import com.test.ecommerce.model.User;
import com.test.ecommerce.repository.AddressRepository;
import com.test.ecommerce.repository.OrderRepository;
import com.test.ecommerce.repository.ProductRepository;
import com.test.ecommerce.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.ArrayList;
import java.util.List;

@Service
public class EcommerceService {
    @Autowired
    UserRepository userRepository;

    @Autowired
    ProductRepository productRepository;

    @Autowired
    AddressRepository addressRepository;

    @Autowired
    OrderRepository orderRepository;
    public String signUp(UserRequest userRequest){
        User user = new User(userRequest.getUserId(),userRequest.getName(),userRequest.getEmail(),userRequest.getPassword(),userRequest.getPhoneNumber());
        userRepository.save(user);
        return userRequest.getName()+" Signup Successful";
    }

    public String addProduct(ProductRequest productRequest){
        Product product = new Product(productRequest.getProductId(),productRequest.getName(),productRequest.getPrice(),productRequest.getDescription(),productRequest.getCategory(),productRequest.getBrand());
        productRepository.save(product);
        return product.getName() + " Product Added";
    }

    public String addAddress(AddressRequest addressRequest){
        if(userRepository.existsById(addressRequest.getUser().getUserId())){
            Address address = new Address(addressRequest.getAddressId(),addressRequest.getName(),addressRequest.getLandmark(),addressRequest.getPhoneNumber(),addressRequest.getZipcode(),addressRequest.getState(),addressRequest.getUser());
            addressRepository.save(address);
            return addressRequest.getUser().getName()+ "address" + address.toString()+ "added";

        }
        return "Please signup to add Address";
    }


    public String placeOrder(OrderRequest orderRequest){
        if(userRepository.existsById(orderRequest.getUser().getUserId())){
            Order order = new Order(orderRequest.getOrderId(),orderRequest.getUser(),orderRequest.getProduct(),orderRequest.getAddress());
            orderRepository.save(order);
            return "order placed";
        }
        return "Failed to place order";
    }

    public Order getOrderById(int Id){
        return orderRepository.findById(Id);
    }

    public User getUserById(int id){
        return userRepository.findById(id);
    }

    public List<Product> getProduct(){
        return productRepository.findAll();
    }

    public List<Product> getProductByCat(String category){
        List<Product> all = productRepository.findAll();
        List<Product> Cat = new ArrayList<>();
        for(Product i: all){
            if(i.getCategory().equals(category)){
                Cat.add(i);
            }
        }
        return Cat;
    }

    public String removeProductById(int id){
        productRepository.deleteById(id);
        return "Deleted";
    }
}
