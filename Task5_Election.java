// ************************************************************ 
// File Name: Task5_Election
// Author: Charlie Tronrud
// Purpose:Write the program Task5_Election.java.The program’s job is to take as input the number of votes each candidate received in each voting
//...area and find the total number of votes for each.
// ************************************************************
import java.util.Scanner;

public class Task5_Election {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int totalVotesA = 0, totalVotesB = 0, areaCount = 0;
        String response = "y";
        
        // Title
        System.out.println("Election Day Vote Counting Program\n");

        // Loop until no more areas
        while(response.equals("y")){
            System.out.print("Are there any areas to process? (y/n) ");
            response = input.nextLine().toLowerCase();

            // Process area if needed
            if(response.equals("y")){
                areaCount++;
                System.out.println("Please enter the results from the next area");

                // Get votes for Mr. A
                System.out.print("Votes for Mr. A: ");
                int votesA = input.nextInt();
                totalVotesA += votesA;

                // Get votes for Mr. B
                System.out.print("Votes for Mr. B: ");
                int votesB = input.nextInt();
                totalVotesB += votesB;

                // Move to next line
                input.nextLine();
            }
        }

        // Calculate percentages
        double percentA = (double) totalVotesA / (totalVotesA + totalVotesB) * 100;
        double percentB = (double) totalVotesB / (totalVotesA + totalVotesB) * 100;

        // Output results
        System.out.println("\nMr. A got " + totalVotesA + " votes or " + percentA + "%");
        System.out.println("Mr. B got " + totalVotesB + " votes or " + percentB + "%");

        // Determine winner or tie
        if(totalVotesA > totalVotesB){
            System.out.println("Mr. A won " + areaCount + " areas");
        } else if(totalVotesB > totalVotesA){
            System.out.println("Mr. B won " + areaCount + " areas");
        } else {
            System.out.println("The election was a tie");
        }
    }
}
