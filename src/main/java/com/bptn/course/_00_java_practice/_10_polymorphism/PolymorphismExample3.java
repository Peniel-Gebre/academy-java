package com.bptn.course._00_java_practice._10_polymorphism;

//abstract class
abstract class Vehicle {
    
	//abstract method to be implemented by child classes
    abstract void start();
    
    //concrete method 
    void stop() {
        System.out.println("Stopping the vehicle");
    }
}

//child class extending from the abstract class
class Car extends Vehicle {
    
	//overrides and implements the abstract method from the super class and ignores the concrete method
    @Override
    void start() {
        System.out.println("Starting the car engine");
    }
}

//child class extending from the abstract class
class Bike extends Vehicle {
	
	//overrides and implements the abstract method from the super class and ignores the concrete method
    @Override
    void start() {
        System.out.println("Kick starting the bike");
    }
}

//child class extending from the abstract class
class Bus extends Vehicle {
	
	//overrides and implements the abstract method from the super class and ignores the concrete method
    @Override
    void start() {
        System.out.println("Turning on the ignition of the bus");
    }
}

class Driver {
    void drive(Vehicle v) {
        v.start();
        v.stop();
    }
}

public class PolymorphismExample3 {
    public static void main(String[] args) {
        Driver d = new Driver();
        d.drive(new Car());
        d.drive(new Bike());
        d.drive(new Bus());
    }
}

