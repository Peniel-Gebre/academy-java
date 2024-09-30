package com.bptn.course._05_strings;

public class Concatenation {

	public class Greeting {
	    public static void main(String[] args) {
	        String start = "Happy Birthday";
	        
	        String fullName = "John Doe";
	        String result = start + " " + fullName;  // add together strings
	        result += "!!!"; // add on to the same string
	        System.out.println(result);
	    }
	}
}