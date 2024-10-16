package com.bptn.course._19_junit._junit_books;

public class Textbook extends Book {
    // Define private instance variable for edition
    private int edition;

    // Constructor with title, price, and edition as parameters
    public Textbook(String title, double price, int edition) {
        // Call superclass constructor to initialize title and price
        super(title, price);
        // Initialize edition
        this.edition = edition;
    }

    // Override getBookInfo method to include edition in the result
    @Override
    public String getBookInfo() {
        // Call the superclass getBookInfo and add the edition
        return super.getBookInfo() + "-" + edition;
    }

    // Getter for edition
    public int getEdition() {
        return edition;
    }

    // Method to check if the textbook can substitute for another
    public boolean canSubstituteFor(Textbook other) {
        // Check both edition and title to determine if substitution is possible
        return this.edition >= other.getEdition() && this.getTitle().equals(other.getTitle());
    }
}
