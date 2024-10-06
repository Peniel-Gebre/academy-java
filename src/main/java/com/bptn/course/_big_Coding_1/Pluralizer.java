package com.bptn.course._big_Coding_1;

import java.util.Scanner;

public class Pluralizer {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //Read the number from the user.
        System.out.print("Enter a non-negative integer: ");
        int number = scanner.nextInt();


        // Read the noun from the user.
        System.out.print("Enter a singular noun: ");
        String noun = scanner.next();

        // If the number is 1, print the number followed by the singular noun.
        if (number == 1) {
            System.out.println(number + " " + noun);
            
        // Otherwise, pluralize the noun and print the number followed by the pluralized noun.
        } else {
            String pluralNoun = pluralize(noun);
            System.out.println(number + " " + pluralNoun);
        }
        scanner.close();
    }

    public static String pluralize(String noun) {
    	

    	// If the noun ends with "fe", replace "fe" with "ves"
        if (noun.endsWith("fe")) {
            return noun.substring(0, noun.length() - 2) + "ves";
            
        // If the noun ends with "y" and the preceding letter is not a vowel, replace "y" with "ies"
        } else if (noun.endsWith("y") && !isVowel(noun.charAt(noun.length() - 2))) {
            return noun.substring(0, noun.length() - 1) + "ies";
        
        // If the noun ends with "sh" or "ch", add "es" to the end
        } else if (noun.endsWith("sh") || noun.endsWith("ch")) {
            return noun + "es";
            
        // If the noun ends with "us", replace "us" with "i"
        } else if (noun.endsWith("us")) {
            return noun.substring(0, noun.length() - 2) + "i";
            
        // If the noun ends with "ay", "ey", "oy", or "uy", add "s" to the end
        } else if (noun.endsWith("ay") || noun.endsWith("ey") || noun.endsWith("oy") || noun.endsWith("uy")) {
            return noun + "s";
            
        // Otherwise, add "s" to the end of the noun
        } else {
            return noun + "s";
        }
    }

    //Check if the character is a vowel (a, e, i, o, or u)
    public static boolean isVowel(char c) {
        return "aeiouAEIOU".indexOf(c) != -1;
    }
}