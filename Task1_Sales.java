// ************************************************************ 
// File Name: Task1_Sales
// Author: Charlie Tronrud
// Purpose: Write rogram that prompts for and reads in the sales for each of 5 salespeople in a company. It then prints out the id and number of sales for each salesperson and
//...the total sales.
// ************************************************************
import java.util.Scanner;

public class Task1_Sales {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Enter the number of salespeople: ");
        int numSalespeople = scan.nextInt();

        int[] sales = new int[numSalespeople];
        int sum = 0;

        // Input sales for each salesperson
        for (int i = 0; i < sales.length; i++) {
            System.out.print("Enter sales for salesperson " + (i + 1) + ": ");
            sales[i] = scan.nextInt();
            sum += sales[i];
        }

        // Compute average sale
        double averageSale = (double) sum / numSalespeople;

        // Find maximum sale and its salesperson id
        int maxSale = sales[0];
        int maxSaleId = 1;
        for (int i = 1; i < sales.length; i++) {
            if (sales[i] > maxSale) {
                maxSale = sales[i];
                maxSaleId = i + 1;
            }
        }

        // Find minimum sale and its salesperson id
        int minSale = sales[0];
        int minSaleId = 1;
        for (int i = 1; i < sales.length; i++) {
            if (sales[i] < minSale) {
                minSale = sales[i];
                minSaleId = i + 1;
            }
        }

        // Output salesperson sales, average, max, and min
        System.out.println("\nSalesperson Sales");
        System.out.println("------------------");
        for (int i = 0; i < sales.length; i++) {
            System.out.println("Salesperson " + (i + 1) + ": $" + sales[i]);
        }
        System.out.println("\nTotal sales: $" + sum);
        System.out.printf("Average sale: $%.2f\n", averageSale);
        System.out.println("Salesperson " + maxSaleId + " had the highest sale with $" + maxSale);
        System.out.println("Salesperson " + minSaleId + " had the lowest sale with $" + minSale);

        // Find salespeople who exceeded a certain amount and their sales
        System.out.print("\nEnter a sales amount: ");
        int threshold = scan.nextInt();
        int numExceeded = 0;
        System.out.println("Salespeople who exceeded $" + threshold + ":");
        for (int i = 0; i < sales.length; i++) {
            if (sales[i] > threshold) {
                System.out.println("Salesperson " + (i + 1) + ": $" + sales[i]);
                numExceeded++;
            }
        }
        System.out.println("Total salespeople exceeding $" + threshold + ": " + numExceeded);
    }
}
