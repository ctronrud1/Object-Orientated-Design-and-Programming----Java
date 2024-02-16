// ************************************************************ 
// File Name: Task5_Factorials
// Author: Charlie Tronrud
// Purpose: Task5 contains a program that calls the factorial method of the MathUtils class to compute the factorials of integers entered by the user
// ************************************************************
import java.util.Scanner;

public class Task5_Factorials {
    public static void main(String[] args) {
        String keepGoing = "y";
        Scanner scan = new Scanner(System.in);

        while (keepGoing.equalsIgnoreCase("y")) {
            try {
                System.out.print("Enter an integer: ");
                int val = scan.nextInt();

                System.out.println("Factorial(" + val + ") = " + factorial(val));
            } catch (IllegalArgumentException e) {
                System.out.println(e.getMessage());
            }

            System.out.print("Another factorial? (y/n) ");
            keepGoing = scan.next();
        }
    }

    public static int factorial(int n) {
        if (n < 0) {
            throw new IllegalArgumentException("Factorial is not defined for negative integers.");
        } else if (n > 16) {
            throw new IllegalArgumentException("Factorial is not defined for values greater than 16.");
        }

        int result = 1;

        for (int i = 1; i <= n; i++) {
            result *= i;
        }

        return result;
    }
}
