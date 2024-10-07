package com.bptn.course._15_java_collection_list._01_arrayList._coding33;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

//easy and straightforward approach without using for loop ar methods
public class Main1 {

	public static void main(String[] args) {
		
		String [] cars = {"Volvo","Honda","Ford"};

        List<String> newList = new ArrayList<>(Arrays.asList(cars));
        
        System.out.println("The converted arraylist is: " + newList);

	}

}
