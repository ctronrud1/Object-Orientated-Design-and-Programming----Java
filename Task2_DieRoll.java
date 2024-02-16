// ************************************************************ 
// File Name: Task2_DieRoll
// Author: Charlie Tronrud
// Purpose: Write a complete Java program that simulates the rolling of a pair of dice.
// ************************************************************ 
	import java.util.Random;

	public class Task2_DieRoll {
	    public static void main(String[] args) {

	        Random random = new Random();

	        // Roll the first die and store the result in a variable
	        // The expression random.nextInt(6) generates a random integer between 0 and 5, 
	        // and adding 1 to this result gives a value between 1 and 6, inclusive.
	        int die1 = random.nextInt(6) + 1;

	        // Roll the second die and store the result in a variable
	        int die2 = random.nextInt(6) + 1;

	        // Calculate the total roll by adding the values of both dice
	        int total = die1 + die2;

	        System.out.println("Rolling the dice...");

	        System.out.println("Die 1: " + die1);

	        System.out.println("Die 2: " + die2);

	        // Print the total of the two rolls
	        System.out.println("Total roll: " + total);
	    }
	}
