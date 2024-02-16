// ************************************************************ 
// File Name: Task7_Warning
// Author: Charlie Tronrud
// Purpose: Task7 that will read in a file of student academic credit data and create a list of students on academic warning
// ************************************************************
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

public class Task7_Warning {
    public static void main(String[] args) {
        int creditHrs; // number of semester hours earned
        double qualityPts; // number of quality points earned
        double gpa; // grade point (quality point) average
        String line, name;
        String inputPath = "C:/Users/charl/eclipse-workspace/LabTwelve/src/students.dat";
        String outputPath = "warning.dat";

        try {
            // Set up scanner to input file
            Scanner scan = new Scanner(new File(inputPath));

            // Set up the output file stream
            PrintWriter outFile = new PrintWriter(new FileWriter(outputPath));

            // Print a header to the output file
            outFile.println("Students on Academic Warning");
            outFile.println();

            // Process the input file, one token at a time
            while (scan.hasNext()) {
                // Get the credit hours, quality points, and name from the input file
                name = scan.next();
                creditHrs = scan.nextInt();
                qualityPts = scan.nextDouble();

                // Compute the GPA
                gpa = qualityPts / creditHrs;

                // Determine if the student is on warning based on credit hours and GPA
                if ((creditHrs < 30 && gpa < 1.5) ||
                        (creditHrs < 60 && gpa < 1.75) ||
                        (gpa < 2.0)) {
                    // Write the student data to the output file
                    outFile.println(name + " " + creditHrs + " " + gpa);
                }
            }

            // Close output file
            outFile.close();

            System.out.println("Warning data has been written to " + outputPath);
        } catch (FileNotFoundException e) {
            System.out.println("The file " + inputPath + " was not found.");
        } catch (IOException e) {
            System.out.println("An error occurred while reading/writing the file: " + e.getMessage());
        } catch (NumberFormatException e) {
            System.out.println("Format error in input file: " + e.getMessage());
        }
    }
}
