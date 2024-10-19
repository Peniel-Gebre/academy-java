package com.bptn.course._26_streams;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class StringFilterExercise {

	public static void main(String[] args) {
		// Declare and initialize a list of strings
		List<String> list = new ArrayList<>(Arrays.asList("apple", "banana", "cherry", "date", "elderberry"));

		// perform filter operation
		// filter the strings that has letter e
		list.stream()
			.filter((element)-> element.contains("e"))
			.forEach(System.out :: println);

		

	}

}

//1. filter() method has a predicate which is a functional interface and SAM boolean test(T t)
//2. forEach() method has a consumer which is a functional interface and SAM void accept(T t)
//3. filter() is an intermediate operation and forEach is a terminal operation