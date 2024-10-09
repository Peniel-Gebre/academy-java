package com.bptn.course._16_java_collection_set;

import java.util.HashSet;
import java.util.Set;

public class HashSetExample {

	public static void main(String[] args) {
		
		//create an object of HashSet
		
		Set<String> hashSet  = new HashSet<>();
		
		hashSet.add("apple");
		hashSet.add("banana");
		hashSet.add("cherry");
		hashSet.add("mango");
		hashSet.add("apple"); //it allows duplicates? No
		hashSet.add(null); //It allows null value? Yes, but only one null value
		
		System.out.println("The hashSet of fruits: " + hashSet);

	}

}


//Major key takeaways;

//1. Insertion Order - No
//2. It allows null value? Yes, but only one null value
//3. It allows duplicates - No
//4. underlying implementation - Hash Table
//5. Is HashSet indexed? - No

