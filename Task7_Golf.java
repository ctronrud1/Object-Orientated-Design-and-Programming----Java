// ************************************************************ 
// File Name: Task7
// Author: Charlie Tronrud
// Purpose: Design and implement a program Task7_Golf.java to process golf scores
// ************************************************************
import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class Task7_Golf {
    public static void main(String[] args) throws FileNotFoundException {
        // Open the golf scores file
    	File file = new File("C:\\Users\\charl\\eclipse-workspace\\LabSix\\src\\golf.txt");
    	Scanner fileScan = new Scanner(file);
        // Read the golf scores into an ArrayList
        ArrayList<ArrayList<Integer>> scores = new ArrayList<>();
        while (fileScan.hasNextLine()) {
            String line = fileScan.nextLine();
            String[] parts = line.split(" ");
            ArrayList<Integer> holeScores = new ArrayList<>();
            for (int i = 1; i < parts.length; i++) {
                holeScores.add(Integer.parseInt(parts[i]));
            }
            scores.add(holeScores);
        }

        // Compute the total par and each player's score
        int totalPar = 0;
        ArrayList<Integer> playerScores = new ArrayList<>();
        for (int i = 0; i < 4; i++) {
            int playerScore = 0;
            for (int j = 0; j < 18; j++) {
                int par = scores.get(j).get(0);
                int score = scores.get(j).get(i + 1);
                playerScore += score;
                totalPar += par;
            }
            playerScores.add(playerScore);
        }

        // Find the winner
        int minScore = Integer.MAX_VALUE;
        int winnerIndex = -1;
        for (int i = 0; i < playerScores.size(); i++) {
            int score = playerScores.get(i);
            if (score < minScore) {
                minScore = score;
                winnerIndex = i;
            }
        }

        // Print the scores
        System.out.println("Par for the course: " + totalPar);
        for (int i = 0; i < playerScores.size(); i++) {
            System.out.println("Player " + (i + 1) + ": " + playerScores.get(i));
        }
        System.out.println("The winner is player " + (winnerIndex + 1) + "!");
    }
}
