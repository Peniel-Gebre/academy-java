package com.bptn.course._15_java_collection_list._01_arrayList._coding34;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

//easy and straightforward approach
public class Main1 {

    public static void main(String[] args) {
        
        List<String> nameList = new ArrayList<String>();

        nameList.add("Robert");
        nameList.add("Samson");
        nameList.add("Alex");
        nameList.add("William");
        
        System.out.println("Elements of List: " + nameList);
        
        // Declare an array whose length is equal to size of the ArrayList
        
        String[] output = new String[nameList.size()];
        
        output = nameList.toArray(output);
        
        //print the elements in the array
        System.out.println("Elements of the array: " + Arrays.toString(output));

	}

}
