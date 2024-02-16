
//************************************************************
// Task4_Account.java
//
// A bank account class with methods to deposit to, withdraw from,
// change the name on, and get a String representation
// of the account.
//************************************************************
import java.util.Random;
public class Task4_Account
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
	public Task4_Account(double initBal, String owner, long number)
	{
		balance = initBal;
		name = owner;
		acctNum = number;
	}
	
	public Task4_Account(double initBal, String owner)
	{
		balance = initBal;
		name = owner;
		acctNum = rand.nextLong();
	}
	
	public Task4_Account(String owner)
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
	// closes the account and reduces the number of accounts
	//-------------------------------------------------
	public void close() 
	{
		name = "CLOSED";
		balance = 0;
		numAccounts--;
		
	}
	//-------------------------------------------------
	// consolidates the two accounts and returns a new account
	//-------------------------------------------------
	public static Account consolidate(Task4_Account acct1, Task4_Account acct2) 
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
	// gets the account number
	//-------------------------------------------------
	public long getAcctNumber() 
	{
		return acctNum;
	}
	//-------------------------------------------------
	// Prints the summary of the account
	//-------------------------------------------------
	public String printSummary() 
	{
		return " Number of deposits " + totaldeposits +
				" Number of withdrawls " + totalwithdrawal +
				" Ammount deposited " + amount_deposit +
				" Ammount withdrawn " + amount_withdrawn ;
	}
	
	public static int getNumDeposits() 
	{
		return totaldeposits;
	}
	
	public static int getNumWithdrawls() 
	{
		return totalwithdrawal;
	}
	
	public static double getTotaldrawls() 
	{
		return amount_withdrawn;
	}
	
	public static double getTotalDeposits() 
	{
		return amount_deposit;
	}
	
	public static void reset() 
	{
		totaldeposits = 0;
		totalwithdrawal =0;
		amount_withdrawn =0;
		amount_deposit = 0;
	}
	
	public void transfer(Task4_Account acct, double amount) 
	{
		
		
		if(amount>balance) 
		{
			System.out.println("insufficient amount");
			
		}else 
		{  
			
			//first remove the balance from account
			balance = balance - amount;
			//transfer the balance to the other account
			acct.balance = acct.balance + amount;
			System.out.println("Transfer Successful");
		}
		
	}
	public void transfer(Task4_Account acct, Task4_Account acct2, double amount) 
	{
		
		
		if(amount>acct.balance) 
		{
			System.out.println("insufficient amount");
			
		}else 
		{  
			
			//first remove the balance from account
			acct.balance = acct.balance - amount;
			//transfer the balance to the other account
			acct2.balance = acct2.balance + amount;
			System.out.println("Transfer Successful");
		}
		
	}
}
