package com.bptn.course._14_custom_exception;

class ValidAgeException extends Exception {
    private static final long serialVersionUID = 1L;

	public ValidAgeException(String message) {
        super(message);
    }
// ? }

// ?  public class ThrowExample {

    // Using throw to explicitly throw a custom exception
    public static void validateAge(int age) throws ValidAgeException {
        if (age < 0 || age > 150) {
            throw new ValidAgeException("Invalid age: " + age);
        } else {
            System.out.println("Valid age: " + age);
        }
    }

    public static void main(String[] args) {
        try {
            // Calling a method that throws a custom exception
            validateAge(-5);
        } catch (ValidAgeException e) {
            System.out.println("CustomException caught: " + e.getMessage());
        }
    }
}