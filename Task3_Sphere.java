// ************************************************************ 
// File Name: Task3_Sphere
// Author: Charlie Tronrud
// Purpose:	Write a program that reads the radius of a sphere and prints its volume and surface area.
// ************************************************************ 
import java.util.Scanner;

public class Task3_Sphere {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the radius of the sphere: ");
        double radius = scanner.nextDouble();

        // Calculate the volume of the sphere using the formula 
        double volume = (4.0 / 3.0) * Math.PI * Math.pow(radius, 3);

        // Calculate the surface area of the sphere using the formula 
        double surfaceArea = 4.0 * Math.PI * Math.pow(radius, 2);

        // Print the calculated volume to four decimal places using the String.format method
        System.out.println("Volume: " + String.format("%.4f", volume));

        // Print the calculated surface area to four decimal places using the String.format method
        System.out.println("Surface Area: " + String.format("%.4f", surfaceArea));

        scanner.close();
    }
}
