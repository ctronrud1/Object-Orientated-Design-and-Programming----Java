// ************************************************************
// File Name: Task7_MoneyConvertor
//Author: Charlie Tronrud
// Prompts the user and read a double  value representing a monetary amount. 
//... all while using the fewest number of each bill and coin needed to represent that amount, starting with the highest
// ************************************************************
	import java.util.Scanner;

	public class Task7_MoneyConvertor {
	    public static void main(String[] args)
	  {
	        
	    	Scanner scanner = new Scanner(System.in);
	        System.out.print("Enter a monetary amount: ");
	        double amount = scanner.nextDouble();
	        scanner.close();

	        int dollars = (int) amount; // get the dollar amount
	        int cents = (int) Math.round((amount - dollars) * 100); // get the cents and round to nearest integer

	        // Use the remainders to find the number of each bill and coin needed
	        int tens = dollars / 10;
	        dollars %= 10;
	        int fives = dollars / 5;
	        dollars %= 5;
	        int ones = dollars;
	        int quarters = cents / 25;
	        cents %= 25;
	        int dimes = cents / 10;
	        cents %= 10;
	        int nickels = cents / 5;
	        cents %= 5;
	        int pennies = cents;

	        // Print the results
	        System.out.println(tens + " ten dollar bills");
	        System.out.println(fives + " five dollar bills");
	        System.out.println(ones + " one dollar bills");
	        System.out.println(quarters + " quarters");
	        System.out.println(dimes + " dimes");
	        System.out.println(nickels + " nickels");
	        System.out.println(pennies + " pennies");
	    }
	}

