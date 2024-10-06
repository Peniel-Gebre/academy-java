package com.bptn.course._00_java_practice._06_strings;

public class StringMethods {

	public static void main(String[] args) {

        String message1 = "This is a test";
        String message2 = "Hello Class";
        String message3 = "Hello Classes";

        //int length()
        System.out.println(message1.length());
        System.out.println(message2.length());

        //String substring(int from, int to)
        System.out.println(message1.substring(0,3));
        System.out.println(message2.substring(4,5));
        System.out.println(message1.substring(5));
        System.out.println(message1.substring(5, 5+1));

        //int indexOf(String str)
        System.out.println(message1.indexOf("is")); // This will match the is in "This"!
        System.out.println(message1.indexOf("Hello"));
        System.out.println(message2.indexOf("Hello"));
        
        //int compareTo(String other)
        System.out.println(message2.compareTo(message1));
        System.out.println(message1.compareTo(message2));
        System.out.println(message1.compareTo(message1));
        System.out.println(message2.compareTo(message3));
        
        //boolean equals(String other)
        System.out.println(message2.equals(message1));
        System.out.println(message2.equals(message2));

        //toLowerCase and toUpperCase
        System.out.println(message2.toLowerCase());
        System.out.println(message2.toUpperCase());
        System.out.println(message1.toLowerCase());
        System.out.println(message1.toUpperCase());
    }
}
