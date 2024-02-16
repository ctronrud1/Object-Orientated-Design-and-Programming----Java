// ************************************************************ 
// File Name: Task5_Cards
// Author: Charlie Tronrud
// Purpose:	Write a class that defines an enumerated type 
// ************************************************************ 
public class Task5_Cards {
    enum Rank {
        ace, two, three, four, five, six, seven, eight, nine, ten, jack, queen, king;
    }
    
    public static void main(String[] args) {
        // Declare and initialize some playing card ranks
        Rank highCard = Rank.ace;
        Rank faceCard = Rank.king; 
        Rank card1 = Rank.two;
        Rank card2 = Rank.five; 
        
        System.out.println("A blackjack hand: " + highCard + " and " + faceCard);
        
        // Calculate the face value of card1 and card2 and print out a two-card hand
        int card1Val = card1.ordinal() + 1; // adjust to get face value
        int card2Val = card2.ordinal() + 1;
        System.out.println("A two card hand: " + card1.name() + " and " + card2.name() 
                           + " Hand value: " + (card1Val + card2Val));
    }
}
