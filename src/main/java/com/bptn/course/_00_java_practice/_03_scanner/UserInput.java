package com.bptn.course._00_java_practice._03_scanner;

import java.util.Scanner;

public class UserInput {

	public static void main(String[] args) {
		Scanner myObj = new Scanner (System.in);

		
		System.out.println("Enter the user name: ");
		String userName = myObj.nextLine();
		
		System.out.println("User name is: " + userName);
		
		myObj.close();
	}

}
