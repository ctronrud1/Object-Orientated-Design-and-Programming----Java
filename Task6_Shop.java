// ************************************************************ 
// File Name: Task6
// Author: Charlie Tronrud
// Purpose: Complete the Task6_Shop.java (given) that models shopping. a. Declare and instantiate a variable cart to be an empty ArrayList
// ************************************************************
import java.util.ArrayList;
import java.util.Scanner;

public class Task6_Shop {

    public static void main(String[] args) {

        ArrayList<Task6_Item> cart = new ArrayList<>();

        Scanner scan = new Scanner(System.in);

        String keepShopping = "y";

        while (keepShopping.equalsIgnoreCase("y")) {

            System.out.print("Enter the name of the item: ");
            String itemName = scan.nextLine();

            System.out.print("Enter the unit price: ");
            double itemPrice = scan.nextDouble();

            System.out.print("Enter the quantity: ");
            int quantity = scan.nextInt();

            Task6_Item item = new Task6_Item(itemName, itemPrice, quantity);

            cart.add(item);

            System.out.println("\nCurrent cart:");

            System.out.println("Item       Cost       Total Cost");

            double totalPrice = 0;

            for (Task6_Item i : cart) {
                System.out.printf("%-10s $%-8.2f $%-8.2f\n", i.getName(), i.getPrice(), i.getPrice() * i.getQuantity());
                totalPrice += i.getPrice() * i.getQuantity();
            }

            System.out.printf("Total Price: $%.2f\n\n", totalPrice);

            scan.nextLine(); // consume the extra newline character after reading the int

            System.out.print("Continue shopping (y/n)? ");
            keepShopping = scan.nextLine();
        }
    }
}
