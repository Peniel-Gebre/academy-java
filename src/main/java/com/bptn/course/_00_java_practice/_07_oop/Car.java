package com.bptn.course._00_java_practice._07_oop;

//01. create a class of Car
public class Car {
		
		//02. create instance variable/attributes
	    private String color;
	    private String brand; 
	    private  int price; 
	    
	    //03. constructors
	    public Car (String color, String brand, int price) {
	    	
	    	//use this. method
	    	this.color = color;
	    	this.brand = brand;
	   		this.price = price;
	    }
	    
	    //04. printCarDetails method
	    void printCarDetails() {
	    	this.print();
	    }
	    
	    void print() {
	    	System.out.println("Color: " + this.color +  ", Brand:  " + this.brand + ", Price: " + this.price);

	}
	    
		public static void main(String[] args) {
		
			Car car1 = new Car("White", "BMW", 70000);
			Car car2 = new Car("Red", "Audi", 80000);
			car1.printCarDetails();
			car2.printCarDetails();
			
		}

}

