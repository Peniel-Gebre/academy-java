package com.bptn.course._17_java_collections_map;

import java.util.TreeMap;

public class TreeMapExample {

	public static void main(String[] args) {
	
	//declare an object for TreeMap
		
		TreeMap <String, Integer> treeMap = new TreeMap<>();
		
		treeMap.put("Angie", 33);
	    treeMap.put("Steve", 34);
	    treeMap.put("John", 35);
	    treeMap.put("Angie", 32);
	    treeMap.put("Jane", 34);
	    treeMap.put("Jane", 35);
	    treeMap.put("Jose", null);
	    treeMap.put("Jonah", null);
	    
	    //No null  key -> it will throw null pointer exception
	    
	    System.out.println(treeMap);
	    
	    //access
	    System.out.println("Angie's age is: " + treeMap.get("Angie"));
	    
	    System.out.println("Get the first key of the map: " + treeMap.firstKey());
	    
	    System.out.println("Get the first key of the map: " + treeMap.firstEntry());

	}

}


//Major key takeaways:

//1. Does it preserve Insertion Order? - No but follows alphabetical order
//2. Does key allow null value? No
//3. Does value allow null value? Yes, it can have multiple null value similar to a list
//4. Does keys allow duplicates - No -> if we try to add a key once again, it overrides the value rather than creating a new <k,v> pair
//5. Does values allow duplicates - Yes
