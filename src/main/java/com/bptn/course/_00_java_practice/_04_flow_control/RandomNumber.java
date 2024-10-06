package com.bptn.course._00_java_practice._04_flow_control;

public class RandomNumber {

	public static void main(String[] args) {
		
    java.util.Random rand = new java.util.Random();
	      
    //Declare, and initialize a variable called randomNumber with a random number in it.
	int randomNumber = rand.nextInt (100) + 1 ;
	      
	//Print that number to the console with the following. text
	System.out.println("After execution the Random number is: " + randomNumber); 
	        
	
    double randomNumber2 = Math.random();
    
    System.out.println("After execution the next random number is : " + randomNumber2);
    		
	    }
	}


