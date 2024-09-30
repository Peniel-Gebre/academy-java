package com.bptn.course._Big_Coding;

import java.util.Scanner;

public class Pluralizer2 {
    public static void main(String[] args) {
        // Create a scanner object to read user input
        Scanner scanner = new Scanner(System.in);

        // Get the number and singular noun from the user
        System.out.print("Enter a non-negative integer: ");
        int amt = scanner.nextInt();
        scanner.nextLine(); // Consume the newline character left by nextInt()

        System.out.print("Enter a singular noun: ");
        String word = scanner.nextLine();

        // Variable to store the pluralized form of the word
        String pluralWord = "";

        // Check if the amount is 1, in which case we do not pluralize
        if (amt == 1) {
            pluralWord = word; // Singular form remains unchanged
        } else {
            // Apply pluralization rules for nouns based on their endings
            if (word.endsWith("fe")) {
                // Replace "fe" with "ves" (knife -> knives)
                pluralWord = word.substring(0, word.length() - 2) + "ves";
            } else if (word.endsWith("y") && !(word.endsWith("ay") || word.endsWith("ey") || word.endsWith("oy") || word.endsWith("uy"))) {
                // Replace "y" with "ies" unless the word ends with "ay", "ey", "oy", "uy"
                pluralWord = word.substring(0, word.length() - 1) + "ies";
            } else if (word.endsWith("us")) {
                // Replace "us" with "i" (cactus -> cacti)
                pluralWord = word.substring(0, word.length() - 2) + "i";
            } else if (word.endsWith("sh") || word.endsWith("ch")) {
                // Add "es" to words ending in "sh" or "ch" (bush -> bushes)
                pluralWord = word + "es";
            } else {
                // For all other cases, add "s"
                pluralWord = word + "s";
            }
        }

        // Print out the amount and the pluralized form of the word
        System.out.println(amt + " " + pluralWord);

        // Close the scanner 
        scanner.close();
    }
}
