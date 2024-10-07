package com.bptn.course._15_java_collection_list._01_arrayList;

import java.util.ArrayList;
import java.util.List;

public class ArrayListExample {

	public static void main(String[] args) {
		
		//1st way of declaring ArrayList
		//ArrayList<Integer> arrayList = new ArrayList<>();
		
		//2nd way of declaring ArrayList
		List<Integer> arrayList = new ArrayList<>();
		
		//Add values into
		arrayList.add(100);
		arrayList.add(200);
		arrayList.add(300);
		arrayList.add(300); //ArrayList allow duplicates
		arrayList.add(400);
		arrayList.add(null); //ArrayList allows null values
		arrayList.add(null); //ArrayList allows duplicate null values
		
		System.out.println(arrayList);
		
		//The size of the arrayList
		System.out.println("The size of arrayList: " + arrayList.size());
		
		//Access the first element
		
		System.out.println("The first element is: " + arrayList.get(0));
		
		//Update the element at index 2
		
		arrayList.set(2, 250);
		System.out.println("Updated ArrayList: " + arrayList);
		
		arrayList.set(5, 450);
		System.out.println("Updated ArrayList: " + arrayList);
		
		arrayList.add(7, 500); //add (int index, element E)
		System.out.println("Updated ArrayList: " + arrayList);
		
		//Remove an element
		System.out.println("The element removed is: " + arrayList.remove(4));
		
		//The size of the arrayList
		System.out.println("Updated ArrayList: " + arrayList.size());
		
		
		//Accessing the elements using traditional for-loop
		
		for(int i=0; i<arrayList.size(); i++) {
			System.out.println(arrayList.get(i));
		}
		
		//Accessing the elements using for-each loop
		for(Integer element: arrayList) {
			System.out.println(element);
		}
		

	}

}

//<> diamond operators -> Java Generics

//1. SOLID principle
//D -> Dependency inversion principle

//we need to rely on Abstraction rather than concrete implementation

//1. the first way of declaring is relying on concrete implementation which does not follow Dependency Inversion Principle

//2. the second way of declaring is relying on Abstraction which follows Dependency Inversion Principle

//3. ArrayList<Integer> arrayList = new ArrayList<>();
//The arrayList object has access to both List methods and 