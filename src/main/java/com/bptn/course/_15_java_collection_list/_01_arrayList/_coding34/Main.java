package com.bptn.course._15_java_collection_list._01_arrayList._coding34;

import java.util.ArrayList;
import java.util.List;
public class Main {

    public static void main(String[] args) {
        
       List<String> nameList = new ArrayList<String>();

       nameList.add("Robert");
       nameList.add("Samson");
       nameList.add("Alex");
       nameList.add("William");
       
       System.out.println("Elements of List: " + nameList);

       // Create an array of String named output of the same size as nameList.
       // Hint: use the size() method. 
       
       String[] output = new String[nameList.size()];
        
       // Fetch the elements from the nameList and insert them into the newly created array.
       // Hint: Use the get() method to fetch the elements from the arraylist
       for(int i=0; i<nameList.size(); i++) {
    	   output[i] = nameList.get(i);
       }
       
       
      
        System.out.print("Elements of Array: ");
        for (int i = 0 ; i < output.length ; i++){
            System.out.print(output[i] + "  ");
        }

    }
}

//string[] output = new String[s]
//String[] output = {"Hello", "World", "Java"}

//i=0, output[0] = "Robert"
//i=1, output[0] = "Samson"
//i=2, output[0] = "Alex"