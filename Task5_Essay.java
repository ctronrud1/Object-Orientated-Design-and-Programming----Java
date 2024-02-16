// ************************************************************ 
// File Name: Task5 Essay
// Author: Charlie Tronrud
// Purpose: Essay will need an instance variable to store the number of blank lines needed after the question (answering space).
// ************************************************************
import java.util.Scanner;

public class Task5_Essay extends Task5_TestQuestion {
    private int numBlankLines;

    protected void readQuestion() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the essay question:");
        this.question = scanner.nextLine();
        System.out.println("Enter the number of blank lines:");
        this.numBlankLines = scanner.nextInt();
    }

    public String toString() {
        StringBuilder str = new StringBuilder("Essay: ");
        for (int i = 0; i < this.numBlankLines; i++) {
            str.append("\n");
        }
        return str.toString();
    }
}
