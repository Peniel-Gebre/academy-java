package com.bptn.course._big_coding_2._big_coding_21;

public class Triangle{

	// Write perimeterCalculator method 
        public int perimeterCalculator(int a, int b, int c) {
        return a + b + c; // sum of the three sides
    }


    // Write areaCalculator method
	    public int areaCalculator(int b, int h) {
        return b * h / 2 ; // formula: base * height / 2
    }

    // Do not modify the code below:
    public static void main (String[]args){

		Triangle object = new Triangle();

		int a = 7;
        int b = 10;
        int c = 35;

        int perimeter = object.perimeterCalculator(a,b,c);
        int area = object.areaCalculator(7, 10);

        System.out.println("Perimeter of the triangle is: " + perimeter + "\nThe Area of the Triangle is: " + area);
    }
}
