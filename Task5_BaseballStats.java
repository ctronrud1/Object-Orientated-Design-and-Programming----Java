// ************************************************************ 
// File Name: Task5
// Author: Charlie Tronrud
// Purpose: Write a program Task5_BaseballStats.java that should. a. reads the files stats.dat or stats2.dat (one at a time)
// ************************************************************
import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;

public class Task5_BaseballStats {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the name of the input file: ");
        String fileName = input.nextLine();

        File file = new File(fileName);
        while (!file.exists()) {
            System.out.print("File not found. Enter a valid file name: ");
            fileName = input.nextLine();
            file = new File(fileName);
        }

        try {
            Scanner fileInput = new Scanner(file);

            while (fileInput.hasNextLine()) {
                String line = fileInput.nextLine();
                String[] parts = line.split(",");
                String name = parts[0];
                int hits = 0, outs = 0, walks = 0, sacs = 0;

                for (int i = 1; i < parts.length; i++) {
                    String symbol = parts[i];
                    if (symbol.equals("h")) {
                        hits++;
                    } else if (symbol.equals("o")) {
                        outs++;
                    } else if (symbol.equals("w")) {
                        walks++;
                    } else if (symbol.equals("s")) {
                        sacs++;
                    }
                }

                double battingAverage = (double) hits / (hits + outs);
                System.out.println("Statistics for " + name + "...");
                System.out.println("Hits: " + hits);
                System.out.println("Outs: " + outs);
                System.out.println("Walks: " + walks);
                System.out.println("Sacrifices: " + sacs);
                System.out.printf("Batting Average: %.3f\n", battingAverage);
                System.out.println();
            }

            fileInput.close();
        } catch (FileNotFoundException e) {
            System.out.println("File not found.");
        }
    }
}
