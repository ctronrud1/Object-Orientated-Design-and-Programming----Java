// ************************************************************
// File Name: Task8_BaseConvert
//Author: Charlie Tronrud
// Use the algorithm to write a program that converts a base 10 number to a 4-digit number in another base 
// ************************************************************
	import java.util.Scanner;

	public class Task8_BaseConvert {
	    public static void main (String[] args) {
	        int base;   // the new base
	        int base10Num;  // the number in base 10
	        int maxNumber;  // the maximum number that will fit in 4 digits in the new base

	        int place0; // digit in the 1's (base^0) place
	        int place1; // digit in the base^1 place
	        int place2; // digit in the base^2 place
	        int place3; // digit in the base^3 place

	        String baseBNum = new String (""); // the number in the new base

	        Scanner scan = new Scanner(System.in);
	        
	        // read in the base 10 number and the base
	        System.out.println();
	        System.out.println ("Base Conversion Program");
	        System.out.println() ;
	        System.out.print ("Please enter a base (2-9): ");
	        base = scan.nextInt();

	        // Compute the maximum base 10 number that will fit in 4 digits
	        // in the new base and tell the user what range the number they
	        // want to convert must be in
	        maxNumber = (base*base*base*base)-1;
	        System.out.println("The maximum base 10 number that will fit in 4 digits in base " + base + " is " + maxNumber);

	        System.out.print ("Please enter a base 10 number to convert: ");
	        base10Num = scan.nextInt();

	        // Do the conversion
	        place0 = base10Num % base;
	        base10Num /= base;
	        place1 = base10Num % base;
	        base10Num /= base;
	        place2 = base10Num % base;
	        base10Num /= base;
	        place3 = base10Num % base;
	        
	        // Concatenate the digits in the new base to baseBNum
	        baseBNum = "" + place3 + place2 + place1 + place0;

	        // Print the result
	        System.out.println("The base " + base + " representation of " + base10Num + " is " + baseBNum);
	        
	       
	        
	         
	    }
	}

