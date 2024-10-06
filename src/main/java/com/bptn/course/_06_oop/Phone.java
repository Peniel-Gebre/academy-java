package com.bptn.course._06_oop;

public class Phone {
	
	// declare instance variables - properties/attributes
	//weight, height, width, color
	
	private int weight;
	private int height;
	private int width;
	private String color;
	
	
	
	
	//Constructor
	//They are always "public"
	// Has the same name as className which is "Phone" in this case
	//Does not have any return type
	//Default constructor - does not have any parameter passed
	public Phone() {
		
		//default values
		weight= 150;
		height= 140;
		width=  70;
		color= "Black";
	}
	
	//1st Parameterized constructor - which has 4 parameters passed
	public Phone(int w, int h, int wi, String c) {
		weight = w;
		height =  h;
		width = wi;
		color = c;
	}
	
	//2nd Parameterized constructor - which has 4 parameters passed
		public Phone(int w, int h, int wi) {
			weight = w;
			height =  h;
			width = wi;
		}
	
		
		
		
	//declare instance methods - behavior/functionality
	public void makePhoneCall() {
		
		System.out.println("Make a phone call");
	}
	
	public void sendTextMessage() {
		System.out.println("Send a text message");
	}

	public static void main(String[] args) {
		
	//Create an object of the Phone class using default constructor
		Phone myObj1 = new Phone();
		
		System.out.println("Default Phone: " + " Weight: " + myObj1.weight + " Height: " + myObj1.height + " Width: " + myObj1.width + " Color: " + myObj1.color);
		
		Phone myObj2= new Phone(200, 100, 50, "Red");
		System.out.println("Custom Phone: " + " Weight: " + myObj2.weight + " Height: " + myObj2.height + " Width: " + myObj2.width +  " Color: " + myObj2.color);
		
		Phone myObj3= new Phone(250, 150, 60);
		System.out.println("Custom Phone without color: " + " Weight: " + myObj3.weight + " Height: " + myObj3.height + " Width: " + myObj3.width +  " Color: " + myObj3.color);
		
		myObj1.makePhoneCall(); //accessing the instance method using the object - objectName.instanceMethodName()
		myObj1.sendTextMessage(); //accessing the instance method using the object - objectName.instanceMethodName()

	}

}

//Instance variables are always declared as "private" - because we want to encapsulate this from being accessed from another class

//Instance methods are always declared "public" because we want it to be accessible

//We can have many parameterized constructors which have the same name but different number of parameters
//We can only have 1 default constructor within a class
// If we do not have any constructors in the class - java automatically created a default constructor by setting default values (integers in to 0, String into null)