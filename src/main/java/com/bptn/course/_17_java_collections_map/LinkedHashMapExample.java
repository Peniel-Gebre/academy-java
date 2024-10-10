package com.bptn.course._17_java_collections_map;

import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;

public class LinkedHashMapExample {

	public static void main(String[] args) {
		
		
		LinkedHashMap<String, Integer> linkedHashMap = new LinkedHashMap<>();
		
		linkedHashMap.put("Angie", 33);
		linkedHashMap.put("Steve", 34);
		linkedHashMap.put("John", 35);
		linkedHashMap.put("Angie", 32);
		linkedHashMap.put(null, 32);
		linkedHashMap.put(null, 62);
		linkedHashMap.put(null, null);
		linkedHashMap.put("Peniel", null);
		linkedHashMap.put("Pen", null);
		
		System.out.println(linkedHashMap);
		
		//access the value in linkedHashMap
		System.out.println("John's age: " + linkedHashMap.get("John"));
		
		//loop over the LinkedHashMap using entrySet() method
		 for(Map.Entry<String, Integer> entry: linkedHashMap.entrySet()) {
		    	System.out.println("Name: " + entry.getKey() + " Age: " + entry.getValue());
		    	
		//access the map using iterator
		Iterator<Map.Entry<String, Integer>> it =  linkedHashMap.entrySet().iterator();
		
        while(it.hasNext()) {
			
			Map.Entry<String, Integer> entry1= it.next();
			
			System.out.println("Name: "+ entry1.getKey() + " Age: "+ entry1.getValue());
		}


	}
	}
}



//Major key takeaways:

//1. Does it preserve Insertion Order? - Yes
//2. Does key allow null value? Yes, but only 1 null value similar to a set
//3. Does value allow null value? Yes, it can have multiple null value similar to a list
//4. Does keys allow duplicates - if we try to add a key once again, it overrides the first 
//value rather than creating a new <k,v> pair and maintains the order of the first key-value
//5. Does values allow duplicates - Yes