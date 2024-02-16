// ************************************************************ 
// File Name: Task4
// Author: Charlie Tronrud
// Purpose: Write a program Task4_Guess.java contains a skeleton for a program to play a guessing game with the user
// ************************************************************
import java.util.Scanner;
import java.util.Random;

public class Task4_Guess {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Random random = new Random();

        int number = random.nextInt(10) + 1; // generate a random number between 1 and 10
        int guesses = 0;
        int tooHigh = 0;
        int tooLow = 0;

        System.out.println("I'm thinking of a number between 1 and 10. Can you guess it?");
        int guess; // define the guess variable outside the loop

        do {
            System.out.print("Enter your guess: ");
            guess = input.nextInt();
            guesses++;

            if (guess < number) {
                System.out.println("Too low. Try again.");
                tooLow++;
            } else if (guess > number) {
                System.out.println("Too high. Try again.");
                tooHigh++;
            }
        } while (number != guess);

        System.out.println("Congratulations! You guessed the number in " + guesses + " tries.");
        System.out.println("You guessed too high " + tooHigh + " times and too low " + tooLow + " times.");
    }
}
