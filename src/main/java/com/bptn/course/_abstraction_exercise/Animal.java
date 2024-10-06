package com.bptn.course._abstraction_exercise;

abstract class Animal {
    // Abstract method (no body)
    public abstract void sound();
    

    // Concrete method
    public void sleep() {
        System.out.println("This animal is sleeping");
    }
}

class Dog extends Animal {
    // Providing implementation for the abstract method
    public void sound() {
        System.out.println("Dog barks");
    }
}

class Main {
    public static void main(String[] args) {
        //Animal animal = new Animal(); // This would be invalid
        Animal dog = new Dog(); // Valid because Dog extends Animal
        dog.sound(); // Output: Dog barks
        dog.sleep(); // Output: This animal is sleeping
    }
}
