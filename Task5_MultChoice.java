// ************************************************************ 
// File Name: Task5 Essay
// Author: Charlie Tronrud
// Purpose: Task5_MultChoice will not need this variable, but it will need an array of Strings to hold the choices along with the main question.
// ************************************************************
import java.util.Scanner;

public class Task5_MultChoice extends Task5_TestQuestion {
    private int numChoices;
    private String[] choices;

    protected void readQuestion() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the multiple choice question:");
        this.question = scanner.nextLine();
        System.out.println("Enter the number of choices:");
        this.numChoices = scanner.nextInt();
        scanner.nextLine(); // consume newline character

        this.choices = new String[this.numChoices];
        for (int i = 0; i < this.numChoices; i++) {
            System.out.println("Enter choice " + (i + 1) + ":");
            this.choices[i] = scanner.nextLine();
        }
    }

    public String toString() {
        StringBuilder str = new StringBuilder("Multiple Choice: " + this.question + "\n");
        for (int i = 0; i < this.numChoices; i++) {
            str.append("  ").append(i).append(") ").append(this.choices[i]).append("\n");
        }
        return str.toString();
    }
}
