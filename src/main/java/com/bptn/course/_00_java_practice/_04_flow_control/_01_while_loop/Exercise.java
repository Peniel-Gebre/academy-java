package com.bptn.course._00_java_practice._04_flow_control._01_while_loop;

public class Exercise {

	public static void main(String[] args) {
		int count = 1;
		while (count <= 10) {
		
		    count *= 2;
		}
		count = count - 10;
		System.out.println(count);
	}
}