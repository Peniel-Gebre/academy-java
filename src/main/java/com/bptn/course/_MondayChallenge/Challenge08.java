package com.bptn.course._MondayChallenge;

public class Challenge08 {

    public static void main(String[] args) {
        int tripMiles = 300;
        Double price = 2.50;
        int milesPerGallon = 30;
        double numberOfGallons = tripMiles / milesPerGallon;
        double totalCost = numberOfGallons * price;
        System.out.println(totalCost);
    }
}
