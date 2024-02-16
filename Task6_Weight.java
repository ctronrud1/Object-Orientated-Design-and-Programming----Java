// ************************************************************
// File Name: Task6_Weight
//Author: Charlie Tronrud
// Compute  the  ideal  weight  for  both  males  and  females over 5 ft tall
// ************************************************************
	import java.util.Scanner;

	public class Task6_Weight {
	    public static void main(String[] args) 
	    {
	        // Declare variables
	        int heightFeet, heightInches, totalHeightInches;
	        double idealWeightFemale, idealWeightMale;

	        // Get input from user
	        Scanner input = new Scanner(System.in);
	        System.out.print("Enter your height in feet: ");
	        heightFeet = input.nextInt();
	        System.out.print("Enter your height in inches: ");
	        heightInches = input.nextInt();

	        // Compute total height in inches
	        totalHeightInches = heightFeet * 12 + heightInches;

	        // Compute ideal weight for a female
	        idealWeightFemale = 100 + 5 * (totalHeightInches - 60);

	        // Compute ideal weight for a male
	        idealWeightMale = 106 + 6 * (totalHeightInches - 60);

	        // Print the answers
	        System.out.println("Your ideal weight as a female is " + idealWeightFemale + " pounds.");
	        System.out.println("Your ideal weight as a male is " + idealWeightMale + " pounds.");
	       
	      
	    }
	}


