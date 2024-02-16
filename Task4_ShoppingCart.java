// ************************************************************ 
// File Name: Task4_ShoppingCart
// Author: Charlie Tronrud
// Purpose: The file Task4_ShoppingCart.java implements the shopping cart as an array of Item objects.
// ************************************************************
import java.text.NumberFormat;

public class Task4_ShoppingCart {
private Task4_Item[] cart; // array of items in the cart
private int itemCount; // total number of items in the cart
private double totalPrice; // total price of items in the cart
private int capacity; // current cart capacity
// ---------------------------------------------------------
// Creates an empty shopping cart with a capacity of 5 items.
// ---------------------------------------------------------
public Task4_ShoppingCart() {
	capacity = 5;
	itemCount = 0;
	totalPrice = 0.0;
	cart = new Task4_Item[capacity];
}

// -----------------------------------------------------
// Adds an item to the shopping cart.
// -----------------------------------------------------
public void addToCart(String itemName, double price, int quantity) {
	if (itemCount == capacity) {
		increaseSize();
	}
	cart[itemCount] = new Task4_Item(itemName, price, quantity);
	itemCount++;
	totalPrice += price * quantity;
}

// -----------------------------------------------------
// Returns the contents of the cart together with
// summary information.
// -----------------------------------------------------
public String toString() {
	NumberFormat fmt = NumberFormat.getCurrencyInstance();
	String contents = "\nShopping Cart\n";
	contents += "\nItem\t\tUnit Price\tQuantity\tTotal\n";
	for (int i = 0; i < itemCount; i++)
		contents += cart[i].toString() + "\n";
	contents += "\nTotal Price: " + fmt.format(totalPrice);
	contents += "\n";
	return contents;
}

// -----------------------------------------------------
// Increases the capacity of the shopping cart by 3
// -----------------------------------------------------
private void increaseSize() {
	Task4_Item[] newCart = new Task4_Item[capacity + 3];
	for (int i = 0; i < capacity; i++) {
		newCart[i] = cart[i];
	}
	cart = newCart;
	capacity += 3;
}
}