// ************************************************************ 
// File Name: Task4_VowelCount
// Author: Charlie Tronrud
// Purpose:Write a program Task4_VowelCount.java that reads a string from the user, then determines and
//...prints how many of each lowercase vowel (a, e, i, o, and u) appear in the entire string
// ************************************************************
import java.util.Scanner;

public class Task4_VowelCount {
    public static void main(String[] args) {
        // Create a Scanner object to read user input
        Scanner input = new Scanner(System.in);

        // Prompt the user to enter a string
        System.out.print("Enter a string: ");

        // Read the input string entered by the user
        String str = input.nextLine();

        // Initialize variables to count vowels and non-vowels
        int aCount = 0, eCount = 0, iCount = 0, oCount = 0, uCount = 0, nonVowelCount = 0;

        // Loop through each character in the input string
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);

            // Increment the count for each vowel found
            if (ch == 'a') {
                aCount++;
            } else if (ch == 'e') {
                eCount++;
            } else if (ch == 'i') {
                iCount++;
            } else if (ch == 'o') {
                oCount++;
            } else if (ch == 'u') {
                uCount++;
            } else if (Character.isLetter(ch)) {
                // Increment the count for non-vowel characters
                nonVowelCount++;
            }
        }

        // Print the count of each vowel and non-vowel character
        System.out.println("Number of 'a' characters: " + aCount);
        System.out.println("Number of 'e' characters: " + eCount);
        System.out.println("Number of 'i' characters: " + iCount);
        System.out.println("Number of 'o' characters: " + oCount);
        System.out.println("Number of 'u' characters: " + uCount);
        System.out.println("Number of non-vowel characters: " + nonVowelCount);
    }
}
