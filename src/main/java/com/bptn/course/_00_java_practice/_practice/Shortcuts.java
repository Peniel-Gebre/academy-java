package com.bptn.course._00_java_practice._practice;

public class Shortcuts {

	private String name;
	private int age;

	// auto generate constructors -> click on private section - right click -
	// source - generate constructors using fields
	public Shortcuts(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}

	// auto generate getters and setters -> click on private section - right click -
	// source - generate getters and setters
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	// main control + shift
	public static void main(String[] args) {

		// sysout ctrl + space
		System.out.println();

		// for uppercase command+shift+x
		System.out.println("HELLO WORLD");

		// for lowercase command+shift+y
		System.out.println("hello world");
		
		//formatting -> select all - command+shift+f
		
		//imports ->  command+shift+O

	}

}
