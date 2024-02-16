// ************************************************************ 
// File Name: Task7_Square
// Author: Charlie Tronrud
// Purpose: File Task7_Square.java contains the shell for a class that represents a square matrix. It contains
//...headers for a constructor that gives the size of the square and methods to read values into the square
// ************************************************************
import java.util.Scanner;

public class Task7_Square {
    private int[][] square;

    public Task7_Square(int size) {
        square = new int[size][size];
    }

    public int sumRow(int row) {
        int sum = 0;
        for (int j = 0; j < square.length; j++) {
            sum += square[row][j];
        }
        return sum;
    }

    public int sumCol(int col) {
        int sum = 0;
        for (int i = 0; i < square.length; i++) {
            sum += square[i][col];
        }
        return sum;
    }

    public int sumMainDiag() {
        int sum = 0;
        for (int i = 0; i < square.length; i++) {
            sum += square[i][i];
        }
        return sum;
    }

    public int sumOtherDiag() {
        int sum = 0;
        for (int i = 0; i < square.length; i++) {
            sum += square[i][square.length - i - 1];
        }
        return sum;
    }

    public boolean magic() {
        int sum = sumMainDiag();
        if (sum != sumOtherDiag()) {
            return false;
        }
        for (int i = 0; i < square.length; i++) {
            if (sumRow(i) != sum || sumCol(i) != sum) {
                return false;
            }
        }
        return true;
    }

    public void readSquare(Scanner scan) {
        for (int row = 0; row < square.length; row++) {
            for (int col = 0; col < square.length; col++) {
                square[row][col] = scan.nextInt();
            }
        }
    }

    public void printSquare() {
        for (int i = 0; i < square.length; i++) {
            for (int j = 0; j < square.length; j++) {
                System.out.print(square[i][j] + "\t");
            }
            System.out.println();
        }
    }
}
