package com.bptn.course._big_coding_3._big_coding_31;

//Customized Exception Class for when a product is out of stock

public class OutOfStockException extends Exception {
 
 private static final long serialVersionUID = 1L;

// Modify the constructor below to take a String message parameter.   
	
	public OutOfStockException(String message) {
		
     // Call the superclass constructor passing the message parameter.
		
		super(message);
 }
}

