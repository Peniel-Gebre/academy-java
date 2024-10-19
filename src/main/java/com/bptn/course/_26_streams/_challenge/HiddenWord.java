package com.bptn.course._26_streams._challenge;

public class HiddenWord {

    /** The hidden word that the player is trying to guess */
    private String hiddenWord;

    /** Constructor to initialize the hidden word */
    public HiddenWord(String word) {
        hiddenWord = word;
    }

    /** 
     * Method to get a hint based on the player's guess.
     * It returns a string hint based on the comparison with the hidden word.
     */
    public String getHint(String guess) {
        StringBuilder hint = new StringBuilder(); // StringBuilder to build the hint
        boolean[] matched = new boolean[hiddenWord.length()]; // Track matched letters for '+' signs
        
        // First pass: Check for correct position letters
        for (int i = 0; i < hiddenWord.length(); i++) {
            if (guess.charAt(i) == hiddenWord.charAt(i)) {
                hint.append(guess.charAt(i)); // Correct letter and position
                matched[i] = true; // Mark this letter as matched
            } else {
                hint.append('*'); // Default to '*' for now
            }
        }

        // Second pass: Check for misplaced letters
        for (int i = 0; i < hiddenWord.length(); i++) {
            char guessChar = guess.charAt(i);
            if (hint.charAt(i) == '*') { // Only consider unmatched positions
                for (int j = 0; j < hiddenWord.length(); j++) {
                    // Check if the letter is in the hidden word and not already matched
                    if (!matched[j] && guessChar == hiddenWord.charAt(j)) {
                        hint.setCharAt(i, '+'); // Replace '*' with '+'
                        matched[j] = true; // Mark this letter as matched
                        break; // Stop searching for this character
                    }
                }
            }
        }

        return hint.toString(); // Return the final hint as a string
    }

    /** This is a main method for testing the class */
    public static void main(String[] args) {
        HiddenWord puzzle = new HiddenWord("HARPS");
        System.out.println(puzzle.getHint("AAAAA") + " it should print +A+++");
        System.out.println(puzzle.getHint("HELLO") + " it should print H****");
        System.out.println(puzzle.getHint("HEART") + " it should print H*++*");
        System.out.println(puzzle.getHint("HARMS") + " it should print HAR*S");
        System.out.println(puzzle.getHint("HARPS") + " it should print HARPS");
    } // end of main

} // end of class
