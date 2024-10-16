package com.bptn.course._00_java_practice._08_encapsulation._mutator;

//class
public class Car {
	
	//attributes
	private String make;
	private String model;
	private int year;
	
	//constructors
	public Car (String make, String model, int year) {
	this.make = make;
	this.setModel(model);
	this.setYear(year);
	}
	
	//getter method
	public String getMake() {
	return make;
	}
	
	public String getModel() {
	return model;
	}
	
	public int getYear() {
	return year;
	}
	
	//setter method
	public void setMake(String make) {
    this.make = make;
	}
	
	public void setModel(String model) {
    this.model = model;
	}
	
	public void setYear(int year) {
	this.year = year;
	}
	

}
