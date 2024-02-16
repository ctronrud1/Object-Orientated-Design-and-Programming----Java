// ************************************************************ 
// File Name: Task7
// Author: Charlie Tronrud
// Purpose: Question objects are created, almost the same code appears twice, once to ask
//...and grade the first question, and again to ask and grade the second question.
// ************************************************************
import java.util.Scanner;
public class Task7_MiniQuiz
{
	
	//--------------------------------------------------------------
	// Presents a short quiz.
	//--------------------------------------------------------------
	static Scanner scan = new Scanner(System.in);
	public static void main (String[] args)
	{
		Task7_Question questionq1, questionq2;
		
		questionq1 = new Task7_Question ("What's the code for this course?","CISC230");
		questionq1.setComplexity (3);
		questionq2 = new Task7_Question ("What's the name of this University?", "University of St Thomas");
		questionq2.setComplexity (2);
		
		askQuestion(questionq1);
		askQuestion(questionq2);
		
		
	}
	
	// A method to ask a question and check the answer
	private static void askQuestion(Task7_Question questionq1) 
	{
		
		String possible;
		// Ask the question and display its complexity level
		System.out.print (questionq1.getQuestion());
		System.out.println (" (Level: " + questionq1.getComplexity() + ")");
		possible = scan.nextLine();
		
		// Read user input and check the answer
		if (questionq1.answerCorrect(possible))
			System.out.println ("Correct");
		else
			System.out.println ("No, the answer is " + questionq1.getAnswer());
		System.out.println();
		
	}
}