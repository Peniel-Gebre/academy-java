package com.bptn.course._16_java_collection_set;

import java.util.Set;
import java.util.TreeSet;

public class TreeSetExample {

	public static void main(String[] args) {

		//create treeSet object
		Set<String> treeSet = new TreeSet <>();
		
		treeSet.add("apple");
		treeSet.add("pine apple");
		treeSet.add("cherry");
		treeSet.add("mango");
		treeSet.add("apple"); //it allows duplicates? No
		//treeSet.add(null); //It allows null value? It does not allow null value - throws null pointer exception
		
		
		System.out.println("The treeSet of fruits: " + treeSet);

	}

}


//1. Insertion Order - Natural Ascending order
//2. It allows null value? It does not allow null value - throws null pointer exception
//3. It allows duplicates - no
//4. underlying implementation - HashTable and Doubly linked list
//5. Is it indexed? - No
