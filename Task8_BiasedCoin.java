// ************************************************************ 
// File Name: Task8BiasedCoin
// Author: Charlie Tronrud
// Purpose: Create a new class named Task8_BiasedCoin.java that models a biased coin (heads and
//...tails are not equally likely outcomes of a flip).
// ************************************************************
import java.util.Scanner;
public class Task8_BiasedCoin {
public static void main(String[] args) {
Scanner in = new Scanner(System.in);
System.out.println("Instantiating three coins.");   

Coin coin1 = new Coin();
    Coin coin2, coin3;

    System.out.print("Enter the probability of heads for the second coin (0-1 inclusive): ");
    double bias2 = in.nextDouble();
    coin2 = new Coin();

    System.out.print("Enter the probability of heads for the third coin (0-1 inclusive): ");
    double bias3 = in.nextDouble();
    coin3 = new Coin();

    int numFlips = 100;
    int numHeads1 = 0, numHeads2 = 0, numHeads3 = 0;

    for (int i = 0; i < numFlips; i++) {
        coin1.flip();
        coin2.flip();
        coin3.flip();

        if (coin1.isHeads()) {
            numHeads1++;
        }
        if (coin2.isHeads()) {
            numHeads2++;
        }
        if (coin3.isHeads()) {
            numHeads3++;
        }
    }

    System.out.println("Coin 1 with bias " + coin1.getClass() + " came up heads " + numHeads1 + " times.");
    System.out.println("Coin 2 with bias " + coin2.getClass() + " with bias " + bias2 + " came up heads " + numHeads2 + " times.");
    System.out.println("Coin 3 with bias " + coin3.getClass() + " with bias " + bias3 + " came up heads " + numHeads3 + " times.");

}
}