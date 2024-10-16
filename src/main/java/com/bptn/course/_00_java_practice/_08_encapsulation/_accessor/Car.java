package com.bptn.course._00_java_practice._08_encapsulation._accessor;

//class
public class Car {
	
	//attributes
	private String make;
	private String model;
	private int year;
	
	//constructors
	public Car (String make, String model, int year) {
	this.make =  make;
	this.model = model;
	this.year = year;
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


}
