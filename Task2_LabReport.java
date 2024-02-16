// ************************************************************ 
// File Name: Task2_LabReport
// Author: Charlie Tronrud
// Purpose:Write a program Task2_LabReport that prints the Labs completed for CISC230 so far. In which
//...each new lab adds one line.
// ************************************************************

import java.util.Scanner;

public class Task2_LabReport {
    public static void main(String[] args) {
        // Create a Scanner object to read input from the user
        Scanner input = new Scanner(System.in);

        // Prompt the user to enter the number of days
        System.out.print("How many days (1 to 7)? ");
        int numDays = input.nextInt();

        // Use a loop to print the lab report for each day
        for (int day = 1; day <= numDays; day++) {
            // Use a switch statement to print the appropriate suffix for the day number
            String suffix;
            switch (day) {
                case 1:
                    suffix = "st";
                    break;
                case 2:
                    suffix = "nd";
                    break;
                case 3:
                    suffix = "rd";
                    break;
                default:
                    suffix = "th";
                    break;
            }
            System.out.print("During the " + day + suffix + " week, we finished Lab related to\n");

            // Use a switch statement to print the labs completed for each week
            switch (day) {
                case 1:
                    System.out.println("Chapter 1 Introduction");
                    break;
                case 2:
                    System.out.println("Chapter 2 Data and Expression");
                    System.out.println("Chapter 1 Introduction");
                    break;
                case 3:
                    System.out.println("Chapter 3 Using Classes and Objects");
                    System.out.println("Chapter 2 Data and Expression");
                    System.out.println("Chapter 1 Introduction");
                    break;
                case 4:
                    System.out.println("Chapter 4 Writing Classes");
                    System.out.println("Chapter 3 Using Classes and Objects");
                    System.out.println("Chapter 2 Data and Expression");
                    System.out.println("Chapter 1 Introduction");
                    break;
                case 5:
                    System.out.println("Chapter 5 Conditionals and Loops");
                    System.out.println("Chapter 4 Writing Classes");
                    System.out.println("Chapter 3 Using Classes and Objects");
                    System.out.println("Chapter 2 Data and Expression");
                    System.out.println("Chapter 1 Introduction");
                    break;
                case 6:
                    System.out.println("GUI using JavaFX.");
                    System.out.println("Chapter 5 Conditionals and Loops");
                    System.out.println("Chapter 4 Writing Classes");
                    System.out.println("Chapter 3 Using Classes and Objects");
                    System.out.println("Chapter 2 Data and Expression");
                    System.out.println("Chapter 1 Introduction");
                    break;
                case 7:
                    System.out.println("Chapter 6 More Conditionals and Loops");
                    System.out.println("Chapter 5 Conditionals and Loops");
                    System.out.println("GUI using JavaFX.");
                    System.out.println("Chapter 4 Writing Classes");
                    System.out.println("Chapter 3 Using Classes and Objects");
                    System.out.println("Chapter 2 Data and Expression");
                    System.out.println("Chapter 1 Introduction");
                    break;
            }
            System.out.println();
        }
    }
}
