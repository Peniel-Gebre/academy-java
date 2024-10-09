package com.bptn.course._16_java_collection_set;

import java.util.LinkedHashSet;
import java.util.Set;

public class LinkedHashSetExample {

	public static void main(String[] args) {
		
		//create LinkedHashSet object
		Set<String> linkedHashSet = new LinkedHashSet <>();
		
		linkedHashSet.add("apple");
		linkedHashSet.add("banana");
		linkedHashSet.add("cherry");
		linkedHashSet.add("mango");
		linkedHashSet.add("apple"); //it allows duplicates? No
		linkedHashSet.add(null); //It allows null value? Yes, but only one null value
		
		
		System.out.println("The LinkedHashSet of fruits: " + linkedHashSet);

	}

}


//1. Insertion Order - Yes
//2. It allows null value? It allows max 1 null value
//3. It allows duplicates - no
//4. underlying implementation - HashTable and Doubly linked list
//5. Is it indexed? - No
