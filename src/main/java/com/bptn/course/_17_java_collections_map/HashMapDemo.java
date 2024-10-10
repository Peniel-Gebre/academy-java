package com.bptn.course._17_java_collections_map;

import java.util.HashMap;

public class HashMapDemo {

	public static void main(String[] args) {
		
		HashMap<String, Integer> people = new HashMap<>();
		
		//add keys and values
		people.put("Angie", 33);
		people.put("Steve", 30);
		people.put("John", 32);
		
		for(String key: people.keySet()) {
			
			System.out.println("Name: " + key + ", Age: " + people.get(key));
		}

	}

}
