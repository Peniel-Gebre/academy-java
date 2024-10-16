package com.bptn.course._19_junit._search;

public class LinearSearch {

	
	static int linearSearch (int [] arr, int key) {
		int size = arr.length;
		
		for (int i=0; i<size; i++) {
			if (arr[i] == key) {
				return i;
			}
		}
		return -1;
	}
	public static void main(String[] args) {
		int[] input = {24, 2, 45, 20,56,75,2,56,99,53,12,999};
		
		int key = 99900;
		
		System.out.println(linearSearch(input, key));

	}

}
