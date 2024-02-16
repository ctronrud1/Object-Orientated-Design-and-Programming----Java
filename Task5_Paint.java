// ************************************************************
// File Name: Task5_Paint
//Author: Charlie Tronrud
// Fill in the missing statements so that the program does what it is supposed to do
// ************************************************************
	import java.util.Scanner;

	public class Task5_Paint {
	    public static void main(String[] args) {
	        final int COVERAGE = 350; // paint covers 350 sq ft/gal
	        
	        int length, width, height, numDoors, numWindows;
	        double totalSqFt, paintNeeded;
	        Scanner sc = new Scanner(System.in);
	        
	        //Prompt for and read in the length of the room
	        System.out.print("Enter the length of the room in feet: ");
	        length = sc.nextInt();
	        
	        //Prompt for and read in the width of the room
	        System.out.print("Enter the width of the room in feet: ");
	        width = sc.nextInt();
	        
	        //Prompt for and read in the height of the room
	        System.out.print("Enter the height of the room in feet: ");
	        height = sc.nextInt();
	        
	        //Compute the total square feet to be painted--think about the dimensions of each wall
	        totalSqFt = 2 * height * (length + width);
	        
	        //Prompt for and read in the number of doors in the room
	        System.out.print("Enter the number of doors in the room: ");
	        numDoors = sc.nextInt();
	        
	        //Prompt for and read in the number of windows in the room
	        System.out.print("Enter the number of windows in the room: ");
	        numWindows = sc.nextInt();
	        
	        //Calculate the square footage of doors and windows and subtract it from the total square footage
	        double doorSqFt = numDoors * 20;
	        double windowSqFt = numWindows * 15;
	        totalSqFt -= (doorSqFt + windowSqFt);
	        
	        //Compute the amount of paint needed
	        paintNeeded = totalSqFt / COVERAGE;
	        
	        //Print the length, width, and height of the room and the number of gallons of paint needed.
	        System.out.println("The room is " + length + " feet long, " + width + " feet wide, and " + height + " feet high.");
	        System.out.println("There are " + numDoors + " doors and " + numWindows + " windows.");
	        System.out.println("The total square footage to be painted is " + totalSqFt + " square feet.");
	        System.out.println("You will need " + paintNeeded + " gallons of paint.");
	        
	        
	    }
	}


