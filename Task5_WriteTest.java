// ************************************************************ 
// File Name: Task5 TestQuestions
// Author: Charlie Tronrud
// Purpose: define a class Task5_WriteTest that creates an array of Task5_TestQuestion objects. 
// ************************************************************
import java.util.Scanner;

public class Task5_WriteTest {
    public static void main(String[] args) 
    {
        Scanner scanner = new Scanner(System.in);
        System.out.println("How many questions do you want to enter?");
        int numQuestions = scanner.nextInt();
        scanner.nextLine(); // consume newline character

        Task5_TestQuestion[] questions = new Task5_TestQuestion[numQuestions];
        for (int i = 0; i < numQuestions; i++) {
            System.out.println("Enter the question type (1 == An essay, 2 == Multiple choice):");
            int type = scanner.nextInt();
            Task5_TestQuestion question;
            if (type == 1) {
                question = new Task5_Essay();
            } else if (type == 2) {
                question = new Task5_MultChoice();
            } else {
                System.out.println("That is an invalid question type.");
                i--; // repeat this iteration
                continue;
            }

            questions[i] = question;
        }

        System.out.println("\nQuestions:");
        for (int i = 0; i < numQuestions; i++) {
            System.out.println((i + 1) + ") " + questions[i]);
        }
    }
}
