// ************************************************************
// File Name: Task4_CircleUpdated.java
//Author: Charlie Tronrud
// Write an interactive version of the Circle.java. 
//Ask the user to provide radius and then you will double the the radius and complete the task 
// ************************************************************
import java.util.Scanner;

	public class Task4_CircleUpdated {
	    public static void main(String[] args)
	  {
	        final double PI = 3.14159;

	        Scanner scanner = new Scanner(System.in);

	        System.out.print("Enter the radius of the circle: ");
	        int radius = scanner.nextInt();

	        double area = PI * radius * radius;
	        double circumference = 2 * PI * radius;

	        System.out.println("The area of a circle with radius " + radius + " is " + area);
	        System.out.println("The circumference of a circle with radius " + radius + " is " + circumference);
	        
	        radius *= 2; // double the radius
	        area = PI * radius * radius;
	        circumference = 2 * PI * radius;

	        System.out.println("The area of a circle with radius " + radius + " is " + area);
	        System.out.println("The circumference of a circle with radius " + radius + " is " + circumference);
	       
	        
	    }
	}


