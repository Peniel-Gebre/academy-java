package com.bptn.course._00_java_practice._10_polymorphism;

public class Greeter {

	public String greet() {
		return "Hi";
	}

	public static void main(String[] args) {
		Greeter g1 = new Greeter();
		System.out.println(g1.greet());
		Greeter g2 = new MeanGreeter();
		System.out.println(g2.greet());

		// Create a SpanishGreeter object and test it here

		class SpanishGreeter extends Greeter {
			
			@Override
			public String greet() {
				return "Hola!";
			}
		}

		SpanishGreeter sg = new SpanishGreeter();
		System.out.println(sg.greet());
	}
}

class MeanGreeter extends Greeter {

	@Override
	public String greet() {
		return "Go Away";
	}
}