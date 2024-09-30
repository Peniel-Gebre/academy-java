package com.bptn.course._ExpressionandAssignments;

public class Debbuging {

	   public static void main(String[] args) {
		     int h = 3;
		     int w = 5;
		     System.out.println(h);  //3
		     System.out.println(w);  //5
		     h = w;
		     w = h;
		     System.out.println(h);  //expected 5
		     System.out.println(w);  //expected 3
		   }
		}