// ************************************************************ 
// File Name: Task2
// Author: Charlie Tronrud
// Purpose: Write a program Task2_CirclePoint that prompts the user to enter a point (x, y) and checks whether the point is within the circle 
// ************************************************************
import java.util.Scanner;

public class Task2_CirclePoint {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // prompt the user for a point
        System.out.print("Enter a point (x, y): ");
        double x = input.nextDouble();
        double y = input.nextDouble();

        // calculate the distance from the point to the origin
        double distance = Math.sqrt(x * x + y * y);

        // check if the point is inside the circle
        if (distance <= 10) {
            System.out.println("(" + x + ", " + y + ") is inside the circle.");
        } else {
            System.out.println("(" + x + ", " + y + ") is outside the circle.");
        }
    }
}
