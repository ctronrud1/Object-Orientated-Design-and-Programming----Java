// ************************************************************ 
// File Name: Task4_ParseInts
// Author: Charlie Tronrud
// Purpose: Task4 contains a program that does the following:  Prompts and reads the input, sums integer using other scanner, prints sum
// ************************************************************
import java.util.Scanner;

public class Task4_ParseInts {
    public static void main(String[] args) {
        int val, sum = 0;
        Scanner scan = new Scanner(System.in);
        String line;

        System.out.println("Enter a line of text");
        line = scan.nextLine();
        Scanner scanLine = new Scanner(line);

        while (scanLine.hasNext()) {
            try {
                val = Integer.parseInt(scanLine.next());
                sum += val;
            } catch (NumberFormatException e) {
                // Do nothing if the token is not an integer
            }
        }

        System.out.println("The sum of the integers on this line is " + sum);
    }
}
