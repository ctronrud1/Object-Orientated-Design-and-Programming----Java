// ************************************************************ 
// File Name: Task6_CopyFiles
// Author: Charlie Tronrud
// Purpose: Task6 prompts the user for a filename, then opens a Scanner to the file and copies it, one line at a time, to the standard output
// ************************************************************
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Task6_CopyFiles {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String filename;

        do {
            System.out.print("Enter the filename: ");
            filename = input.nextLine();

            try {
                File file = new File(filename);
                Scanner fileScanner = new Scanner(file);

                // Copy file contents to standard output
                while (fileScanner.hasNextLine()) {
                    String line = fileScanner.nextLine();
                    System.out.println(line);
                }

                fileScanner.close();
            } catch (FileNotFoundException e) {
                System.out.println("File not found. Please enter a valid filename.");
            }
        } while (!fileExists(filename));

        input.close();
    }

    // Helper method to check if the file exists
    private static boolean fileExists(String filename) {
        File file = new File(filename);
        return file.exists();
    }
}
