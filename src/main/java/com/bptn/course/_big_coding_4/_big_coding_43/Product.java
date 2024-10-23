package com.bptn.course._big_coding_4._big_coding_43;

import java.util.ArrayList;
import java.util.List;

public class Product {
    
	// Create your instance variables
    int id;          // Stores the product ID
    String name;     // Stores the product name
    double price;    // Stores the product price

 // Create a constructor to initialize the product properties
    public Product(int id, String name, double price) {
        this.id = id;         // Assign the passed id to this.id
        this.name = name;     // Assign the passed name to this.name
        this.price = price;   // Assign the passed price to this.price
    }

 // Create a static method "countProducts"
    public static long countProducts(List<Product> productsList) {
    	
    	// Filter products based on the price and get the count of products
        return productsList.stream()
                .filter(product -> product.price < 30000)  // Filter products where price is less than 30000
                .count();  // Count the number of filtered products
    }

    public static void main(String[] args) {
    	
        // Create a list of products
        List<Product> productsList = new ArrayList<Product>();

        // Add products to the list
        productsList.add(new Product(1, "HP Laptop", 25000));     // Adding HP Laptop with price 25000
        productsList.add(new Product(2, "Dell Laptop", 30000));   // Adding Dell Laptop with price 30000
        productsList.add(new Product(3, "Lenevo Laptop", 28000)); // Adding Lenevo Laptop with price 28000
        productsList.add(new Product(4, "Sony Laptop", 28000));   // Adding Sony Laptop with price 28000
        productsList.add(new Product(5, "Apple Laptop", 90000));  // Adding Apple Laptop with price 90000

     // Call "countProducts" method and hold return type in "count" variable 
        long count = countProducts(productsList);  // Calling the countProducts method

     // Print the count of products whose price is less than 30000
        System.out.println("Number of products with price less than 30000: " + count);
    }
}

//Code Breakdown and Explanation:
//
//1. Instance Variables:
//   - The Product class has three instance variables: "id", "name", and "price" to store product information.
//   
//2. Constructor:
//   - The constructor "Product(int id, String name, double price)" initializes the product’s properties with the values provided when a "Product" object is created.
//
//3. Static Method countProducts:
//   - This method takes a "List<Product>" as an argument and uses the Stream API to filter products whose price is less than 30000.
//   - The "filter" method uses a lambda expression "product -> product.price < 30000" to filter the list based on price.
//   - The "count()" method then returns the number of products that satisfy this condition.
//
//4. Main Method:
//   - A list of Product objects is created, and five products are added to the list.
//   - The "countProducts" method is called with the "productsList" as an argument to get the count of products priced less than 30000.
//   - The count is then printed using "System.out.println".
//
//- In the future, I will remember the power of streams when working with collections, as they allow for efficient processing of large datasets with minimal boilerplate code.
//
