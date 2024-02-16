 // ************************************************************ 
// File Name: Task1_ComparePlayers
// Author: Charlie Tronrud
// Purpose:  A class to read information about two baseball players and determine whether or not they are the same player.
// ************************************************************

import java.util.Scanner;

public class Task1_ComparePlayers {
    public static void main(String[] args) {
        Task1_Player player1 = new Task1_Player();
        Task1_Player player2 = new Task1_Player();
        Scanner scan = new Scanner(System.in);

        // Prompt for and read in information for player 1
        System.out.print("Enter player 1's name: ");
        player1.setName(scan.nextLine());
        System.out.print("Enter player 1's team: ");
        player1.setTeam(scan.nextLine());
        System.out.print("Enter player 1's uniform number: ");
        player1.setUniformNumber(scan.nextInt());
        scan.nextLine(); // consume the newline character

        // Prompt for and read in information for player 2
        System.out.print("Enter player 2's name: ");
        player2.setName(scan.nextLine());
        System.out.print("Enter player 2's team: ");
        player2.setTeam(scan.nextLine());
        System.out.print("Enter player 2's uniform number: ");
        player2.setUniformNumber(scan.nextInt());
        scan.nextLine(); // consume the newline character

        // Compare player1 to player 2 and print a message saying whether they are equal
        if (player1.equals(player2)) {
            System.out.println("Same player");
        } else {
            System.out.println("Different players");
        }
    }
}

