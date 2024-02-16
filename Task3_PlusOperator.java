// ************************************************************ 
// File Name: Task3_PlusOperator
// Author: Charlie Tronrud
// Purpose: Dry run the given code before compiling. Checking to see if you were correct and then writing a code of your own using
//...the + operator to  do  arithmetic  and  string  concatenation and giving an explanation of how you satisfy the prompt
// ************************************************************ 

	public class Task3_PlusOperator
	{
		//
		// main prints some expressions using the + operator
		//
		
		public static void main (String[] args)
		{
			//This statement will output the concatenated string of 
			//..."This is a long string that is the concatenation of two shorter strings."
			System.out.println ("This is a long string that is the " +
									"concatenation of two shorter strings.");
			//This statement will output the concatenated string of "The first computer was invented about55years ago." 
			//... and the number 55 will not be separated by a space on both sides.
			System.out.println ("The first computer was invented about" + 55 +
											"years ago.");
			//This statement will output the concatenated string of "8 plus 5 is 85" 
			//...the numbers are concatenated as strings before the addition operation is performed.
			System.out.println ("8 plus 5 is " + 8 + 5);
			
			//This statement will output the concatenated string of "8 plus 5 is 13" 
			//...the addition operation is going to be first within parentheses and then the result is concatenated to the previous string.
			System.out.println ("8 plus 5 is " + (8 + 5)) ;
			
			//This statement will output the concatenated string of "13 equals 8 plus 5." 
			//...the addition operation will be performed first before the concatenation of strings.
			System.out.println (8 + 5 + " equals 8 plus 5.");
			
			//After compiling my results held true for everything
			
			//My example Code
			System.out.println("Ten undergraduates plus 15 graduates are " + (10 + 15) + " university students.");
			
			//The program uses the + operator to concatenate the first part of the sentence "Ten undergraduates plus 15 graduates are " with the result of the arithmetic operation (10 + 15), which is evaluated first within parentheses. 
			//...The resulting string is then concatenated with the last part of the sentence "university students." to produce the final output: "Ten undergraduates plus 15 graduates are 25 university students."
		}
				

	}
	

