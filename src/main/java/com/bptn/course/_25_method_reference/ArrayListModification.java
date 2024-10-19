package com.bptn.course._25_method_reference;

import java.util.ArrayList;

public class ArrayListModification {
    public static void main(String[] args) {
        // Create an ArrayList
         ArrayList<String> languages= new ArrayList<>();

        // Add elements to the ArrayList
         languages.add("java");
         languages.add("javascript");
         languages.add("swift");
         languages.add("python");
        
        
        System.out.println("Original ArrayList:");
        // Print the original ArrayList using forEach and a lambda
        languages.forEach((language)-> System.out.println(language));
        
        System.out.println("========================================");
        
        // Print the original ArrayList using forEach and method reference
        languages.forEach(System.out :: println);
        
        System.out.println("========================================");

        // Modify all elements to uppercase using replaceAll() and lambda 
        languages.replaceAll((language)-> language.toUpperCase());
        
        System.out.println("========================================");

       // Modify all elements to uppercase using replaceAll() and method reference 
        //Reference to an Instance Method of an Arbitrary Object of a Particular Type
        //ContainingType :: instanceMethodName
        languages.replaceAll(String :: toUpperCase);
        
        System.out.println("========================================");
        
        System.out.println("\nUpdated ArrayList:");
         // Print the updated ArrayList using forEach and a lambda
        languages.forEach((language)-> System.out.println(language));
        
        System.out.println("========================================");
        
        // Print the updated ArrayList using forEach and method reference
        languages.forEach(System.out :: println);
    }
}
//void accept(T t) is the abstract method of Consumer functional interface
//forEach(Consumer<? super E> action)
//https://docs.oracle.com/javase/8/docs/api/java/util/function/Consumer.html

//replaceAll() has UnaryOperator as functional interface which had inherited SAM
//from its super interface Function
//R	apply(T t) is the SAM of Function
//https://docs.oracle.com/javase/8/docs/api/java/util/function/UnaryOperator.html
//https://docs.oracle.com/javase/8/docs/api/java/util/function/Function.html