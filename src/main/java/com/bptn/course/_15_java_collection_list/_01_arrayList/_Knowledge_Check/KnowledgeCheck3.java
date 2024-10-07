package com.bptn.course._15_java_collection_list._01_arrayList._Knowledge_Check;

import java.util.*;

public class KnowledgeCheck3 {

    public static void main(String[] args) {
        ArrayList<String> names = new ArrayList<String>();
        String[] friends = {"Sam", "Jessica", "Mark", "Alexis"};

        //i < friends.length instead of i <= friends.length which will result in i being 4. This will result in IndexOutOfBoundException
        for (int i = 0; i < friends.length; i++) {
            names.add(friends[i]);
        }
        System.out.println(names);
    }
}






