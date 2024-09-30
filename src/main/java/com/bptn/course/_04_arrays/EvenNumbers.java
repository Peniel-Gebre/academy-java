package com.bptn.course._04_arrays;

public class EvenNumbers {

    public static void main(String args[]) {  
        int evenNumber = 1; 

          // Create a for loop with a the following condition: 
          // Initialize the evenNumber with 1
          // Put a condition for evenNumber to loop as long as it is <= 100
          //Increment the evenNumber by 1 after the first execution

           for (evenNumber = 1; evenNumber <= 100; evenNumber++) {
            if (evenNumber % 2 == 0) { //if the remainder of the number when divided by 2 is equal to 0 print the number
                System.out.print(evenNumber + " "); //"Printing the  even numbers from 1 to 100: \n" + 
            }
           }
 


    }  
}
