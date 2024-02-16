// ************************************************************ 
// File Name: Task2_ReverseArray
// Author: Charlie Tronrud
// Purpose: Write a program Task2_ReverseArray.java that prompts the user for an integer, then asks the user
//...to enter that many values. Store these values in an array and print the array. 
// ************************************************************
import java.util.Scanner;

public class Task2_ReverseArray {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Enter the number of values: ");
        int numValues = scan.nextInt();

        int[] values = new int[numValues];

        // Input values
        for (int i = 0; i < values.length; i++) {
            System.out.print("Enter value " + (i + 1) + ": ");
            values[i] = scan.nextInt();
        }

        // Print original array
        System.out.println("\nOriginal array:");
        for (int value : values) {
            System.out.print(value + " ");
        }

        // Reverse array
        for (int i = 0; i < values.length / 2; i++) {
            int temp = values[i];
            values[i] = values[values.length - 1 - i];
            values[values.length - 1 - i] = temp;
        }

        // Print reversed array
        System.out.println("\nReversed array:");
        for (int value : values) {
            System.out.print(value + " ");
        }
    }
}
