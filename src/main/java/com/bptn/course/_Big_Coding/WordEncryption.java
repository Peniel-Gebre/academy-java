package com.bptn.course._Big_Coding;

//Import the Scanner class
import java.util.Scanner;

//Create a Scanner object
public class WordEncryption {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
     // Prompt the user for input
        System.out.print("Enter a word: ");
        String word = scanner.nextLine();

        String
 encryptedWord = encrypt(word);
        
      //Print the encrypted word
        System.out.println("Encrypted word: " + encryptedWord);
        scanner.close();
    }

 // Create a StringBuilder
    public static String encrypt(String word) {
        StringBuilder encrypted = new StringBuilder();

     // Iterate over each character
        for (char c : word.toCharArray()) { // Check if the character is a letter
            if (Character.isLetter(c)) {
                char encryptedChar = (char) (c + 1); // shift the letter
                if (Character.isUpperCase(c) && encryptedChar > 'Z') { // Handle uppercase letters
                    encryptedChar = 'A';
                } else if (Character.isLowerCase(c) && encryptedChar > 'z') {
                    encryptedChar = 'a';
                }
                encrypted.append(encryptedChar); // Append the encrypted character
            } else {
                encrypted.append(c); // Handle non-alphabetic characters
            }
        }

     // Return the encrypted word
        return encrypted.toString();
    }
}