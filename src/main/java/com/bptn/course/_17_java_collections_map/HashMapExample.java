package com.bptn.course._17_java_collections_map;

import java.util.HashMap;
import java.util.Map;

public class HashMapExample {

	public static void main(String[] args) {
		
		// create an object
        Map <String, Integer> hashMap = new HashMap<>();
		
        //k -> key
        //v -> value
	    hashMap.put("Angie", 33);
	    hashMap.put("Steve", 34);
	    hashMap.put("John", 35);
	    hashMap.put("Angie", 32);
	    hashMap.put("Jane", 34);
	    hashMap.put("Jane", 34);
	    hashMap.put("Peniel", 33);
	    
	    //keys allow 1 null value
	    hashMap.put(null, 33);
	    
	    //values allow multiple null values
	    hashMap.put("Peniel", null);
	    hashMap.put("Pen", null);
	    
	    System.out.println(hashMap);
	    
	    //keyset() -> return Set view of the keys
	    //get(objecty k) -> return the value
	    
	    for(String key: hashMap.keySet()) {
	    	System.out.println("Name: " + key + " Age: " + hashMap.get(key));
	    	
	    }
	    
	    //retrieve the age of John and print it to the console
	    
	    System.out.println("Age of John is: " + hashMap.get("John"));
	    
	    //update a value of existing key
	    hashMap.replace("Peniel", 34);
	    System.out.println("New age of Peniel is: " + hashMap.replace("Peniel", 34));
	    
	    //check if the key is present using containsKey(object k) method
	    
	    if(hashMap.containsKey("Jane")) {
	    	System.out.println("The key is existing in the map");
	    	
	    }
	    else {
	    	System.out.println("The key is not existing in the map");
	    }
	    
	    //Check if a value is present in the map using containsValue(object v) method
	    if(hashMap.containsValue(34)) {
	    	System.out.println("The Value is existing in the map");
	    	
	    }
	    else {
	    	System.out.println("The Value is not existing in the map");
	    }
	    
	    //putIfAbsent (object v) is used to add a key-value pair if a key does not
	    hashMap.putIfAbsent("Claire", 70);
	    System.out.println(hashMap);
	    
	    //Iteration through the HashMap using entrySet() method
	    for(Map.Entry<String, Integer> entry: hashMap.entrySet()) {
	    	System.out.println("Name: " + entry.getKey() + " Age: " + entry.getValue());
	    }

	}

}


//Major key takeaways:

//1. Does it preserve Insertion Order? - No
//2. Does key allow null value? Yes, but only 1 null value similar to a set
//3. Does value allow null value? Yes, it can have multiple null value similar to a list
//4. Does keys allow duplicates - if we try to add a key once again, it overrides the value rather than creating a new <k,v> pair
//5. Does values allow duplicates - Yes
