package com.bptn.course._MondayChallenge;

public class Challenge16 {

    public static void main(String[] args) {
        // Your code should use the variables
        // money, pricePerWing, numWings
        // and print out numWings
        double money = 4.50;
        double pricePerWing = 0.75;
        int numWings = (int)(money/pricePerWing); // Casting -  forcing a conversion of a higher order type (in this case, double) to a lower order type (int) by adding the type in brackets in front of the value definition; this is casting
        System.out.println(numWings);
      }
  }
