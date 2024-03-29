// ************************************************************ 
// File Name: Task1Account
// Author: Charlie Tronrud
// Purpose: File Account.java contains a definition for a simple bank account class with methods to withdraw,
//...deposit, get the balance and account number, and return a String representation
// ************************************************************
import java.util.Random;
//************************************************************
// Account.java
//
// A bank account class with methods to deposit to, withdraw from,
// change the name on, and get a String representation
// of the account.
//************************************************************
public class Task1_Account
{
	
	private double balance;
	private String name;
	private long acctNum;
	private Random rand = new Random();
	
	//-------------------------------------------------
	//Constructor -- initializes balance, owner, and account number
	//-------------------------------------------------
	public Task1_Account(double initBal, String owner, long number)
	{
		balance = initBal;
		name = owner;
		acctNum = number;
	}
	//-------------------------------------------------
	//Constructor -- initializes balance, owner, and generates a random account number
	//-------------------------------------------------
	public Task1_Account(double initBal, String owner)
	{
		balance = initBal;
		name = owner;
		acctNum = rand.nextLong();
	}
	//-------------------------------------------------
	//Constructor -- initializes owner, and generates a random account number, and resets the balance
	//-------------------------------------------------
	public Task1_Account(String owner)
	{
		balance = 0;
		name = owner;
		acctNum = rand.nextLong();
	}
	
	//-------------------------------------------------
	// Checks to see if balance is sufficient for withdrawal.
	// If so, decrements balance by amount; if not, prints message.
	//-------------------------------------------------
	public void withdraw(double amount)
	{
		if (balance >= amount)
			balance -= amount;
		else
			System.out.println("Insufficient funds");
	}
	//---------------------
	// withdraws money from account
	//--------------------
	public void withdraw(double amount, int fee)
	{
		balance = balance - fee;
	}
	
	//-------------------------------------------------
	// Adds deposit amount to balance.
	//-------------------------------------------------
	public void deposit(double amount)
	{
		balance += amount;
	}
	//-------------------------------------------------
	// Returns balance.
	//-------------------------------------------------
	public double getBalance()
	{
		return balance;
	}
	//-------------------------------------------------
	// Returns a string containing the name, account number, and balance.
	//-------------------------------------------------
	public String toString()
	{
		return "Name:" + name +
		"\nAccount Number: " + acctNum +
		"\nBalance: " + balance;
	}
}