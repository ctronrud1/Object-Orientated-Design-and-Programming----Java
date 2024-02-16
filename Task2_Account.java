import java.util.Random;
//************************************************************
// Task2_Account.java
//
// A bank account class with methods to deposit to, withdraw from,
// change the name on, and get a String representation
// of the account.
//************************************************************
public class Task2_Account
{
	
	private double balance;
	private String name;
	private long acctNum;
	private Random rand = new Random();
	private static int numAccounts = 0;
	
	//-------------------------------------------------
	//Constructor -- initializes balance, owner, and account number
	//-------------------------------------------------
	public Task2_Account(double initBal, String owner, long number)
	{
		balance = initBal;
		name = owner;
		acctNum = number;
		numAccounts++;
	}
	//-------------------------------------------------
	//Constructor -- initializes balance, owner, and generates a random account number
	//-------------------------------------------------
	public Task2_Account(double initBal, String owner)
	{
		balance = initBal;
		name = owner;
		acctNum = rand.nextLong();
		numAccounts++;
	}
	//-------------------------------------------------
	//Constructor -- initializes owner, and generates a random account number, and resets the balance
	//-------------------------------------------------
	public Task2_Account(String owner)
	{
		balance = 0;
		name = owner;
		acctNum = rand.nextLong();
		numAccounts++;
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
	
	//-------------------------------------------------
	// Get num accounts
	//-------------------------------------------------
	public static int getNumAccounts() 
	{
		return numAccounts;
		
	}
	//-------------------------------------------------
	// consolidate two accounts
	//-------------------------------------------------
	public static Task2_Account consolidate(Task2_Account acct1, Task2_Account acct2) 
	{
		if(acct1.name.equals(acct2.name) &&  (acct1.acctNum != acct2.acctNum)) 
		{
			Task2_Account acct = new Task2_Account(acct1.balance+acct2.balance,acct1.name);
			return acct;
		}else 
		{ 
			System.out.println("We cannot process your request due to unmet conditions");
			return null;
		
		}
		
		
	}
	public void close() 
	{
		name = "CLOSED";
		balance = 0;
		numAccounts--;
		
	}
}
