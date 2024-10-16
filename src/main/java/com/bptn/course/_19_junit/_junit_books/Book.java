package com.bptn.course._19_junit._junit_books;

public class Book {
    // Define private instance variables
    private String title;
    private double price;

    // Constructor with title and price as parameters
    public Book(String title, double price) {
        this.title = title;
        this.price = price;
    }

    // Getter for title
    public String getTitle() {
        return title;
    }

    // Method to return book information as a string
    public String getBookInfo() {
        return title + "-" + price;
    }
}
