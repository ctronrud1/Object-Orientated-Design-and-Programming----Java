// ************************************************************
// File Name: Task4_Circle.java
//Author: Charlie Tronrud
// Print the area of a circle with two different radius then writing your own code to see what happens to
//...circumference and area when the radius doubles 
// ************************************************************

	public class Task4_Circle
	{
		public static void main(String[] args)
	    {
	        final double PI = 3.14159; // declare and initialize a constant variable PI to 3.14159
	        
	        int radius = 10; // declare and initialize a variable radius to 10
	        double area = PI * radius * radius; // declare and initialize a variable area with the formula for the area of a circle
	        double circumference = 2 * PI * radius; // declare and initialize a variable circumference with the formula for the circumference of a circle
	        
	        
	        System.out.println("The area of a circle with radius " + radius + " is : " + area);
	        
	        System.out.println("The circumference of a circle with radius " + radius +  " is : " + circumference); // print out the calculated circumference of the circle
	        
	        radius = 20; // assign a new value to the variable radius
	        area = PI * radius * radius; // recalculate the area with the new radius
	        circumference = 2 * PI * radius; // recalculate the circumference with the new radius
	        
	        System.out.println("The area of the circle with radius " + radius + " is : " + area); // prints the new area
	        
	        System.out.println("The circumference of a circle with radius " + radius + " is : " + circumference); // prints the new circumference of the circle
	        
	        double areaRatio = area / (PI * 10 * 10); // calculate the ratio of the new area to the old area
	        double circumferenceRatio = circumference / (2 * PI * 10); // dividing by the circumference of the first circle
	       
	        System.out.println("When the radius is doubled the area is " + areaRatio + " times the old area."); // print the ratio
	        System.out.println("When the radius is doubled the circumference is " + circumferenceRatio + " times the original circumference.");
	    }
	}


