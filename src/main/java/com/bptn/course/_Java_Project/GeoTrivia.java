package com.bptn.course._Java_Project;

import java.util.*;

	public class GeoTrivia {

	    private static Map<String, String> countryCapitalMap;
	    
	    public static void main(String[] args) {
	        initializeData();
	        startQuiz();
	    }

	    private static void initializeData() {
	        countryCapitalMap = new HashMap<>();
	        countryCapitalMap.put("France", "Paris");
	        countryCapitalMap.put("Japan", "Tokyo");
	        countryCapitalMap.put("Ethiopia", "Addis Ababa");
	        countryCapitalMap.put("Kenya", "Nairobi");
	        countryCapitalMap.put("Sudan", "Khartoum");
	        countryCapitalMap.put("Eritria", "Asmara");
	        countryCapitalMap.put("Djibouti", "Djibouti");
	        countryCapitalMap.put("Somalia", "Mogadishu");
	        countryCapitalMap.put("South Sudan", "Juba");
	        countryCapitalMap.put("Canada", "Ottawa");
	        countryCapitalMap.put("USA", "Washington DC");
	        countryCapitalMap.put("India", "New Delhi");
	        // Add more countries and capitals
	    }

	    private static void startQuiz() {
	        Scanner scanner = new Scanner(System.in);
	        Random random = new Random();
	        List<String> countries = new ArrayList<>(countryCapitalMap.keySet());
	        
	        // Randomly select a country for quiz question
	        String randomCountry = countries.get(random.nextInt(countries.size()));
	        
	        System.out.println("What is the capital of " + randomCountry + "?");
	        String userAnswer = scanner.nextLine();
	        
	        if (userAnswer.equalsIgnoreCase(countryCapitalMap.get(randomCountry))) {
	            System.out.println("Great job! The Capital City of " + randomCountry + " is: " + countryCapitalMap.get(randomCountry));
	        } else {
	            System.out.println("Keep trying! You’ll get it next time! The Capital City of " + randomCountry + " is: " + countryCapitalMap.get(randomCountry));
	        }
	        
	        scanner.close();
	    }
	}