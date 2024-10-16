package com.bptn.course._00_java_practice._10_polymorphism;

public class GreeterOverloading {
    
	   public String greet() {
	      return "Hi";
	   }
       
	   //overloading method
	   public String greet(String who) {
	      return "Hello " + who;
	   }
	   
	   public static void main(String[] args) {
	      GreeterOverloading g1 = new GreeterOverloading();
	      System.out.println(g1.greet("Sam"));
	      GreeterOverloading g2 = new MeanGreeter2();
	      System.out.println(g2.greet("Nimish"));
	   }
	}


class MeanGreeter2 extends GreeterOverloading {
	   
//	   @Override
//	   public String greet() {
//	   }

	   // Fill in the code below to Override the greet(String who) method
	   @Override
	   public String greet(String who) {
		      return "Go away " + who;
		   }
	   
	}