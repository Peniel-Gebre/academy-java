package com.bptn.course._19_junit._coding_43;

public class Student {

    // Define private instance variables for rollNumber and name
    private int rollNumber;
    private String name;

    // Constructor to initialize the rollNumber and name
    public Student(int rollNumber, String name) {
        this.rollNumber = rollNumber;
        this.name = name;
    }

    // Getter method for rollNumber
    public int getRollNumber() {
        return rollNumber;
    }

    // Getter method for name
    public String getName() {
        return name;
    }
}
