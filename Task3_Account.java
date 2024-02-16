// ************************************************************ 
// File Name: Task3_Account
// Author: Charlie Tronrud
// Purpose: Write a Task3Account that contains a definition for a simple bank account class with methods to
//...withdraw, deposit, get the balance and account number, and return a String representation
// ************************************************************
import java.util.Random;
public class Task3_Account
{
	private double balance;
	private String name;
	private long acctNum;
	private Random rand = new Random();
	private static int numAccounts = 0;
	private static int totaldeposits =0;
	private static int totalwithdrawal = 0;
	
	private static double amount_deposit =0;
	private static double amount_withdrawn =0;
	
	
	//-------------------------------------------------
	//Constructor -- initializes balance, owner, and account number
	//-------------------------------------------------
	public Task3_Account(double initBal, String owner, long number)
	{
		balance = initBal;
		name = owner;
		acctNum = number;
	}
	
	public Task3_Account(double initBal, String owner)
	{
		balance = initBal;
		name = owner;
		acctNum = rand.nextLong();
	}
	
	public Task3_Account(String owner)
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
		{
			balance -= amount; 
			totalwithdrawal++;
			amount_withdrawn =  amount_withdrawn + amount;
		}
		else
			System.out.println("Insufficient funds");
	}
	//-------------------------------------------------
	// Adds deposit amount to balance.
	//-------------------------------------------------
	public void deposit(double amount)
	{
		balance += amount;
		totaldeposits++;
		amount_deposit =  amount_deposit + amount;
		
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
	//-------------------------------------------------
	// close the account 
	//-------------------------------------------------
	public void close() 
	{
		name = "CLOSED";
		balance = 0;
		numAccounts--;
		
	}
	//-------------------------------------------------
	// consolidates two accounts
	//-------------------------------------------------
	public static Account consolidate(Task3_Account acct1, Task3_Account acct2) 
	{
		if(acct1.name.equals(acct2.name) &&  (acct1.acctNum != acct2.acctNum)) 
		{
			Account acct = new Account(acct1.balance+acct2.balance,acct1.name);
			return acct;
		}else 
		{ 
			System.out.println("We cannot process your request due to unmet conditions");
			return null;
		
		}
		
	}
	
	//-------------------------------------------------
	//get accout number
	//-------------------------------------------------
	public long getAcctNumber() 
	{
		return acctNum;
	}
	//-------------------------------------------------
	// print summary
	//-------------------------------------------------
	public String printSummary() 
	{
		return "\nname :" + name +
				"\nACCT#: " + acctNum+ 
				"\nBalance " + balance +
				"\nNumber of deposits " + totaldeposits +
				" Number of withdrawls " + totalwithdrawal +
				" Ammount deposited " + amount_deposit +
				" Ammount withdrawn " + amount_withdrawn  ;
	}
	//get deposits
	public static int getNumDeposits() 
	{
		return totaldeposits;
	}
	//withdrawals
	public static int getNumWithdrawls() 
	{
		return totalwithdrawal;
	}
	//total withdrawal amount
	public static double getTotaldrawls() 
	{
		return amount_withdrawn;
	}
	//total deposits
	public static double getTotalDeposits() 
	{
		return amount_deposit;
	}
	//resets
	public static void reset() 
	{
		totaldeposits = 0;
		totalwithdrawal =0;
		amount_withdrawn =0;
		amount_deposit = 0;
	}
}