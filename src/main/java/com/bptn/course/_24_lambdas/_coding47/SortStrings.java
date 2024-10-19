package com.bptn.course._24_lambdas._coding47;

import java.util.Arrays;
import java.util.List;
import java.util.Collections;

public class SortStrings {
    public static void main(String[] args) {
        // Declare and initialize a list of strings using an ArrayList and the Arrays.asList method
        List<String> strings = Arrays.asList("foo", "bar", "baz", "qux", "quux");
        
        // Print the string without sorting
        System.out.println("Before sorting " + strings);

        // Sort the list of strings in ascending order using a lambda expression
        Collections.sort(strings, (a, b) -> a.compareTo(b));

        // Print the sorted list of strings
        System.out.println("After sorting " + strings);
    }
}
