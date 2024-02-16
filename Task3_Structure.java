// ************************************************************ 
// File Name: Task3_Structure
// Author: Charlie Tronrud
// Purpose:Write a program Task3_Structure.java to generate the following structure as output. You can use either do or for loop for this task.
// ************************************************************

public class Task3_Structure {
    public static void main(String[] args) {
        int n = 11; // number of rows

        // upper half
        for (int i = 1; i <= n / 2 + 1; i++) {
            // print spaces
            for (int j = n / 2 + 1; j >= i; j--) {
                System.out.print(" ");
            }
            // print asterisks
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

        // lower half
        for (int i = n / 2; i >= 1; i--) {
            // print spaces
            for (int j = n / 2 + 1; j >= i; j--) {
                System.out.print(" ");
            }
            // print asterisks
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
