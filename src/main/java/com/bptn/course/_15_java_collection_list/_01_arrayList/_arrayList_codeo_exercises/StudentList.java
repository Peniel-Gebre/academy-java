package com.bptn.course._15_java_collection_list._01_arrayList._arrayList_codeo_exercises;

import java.util.*;

public class StudentList {
   
	// main method for testing
   public static void main(String[] args) {
     
	   ArrayList<Student> roster = new ArrayList<Student>();
      roster.add(new Student("Skyler", "skyler@sky.com", 323171));
      
      // add your code here
      
      Student s2= new Student("Ayanna","ayanna@gmail.com",789012);
      roster.add(s2); //added the second student  into the ArrayList
      System.out.println(roster);
   }
 }


