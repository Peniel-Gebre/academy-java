package com.bptn.course._big_Coding_1;

import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int choice;
        double num1, num2, quotient, remainder, result;
        
        while (true) {
            System.out.println("Menu:");
            System.out.println("1. Addition");
            System.out.println("2. Subtraction");
            System.out.println("3. Multiplication");
            System.out.println("4. Division");
            System.out.println("5. Square");
            System.out.println("6. Square Root");
            System.out.println("7. Reciprocal");
            System.out.println("0. Exit");
            System.out.print("Enter your choice: ");

            choice = scanner.nextInt();

            if (choice == 0) {
            	System.out.println("Invalid choice! Please make a valid choice.");
                break;
            }

            switch (choice) {
                case 1:
                	 System.out.print("Enter the first number: ");
                     num1 = scanner.nextDouble();
                     System.out.print("Enter the second number: ");
                     num2 = scanner.nextDouble();
                     result = num1 + num2;
                     System.out.println("The addition of numbers " + num1 + " and " + num2 + " is = " + result);
                     break;
                case 2:
                    System.out.print("Enter the first number: ");
                    num1 = scanner.nextDouble();
                    System.out.print("Enter the second number: ");
                    num2 = scanner.nextDouble();
                    result = num1 - num2;
                    System.out.println("The subtraction of number " + num2 + " from " + num1 + " is = " + result);
                    break;
                case 3:
                    System.out.print("Enter the first number: ");
                    num1 = scanner.nextDouble();
                    System.out.print("Enter the second number: ");
                    num2 = scanner.nextDouble();
                    result = num1 * num2;
                    System.out.println("The product of numbers " + num1 + " and " + num2 + " is = " + result);
                    break;
                case 4:
                    System.out.print("Enter the first number: ");
                    num1 = scanner.nextDouble();
                    System.out.print("Enter the second number: ");
                    num2 = scanner.nextDouble();
                    if (num2 == 0) {
                        System.out.println("Error: Modulus by zero is not allowed.");
                    } else {
                        quotient = num1 / num2;
                        remainder = num1 % num2;
                        System.out.println("Dividing " + num1 + " by " + num2 + " the quotient is " + quotient + " The remainder is " + remainder );
                    }
                    break;
                case 5:
                    System.out.print("Enter a number: ");
                    num1 = scanner.nextDouble();
                    result = num1 * num1;
                    System.out.println("The square of the number " + num1 + " is " + result);
                    break;
                case 6:
                    System.out.print("Enter a number: ");
                    num1 = scanner.nextDouble();
                    if (num1 < 0) {
                        System.out.println("Error: Square root of a negative number is not defined.");
                    } else {
                        result = Math.sqrt(num1);
                        System.out.println("The square root of the number " + num1 + " is " + result);
                    }
                    break;
                case 7:
                    System.out.print("Enter a number: ");
                    num1 = scanner.nextDouble();
                    if (num1 == 0) {
                        System.out.println("Error: Reciprocal of 0 is undefined.");
                    } else {
                        result = 1 / num1;
                        System.out.println("The Reciprocal of the number " + num1 + " is " + result);
                    }
                    break;
                default:
                    System.out.println("Invalid choice! Please make a valid choice.");
            }
        }

        scanner.close();
    }
}