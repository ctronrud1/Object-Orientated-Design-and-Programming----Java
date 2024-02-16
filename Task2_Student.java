// ************************************************************ 
// File Name: Task2_Student
// Author: Charlie Tronrud
// Purpose: Write a program to keep track of grades for students. Each student will be described by three pieces of data: 
//...their name, their score on test #1, and their score on test#2. 
// ************************************************************
import java.util.Scanner;

public class Task2_Student {

    // Instance variables
    private String name;
    private int test1;
    private int test2;

    // Constructor
    public Task2_Student(String studentName) {
        name = studentName;
    }

    // Method to input grades for the student
    public void inputGrades() {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter " + name + "'s score for test1: ");
        test1 = scan.nextInt();
        System.out.print("Enter " + name + "'s score for test2: ");
        test2 = scan.nextInt();
    }

    // Method to get the average test score for the student
    public double getAverage() {
        return (test1 + test2) / 2.0;
    }

    // Method to get the student's name
    public String getName() {
        return name;
    }

    // Method to return a string representation of the student object
    public String toString() {
        return "Name: " + name + " Test1: " + test1 + " Test2: " + test2;
       
    }
}

