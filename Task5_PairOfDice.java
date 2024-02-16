// ************************************************************ 
// File Name: Task5_PairOfDice
// Author: Charlie Tronrud
// Purpose: Using the Die class defined and given write a class called Task5_PairOfDice, composed of two Die objects.
// ************************************************************
public class Task5_PairOfDice {
	
   //These are the private variables
	private Die die1;
    private Die die2;

    // This is a constructor that creates two new Dice objects
    public Task5_PairOfDice() {
        die1 = new Die();
        die2 = new Die();
    }

    public void roll() {
        die1.roll();
        die2.roll();
    }
    // These methods set the face value of the first and second dice
    public void setDie1(int value) {
        die1.setFaceValue(value);
    }

    public void setDie2(int value) {
        die2.setFaceValue(value);
    }
    // These methods return the face value of the first and second dice
    public int getDie1() {
        return die1.getFaceValue();
    }

    public int getDie2() {
        return die2.getFaceValue();
    }
    // This method returns the sum of the face values of both dice.
    public int getSum() {
        return die1.getFaceValue() + die2.getFaceValue();
    }
}
