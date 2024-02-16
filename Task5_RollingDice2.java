// ************************************************************ 
// File Name: Task5_RollingDice2
// Author: Charlie Tronrud
// Purpose: Create and write a driver class to instantiate and use a PairOfDice object.
// ************************************************************
public class Task5_RollingDice2 {
    public static void main(String[] args) {
        Task5_PairOfDice pairOfDice = new Task5_PairOfDice();

        pairOfDice.roll();
        System.out.println("Die 1: " + pairOfDice.getDie1());
        System.out.println("Die 2: " + pairOfDice.getDie2());
        System.out.println("Sum: " + pairOfDice.getSum());

        pairOfDice.setDie1(4);
        pairOfDice.setDie2(2);
        System.out.println("\nDie 1: " + pairOfDice.getDie1());
        System.out.println("Die 2: " + pairOfDice.getDie2());
        System.out.println("Sum: " + pairOfDice.getSum());
    }
}
