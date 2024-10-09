package com.bptn.course._15_java_collection_list._02_linkedList;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;

public class LinkedListExample {

	public static void main(String[] args) {
		
       LinkedList<String> colors = new LinkedList<>();
       
       //add elements to the list
       colors.addFirst("red");
       
       //add elements to the end of the list
       colors.addLast("green");
       
       System.out.println("LinkedList after adding colors: " + colors);
       
       //remove the first element from the list
       colors.remove(0);
       System.out.println("LinkedList after removing color: " + colors);
       
       //remove the last element from the list
       colors.removeLast();
       System.out.println("LinkedList after adding colors: " + colors);
       
       colors.add("blue");
       colors.add("green");
       colors.add("blue");
       colors.add("orange");
       colors.add("white");
       System.out.println("LinkedList after adding colors: " + colors);
       
       //remove an element from index 1
       colors.remove(1);
       System.out.println("LinkedList after removing element at index 1: " + colors);
       
       //add element at index 1
       colors.add(1, "purple");
       System.out.println("LinkedList after adding element at index 1: " + colors);
       
       //access an element
       System.out.println("LinkedList after accessing an element at index 2: " + colors.get(2));

//       colors.add(null);
//       System.out.println("Updated LinkedList : " + colors);
       
       //access elements in the LinkedList using a for loop
       for(int i=0; i<colors.size(); i++) {
       System.out.println(colors.get(i));
       }
       
       //access elements in the LinkedList using a for-each loop
       for(String element : colors) {
    	   System.out.println(element);
       }  
       
       System.out.println("Access the elements using Iterator");
       
       Iterator<String> it=colors.iterator();
       
       while (it.hasNext()) {
    	   
    	   System.out.println("Accessing next element using iterator: " + it.next());
       }
       
       //remove an element using iterator
       Iterator<String> iterator=colors.iterator();
       
       while(iterator.hasNext()) {
    	   String color = iterator.next();
    	   
    	   if(color.equals("purple")) {
    		   iterator.remove();
    		   System.out.println("The color is removed succesfuly");
    	   }
    	   		
       }
       
       System.out.println("LinkedList after adding color: " + colors);
       
       //add an element using ListIterator (sub interface of Iterator)
       ListIterator<String> listIterator = colors.listIterator();
       while(listIterator.hasNext()) {
    	   String color = listIterator.next();
    	   
    	   if(color.equals("orange")) {
    		   listIterator.add("black");
    		   System.out.println("The color is added succesfuly");
    	   }
    	   		
       }
       
       System.out.println("LinkedList after adding color: " + colors);
       
       }
       

	}

//1. can a LinkedList have duplicates - yes
//2. can a LinkedList preserve insertion - yes
//3. can a LinkedList have null values - yes

//4. can i remove an element from a collection while looping through it - yes, using iterator