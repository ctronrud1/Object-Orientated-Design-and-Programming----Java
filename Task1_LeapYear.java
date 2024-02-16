// ************************************************************ 
// File Name: Task1
// Author: Charlie Tronrud
// Purpose: Write a program Task1_LeapYear.java that reads an integer value from the user representing a year
// ************************************************************

import java.util.Scanner;

public class Task1_LeapYear {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // prompt the user for a year
        System.out.print("Enter a year (>= 1582): ");
        int year = input.nextInt();

        // check if the year is valid
        if (year < 1582) {
            System.out.println("Error: Year must be at least 1582.");
            return;
        }

        // check if the year is a leap year
        boolean isLeapYear = false;
        if (year % 4 == 0) {
            if (year % 100 == 0) {
                if (year % 400 == 0) {
                    isLeapYear = true;
                }
            } else {
                isLeapYear = true;
            }
        }

        // print the result
        if (isLeapYear) {
            System.out.println(year + " is a leap year.");
        } else {
            System.out.println(year + " is not a leap year.");
        }
    }
}
