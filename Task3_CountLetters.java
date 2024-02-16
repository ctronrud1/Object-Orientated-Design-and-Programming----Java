// ************************************************************ 
// File Name: Task3_CountLetters
// Author: Charlie Tronrud
// Purpose: Task3 contains a Java program that provides menu-driven testing for the IntegerList class.
// ************************************************************
import java.util.Scanner;

public class Task3_CountLetters {
    public static void main(String[] args) {
        int[] counts = new int[26];
        Scanner scan = new Scanner(System.in);
        
        // Get word from user
        System.out.print("Enter a single word (letters only, please): ");
        String word = scan.nextLine();
        
        // Convert to all upper case
        word = word.toUpperCase();
        
        // Count frequency of each letter in string
        for (int i = 0; i < word.length(); i++) {
            try {
                counts[word.charAt(i) - 'A']++;
            } catch (ArrayIndexOutOfBoundsException e) {
                System.out.println("Not a letter: " + word.charAt(i));
            }
        }
        
        // Print frequencies
        System.out.println();
        for (int i = 0; i < counts.length; i++) {
            if (counts[i] != 0) {
                System.out.println((char) (i + 'A') + ": " + counts[i]);
            }
        }
    }
}
