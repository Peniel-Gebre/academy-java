package com.bptn.course._big_coding_4._big_coding_44;

//Import all necessary packages here
import java.util.List;
import java.util.ArrayList;
import java.util.Map;
import java.util.stream.Collectors;

public class ListToMap {

	// create static method "convertStudentListToMap"
	public static Map<Integer, Student> convertStudentListToMap(List<Student> students) {

		// Convert the list of students to a map using Java Streams and Collectors.toMap
		return students.stream() // Convert the list to a stream of students
				.collect(Collectors.toMap( // Collect elements of the stream into a map
						Student::getId, // Key: use the student's id as the map key
						student -> student // Value: map each student object to itself
				));
	}

	// Complete the main method
	public static void main(String[] args) {

		// Create a list of students
		List<Student> students = new ArrayList<>(); // Initializing a new ArrayList for Student objects

		// add student objects to this list
		students.add(new Student(1, "Alice", 20)); // Adding student Alice
		students.add(new Student(2, "Bob", 22)); // Adding student Bob
		students.add(new Student(3, "Charlie", 21)); // Adding student Charlie

		// Call "convertStudentListToMap" method and hold the returned value in
		// "studentMap" variable.
		Map<Integer, Student> studentMap = convertStudentListToMap(students);

		// Print the map
		System.out.println(studentMap);
	}
}

//ListToMap Class:
//  - convertStudentListToMap Method:
//  - This method takes a list of Student objects as input and converts it to a "Map<Integer, Student>", where the student's ID is used as the key and the Student object itself is the value.
//  - The method uses Java Streams to first create a stream of Student objects, then "Collectors.toMap" to create a map. The lambda expression "student -> student" maps each student object to itself.
//
//Main Method:
//  - students List: A list of Student objects is created and populated with three students: Alice, Bob, and Charlie.
//  - convertStudentListToMap Call: The method "convertStudentListToMap" is called with the list of students, and the resulting map is stored in the "studentMap" variable.
//  - Printing the Map: The "studentMap" is printed, displaying a mapping of student IDs to student objects.
//
//- In future tasks, I will remember the usefulness of streams for transforming collections into other forms.
