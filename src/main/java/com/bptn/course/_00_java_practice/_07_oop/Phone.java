package com.bptn.course._00_java_practice._07_oop;

//01. create a class - phone
public class Phone {
	
	//02. Instance variables/attributes
	private int weight;
	private int height;
	private int width;
	private String color;
	
	//03. constructors
	
	//A. default constructors
	public Phone () {
		weight = 200;
		height = 150;
		width = 10;
		color = "Silver";
	}
	
	//B. parameterized constructors with all 4 parameters
	public Phone (int w, int h, int wi, String c) {
		weight = w;
		height = h;
		width = wi;
		color = c;
	}
	
	//C. parameterized constructors with only 3 parameters
	public Phone (int w, int h, int wi) {
		weight = w;
		height = h;
		width = wi;
	}
	
	//04. methods
	
	public void PenielsPhone () {
		System.out.println("Peniels phone has a notepad");
	}
	
	public void SamisPhone () {
		System.out.println("Samis phone has a gym tracker");
	}
	
	public void RuthsPhone () {
		System.out.println("Ruths phone takes pictures");
	}

	public static void main(String[] args) {
		Phone penielsPhone = new Phone();
		System.out.println("Peniels Phone - Weight: "  + penielsPhone.weight + ", Height: " + penielsPhone.height + ", Width: " + penielsPhone.width + ", color: " + penielsPhone.color);
		
		Phone samisPhone = new Phone(250, 200, 15, "Blue");
		System.out.println("Samis Phone - Weight: "  + samisPhone.weight + ", Height: " + samisPhone.height + ", Width: " + samisPhone.width + ", color: " + samisPhone.color);
		
		Phone ruthsPhone = new Phone(150, 100, 7);
		System.out.println("Ruths Phone - Weight: "  + ruthsPhone.weight + ", Height: " + ruthsPhone.height + ", Width: " + ruthsPhone.width + ", color: " + ruthsPhone.color);
		
		penielsPhone.PenielsPhone();
		samisPhone.SamisPhone();
		ruthsPhone.RuthsPhone();

	}

}
