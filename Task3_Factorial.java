// ************************************************************ 
// File Name: Task3
// Author: Charlie Tronrud
// Purpose: Write a program Task3_Factorial.java that asks the user for an integer and computes and prints the factorial of that integer
// ************************************************************
import java.util.Scanner;

public class Task3_Factorial {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int n = -1;
        int factorial = 1;
        int i = 1;
        
        while (n < 0) {
            System.out.println("Enter a nonnegative integer:");
            n = input.nextInt();

            if (n < 0) {
                System.out.println("Error: a nonnegative number is required.");
            }
        }

        while (i <= n) {
            factorial *= i;
            i++;
        }

        System.out.println(n + "! = " + factorial);
    }
}
