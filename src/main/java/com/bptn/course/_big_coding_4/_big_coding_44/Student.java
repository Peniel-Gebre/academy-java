package com.bptn.course._big_coding_4._big_coding_44;

public class Student {

	// Create instance variables int id, String name, and int age
    private int id;       // Unique student ID
    private String name;  // Student name
    private int age;      // Student age

  //Define a constructor that takes three arguments (id, name, and age)
    public Student(int id, String name, int age) {
        this.id = id;     // Assign the passed id to this.id
        this.name = name; // Assign the passed name to this.name
        this.age = age;   // Assign the passed age to this.age
    }

 // Define a getter method for the id field
    public int getId() {
        return id;  // Return the student's ID
    }

    // Define a getter method for the name field
    public String getName() {
        return name;  // Return the student's name
    }

 // Define a getter method for the age field
    public int getAge() {
        return age;  // Return the student's age
    }

  //toString() method
    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}

//Code Breakdown and Explanation:
//
//Student Class:
//   - Instance Variables: The "Student" class has three private instance variables: "id", "name", and "age", which represent the student's unique identifier, name, and age respectively.
//   - Constructor: The constructor "Student(int id, String name, int age)" initializes these instance variables when a Student object is created.
//   - Getter Methods: These methods provide access to the private instance variables.
//   - toString(): This method overrides the default "toString()" method and provides a string representation of a Student object in the format "Student{id=1, name='Alice', age=20}".
