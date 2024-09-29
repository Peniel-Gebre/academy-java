package com.bptn.course;

public class test {

}

String[] names = {"Jamal", "Emily", "Destiny", "Mateo", "Sofia"};

int index = 1;
System.out.println(names[index]);                  
// Output: 
Emily


System.out.println(names[index-1]);               
// Output: 
Jamal


index++;
System.out.println(names[index]);                  
// Output: 
Destiny


index--;
System.out.println(names[index]);                  
// Output: 
Emily


System.out.println(names[names.length-1]);        
// Output: 
Sofia
