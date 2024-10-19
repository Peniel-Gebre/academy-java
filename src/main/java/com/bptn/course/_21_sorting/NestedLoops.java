package com.bptn.course._21_sorting;

public class NestedLoops {

	   public static void main(String[] args) {
	       for (int row = 0; row < 5; row++) { //outer loop executes 5b times
	           for (int col = 0; col < 10; col++) { //inner loop executes 10 times
	               System.out.print("*"); //a total of 50 stars will be printed
	           }
	           System.out.println();
	       }
	   }
	}
