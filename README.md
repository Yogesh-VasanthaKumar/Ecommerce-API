
# Ecommerce API
Ecommerce API using java Spring boot 

## Framework

 - Java Spring Boot 
 - JPA
 - H2 Database
 - Hibernate
 - lombok


## API Reference

#### Get User By ID

```http
  GET /getuser/{id}
```
#### Get Order By Id

```http
  GET /oders/{id}/
```

| Parameter | Type     | Description                       |
| :-------- | :------- | :-------------------------------- |
| `id`      | `int` | **Required**. Id of item to fetch |

#### Get products By Id

```http
  GET /products/{id}/
```

| Parameter | Type     | Description                       |
| :-------- | :------- | :-------------------------------- |
| `id`      | `int` | **Required**. Id of item to fetch |

#### Get products By Category

```http
  GET /products/category/?cat=Mobile
```

| Parameter | Type     | Description                       |
| :-------- | :------- | :-------------------------------- |
| `cat`      | `String` | **Required**. Category of item to fetch |



#### Add User


```http
  POST /signup
```

#### Add Product


```http
  POST /addproduct
```

#### Add address


```http
  POST /addaddress
```

#### Place Order


```http
  POST /placeorder
```




#### Delete product By Id

```http
  DELETE /deleteproduct/{id}
```

| Parameter | Type     | Description                       |
| :-------- | :------- | :-------------------------------- |
| `id`      | `int` | **Required**. Id of item to delete |



## Authors

- [@Yogesh](https://github.com/Yogesh-VasanthaKumar/)


