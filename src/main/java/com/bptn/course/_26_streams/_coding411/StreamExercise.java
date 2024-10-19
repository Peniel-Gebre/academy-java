package com.bptn.course._26_streams._coding411;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StreamExercise {

    public static void main(String[] args) {
        // Create a list of strings
        List<String> words = Arrays.asList("apple", "banana", "cherry", "date", "elderberry");

        // Count the number of elements in the list
        long count = words.stream()          // Convert the list to a stream
                          .count();        // Count the number of elements

        // Print the count
        System.out.println("Count numbers of words in the list " + count);

        // Iterate over the list and print each word using a lambda expression
        words.stream()
             .forEach(word -> System.out.println(word));  // Print each word

        // Using a method reference, transform words to uppercase
        // map() is an intermediate operation that transforms each word to uppercase
        // collect is a terminal operation that collects the results into a list
        List<String> upperCaseWords = words.stream()
                                            .map(String::toUpperCase)  // Convert to uppercase using method reference
                                            .collect(Collectors.toList()); // Collect into a new list

        // Print the list of words in uppercase
        System.out.println("Words in upper case " + upperCaseWords);
    }
}
