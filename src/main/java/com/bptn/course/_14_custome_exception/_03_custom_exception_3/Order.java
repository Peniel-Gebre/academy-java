package com.bptn.course._14_custome_exception._03_custom_exception_3;

//Order.java
public class Order {
// ? private int quantity;
// ? private double price;

public Order(int quantity, double price) throws InvalidOrderException {
 if (quantity <= 0 || price <= 0) {
     throw new InvalidOrderException("Invalid order quantity or price.");
 }
// ?  this.quantity = quantity;
 // ? this.price = price;
}
}