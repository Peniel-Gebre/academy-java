package com.bptn.course._00_java_practice._03_scanner;

import java.util.Scanner;

public class InputTypes {

	public static void main(String[] args) {
		Scanner myObj = new Scanner(System.in);
		
		System.out.println("Enter your name, age, favorite city, and salary: ");
		
		String name = myObj.nextLine();
		String favCity = myObj.nextLine();
		int age = myObj.nextInt();
		double salary = myObj.nextDouble();
		
		System.out.println("Your name: " + name);
		System.out.println("Your favorite city: " + favCity);
		System.out.println("Your age: " + age);
		System.out.println("Your salary: " + salary);
		
		myObj.close();

	}

}
