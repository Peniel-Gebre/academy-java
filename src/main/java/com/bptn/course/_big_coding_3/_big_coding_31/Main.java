package com.bptn.course._big_coding_3._big_coding_31;

public class Main {
	//Do not modify this code
		public static void main(String[] args) {
		    Store store = new Store();
		    try {
		        store.purchase("apple",11);
		        System.out.println("Purchase successful!");
		    } catch (OutOfStockException e) {
		        System.out.println(e.getMessage());
		    }
		    
		 // Try to purchase 10 apples (which is the exact stock amount)
		    
		    try {
		         store.purchase("apple", 10);
		     } catch (OutOfStockException e) {
		         System.out.println(e.getMessage());
		     }
		}
	}

