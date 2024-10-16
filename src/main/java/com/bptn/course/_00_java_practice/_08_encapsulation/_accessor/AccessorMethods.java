package com.bptn.course._00_java_practice._08_encapsulation._accessor;

public class AccessorMethods {

	// Instance variable declaration with the key word encapsulating the instance
	// variable
	// private typeOfVar varName;

	private String name = "Peniel";

	// Accessor (getter) method template to access the encapsulated instance
	// variable
	// public typeOfVar getVarName() {

	public String getName() {
		return name;
	}

	// main method
	public static void main(String[] args) {

		// To call a get method, use objectName.getVarName()

		AccessorMethods peniel = new AccessorMethods();
		System.out.println("Name: " + peniel.getName());
	}
}
