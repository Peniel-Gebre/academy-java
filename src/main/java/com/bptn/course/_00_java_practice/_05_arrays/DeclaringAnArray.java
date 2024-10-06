package com.bptn.course._00_java_practice._05_arrays;

public class DeclaringAnArray {

	public static void main(String[] args) {
		
		//option 01
		//declare an array
		int [] highscores;
		
		//create an array
		highscores = new int [5];
		
		//option 02
		//declaring and creating an array with 1 step
		int[] highscores2 = new int [5]; 
		
		System.out.println(highscores2 [3]);
		
		
		//option 03
		//declare, create and  initialize all at once
		int[] highscores3  = {95, 96, 97, 98, 99};
		
		//accessing elements in an array
		int thirdElement = highscores3 [2];
		
		System.out.println(thirdElement);
		
		//modifying elements in an array
		highscores [4] = 100;
		System.out.println(highscores [4]);
		
		//modifying arrays to have more elements
		int [] highscores4 = {95, 96, 97, 98, 99};
		
		highscores4 = new int [6];
		highscores4  [5]  = 100;
		
		
		System.out.println(highscores4 [5]);
		
		//getting the length  (total number of variables in an array)
		System.out.println(highscores4.length);
		
		//printing each element in an array using for loop - traversing the array
		for(int i=0; i<highscores3.length; i++) {
			System.out.println(highscores3[i]);
		}
		
	}

}
