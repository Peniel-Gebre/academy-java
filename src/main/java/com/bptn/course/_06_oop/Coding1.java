package com.bptn.course._06_oop;

public class Coding1 {

    public static void main(String args[]) {
        Car car1 = new Car("white", "BMW", 70000);
        Car car2 = new Car("Red", "Audi", 80000);
        car1.printCarDetails();
        car2.printCarDetails();
    }
}

class Car {

    // Fill in the code for Step 2
    private String color;
    private String brand;
    private int price;

      //parameterized constructor - which has 3 parameters
      public Car(String color, String brand, int price) {
        // Fill in the code for Step 4
        this.color= color;
        this.brand= brand;
        this.price= price;

      }


      void printCarDetails() {
       //calling the private method which is present inside the same car class//this keyword can also be used to invoke method within the sam class

                  this.print();
    }

    // Fill in the code
    private void print() {
         // fill in code
          System.out.println("Car{" +
                  "color='" + this.color + '\'' +
                  ", brand='" + this.brand + '\'' +
                  ", price=" + this.price +
                  '}');
    }
}

//this keyword can be used to point to current class instance variables
//this keyword can be used to point to current instance methods
//this keyword can be used to point to current class constructor