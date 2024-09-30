package com.bptn.course._Big_Coding;

import java.util.Scanner;

public class NumberGuessingGame {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
      //Set the target number to 23 (or use a random number generator).
        int secretNumber = 23;
        int guess;
        
      //Print a welcome message to the user

        System.out.println("Welcome to the Number Guessing Game!");
        System.out.println("I'm thinking of a number between 1 and 100. Can you guess it?");
        
      //Start a do-while loop:

        while (true) {
        	
        	//Prompt the user to enter their guess
            System.out.print("Enter your guess: ");
            guess = scanner.nextInt();
            
          //If the guess is outside of 1 and 100, print "Please enter a number between 1 and 100."

            if (guess < 1 || guess > 100) {
                System.out.println("Please enter a number between 1 and 100.");
                
              //If the guess is less than the target number, print "Your guess is too low."
            } else if (guess < secretNumber) {
                System.out.println("Too low! Try Again.");
                
                ////If the guess is greater than the target number, print "Too high! Try again."
            } else if (guess > secretNumber) {
                System.out.println("Too high! Try again.");
                
              //If the guess is equal to the target number, print "Congratulations! You guessed the number correctly."

            } else {
                System.out.println("Congratulations! You guessed the number correctly!");
                break;
            }
        }
        scanner.close();
    }
}