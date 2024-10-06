package com.bptn.course._big_Coding_1;

import java.util.Scanner;

class StringOperations {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int choice;

        do {
            // Display the String operations menu
            System.out.println("/…String Menu…/");
            System.out.println("Press 1 for Palindrome Check");
            System.out.println("Press 2 to Reverse a String");
            System.out.println("Press 3 to Concatenate two Strings");
            System.out.println("Press 4 for String Comparison");
            System.out.println("Press 5 to Calculate the Length of a String");

            // Get user's choice
            System.out.print("Enter the option: ");
            choice = scanner.nextInt();
            scanner.nextLine(); // Clear the buffer after reading the integer

            // If-else statement to handle string operations
            if (choice == 1) {
                // Palindrome Check
                System.out.println("Palindrome Check");
                System.out.print("Enter a string: ");
                String str = scanner.nextLine();
                if (isPalindrome(str)) {
                    System.out.println(str + " is a palindrome");
                } else {
                    System.out.println(str + " is not a palindrome");
                }

            } else if (choice == 2) {
                // Reverse a String
                System.out.println("Reverse a String");
                System.out.print("Enter a string: ");
                String str = scanner.nextLine();
                System.out.println("Reversed String: " + reverseString(str));

            } else if (choice == 3) {
                // Concatenate Two Strings
                System.out.println("Concatenate Two Strings");
                System.out.print("Enter First string: ");
                String str1 = scanner.nextLine();
                System.out.print("Enter Second string: ");
                String str2 = scanner.nextLine();
                System.out.println("Concatenated String: " + str1 + str2);

            } else if (choice == 4) {
                // String Comparison
                System.out.println("String Comparison");
                System.out.print("Enter First string: ");
                String str1 = scanner.nextLine();
                System.out.print("Enter Second string: ");
                String str2 = scanner.nextLine();
                if (str1.equals(str2)) {
                    System.out.println("The entered strings are equal");
                } else {
                    System.out.println("The entered strings are not equal");
                }

            } else if (choice == 5) {
                // Calculate Length of a String
                System.out.println("Calculate the Length of a String");
                System.out.print("Enter a string: ");
                String str = scanner.nextLine();
                System.out.println("The length of the entered string is: " + str.length());

            } else {
                // Invalid choice
                System.out.println("Invalid choice! Please make a valid choice.");
            }

            // Ask the user if they want to continue or exit
            System.out.print("To continue Press 1, else press any other number to exit: ");
            choice = scanner.nextInt();
            scanner.nextLine(); // Clear the buffer

        } while (choice == 1); // Continue as long as the user presses 1

        // Close scanner and exit the program
        scanner.close();
        System.out.println("Thank you for using the String Operations program. Goodbye!");
    }

    // Method to check if a string is a palindrome
    public static boolean isPalindrome(String str) {
        int start = 0;
        int end = str.length() - 1;
        while (start < end) {
            if (str.charAt(start) != str.charAt(end)) {
                return false;
            }
            start++;
            end--;
        }
        return true;
    }

    // Method to reverse a string
    public static String reverseString(String str) {
        StringBuilder reversed = new StringBuilder(str);
        return reversed.reverse().toString();
    }
}