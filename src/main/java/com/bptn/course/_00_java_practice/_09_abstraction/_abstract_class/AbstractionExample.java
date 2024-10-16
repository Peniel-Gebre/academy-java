package com.bptn.course._00_java_practice._09_abstraction._abstract_class;

abstract class Vehicle {
//    private int numberOfWheels;
//    private String fuelType;
//    
//    public Vehicle(int numberOfWheels, String fuelType) {
//        this.numberOfWheels = numberOfWheels;
//        this.fuelType = fuelType;
//    }
    
    public abstract void move();
    public abstract void stop();
}

class Car extends Vehicle {
    
//    public Car(int numberOfWheels, String fuelType) {
//        super(numberOfWheels, fuelType);
//    }
    
    @Override
    public void move() {
        System.out.println("The car is moving on the road.");
    }
    
    @Override
    public void stop() {
        System.out.println("The car has stopped at a traffic signal.");
    }
}

class Bicycle extends Vehicle {
    
//    public Bicycle(int numberOfWheels, String fuelType) {
//        super(numberOfWheels, fuelType);
//    }
    
    @Override
    public void move() {
        System.out.println("The bicycle is moving on the road.");
    }
    
    @Override
    public void stop() {
        System.out.println("The bicycle has stopped at a traffic signal.");
    }
}


public class AbstractionExample {

	public static void main(String[] args) {
		
       Vehicle car = new Car();
       car.move();
       car.stop();
       
       Vehicle bicycle = new Bicycle();
       bicycle.move();
       bicycle.stop();
       

	}

}
