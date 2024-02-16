// ************************************************************ 
// File Name: Task6_Wrapper
// Author: Charlie Tronrud
// Purpose:	Write a program that uses the constants and methods of the Integer class to perform the given tasks
// ************************************************************ 
import java.util.Scanner;

public class Task6_WrapperClass {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        // Task 1
        System.out.print("Enter an integer: ");
        int num = scan.nextInt(); // Read integer from user input
        // Print the binary, octal, and hexadecimal representations of the integer
        System.out.println("Binary: " + Integer.toBinaryString(num));
        System.out.println("Octal: " + Integer.toOctalString(num));
        System.out.println("Hexadecimal: " + Integer.toHexString(num));
        
        // Task 2
        // Print the maximum and minimum possible integer values in Java
        System.out.println("Maximum possible Java integer value: " + Integer.MAX_VALUE);
        System.out.println("Minimum possible Java integer value: " + Integer.MIN_VALUE);
        
        // Task 3
        System.out.print("Enter two decimal integers, one per line: ");
        String str1 = scan.next(); // Read first decimal integer from user input
        String str2 = scan.next(); // Read second decimal integer from user input
        int num1 = Integer.parseInt(str1); // Convert first decimal string to integer
        int num2 = Integer.parseInt(str2); // Convert second decimal string to integer
        int sum = num1 + num2; // Compute the sum of the two integers
        System.out.println("Sum of the two integers: " + sum);
        
        scan.close();
    }
}
