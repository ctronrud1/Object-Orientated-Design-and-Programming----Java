// ************************************************************ 
// File Name: Task1_Account
// Author: Charlie Tronrud
// Purpose: Write  a  partial  definition  for  a  class  representing  a  bank account.  
//...See  what  methods  it  contains.  Then  complete  the  Account  class  as described  in the instructions 
// ************************************************************
public class Task1_Account
{		
	
    private double balance;
    private String name;
    private long acctNum;

    // ---------------------------------------------
    // Constructor -- initializes balance, owner, and account number
    // --------------------------------------------
    public Task1_Account(double initBal, String owner, long number)
    {
        balance = initBal;
        name = owner;
        acctNum = number;
    }

    // --------------------------------------------
    // Checks to see if balance is sufficient for withdrawal.
    // If so, decrements balance by amount; if not, prints message.
    // --------------------------------------------
    public void withdraw(double amount)
    {
        if (balance >= amount)
            balance -= amount;
        else
            System.out.println("Insufficient funds");
    }

    // --------------------------------------------
    // Adds deposit amount to balance.
    // --------------------------------------------
    public void deposit(double amount)
    {
        balance += amount;
    }

    // --------------------------------------------
    // Returns balance.
    // --------------------------------------------
    public double getBalance()
    {
        return balance;
    }

    // --------------------------------------------
    // Returns a string containing the name, account number, and balance.
    // --------------------------------------------
    public String toString()
    {
        return "Name: " + name + "\nAccount Number: " + acctNum + "\nBalance: $" + balance;
    }

    // --------------------------------------------
    // Deducts $10 service fee and returns the new balance.
    // --------------------------------------------
    public double chargeFee()
    {
        balance -= 10;
        return balance;
    }

    // --------------------------------------------
    // Changes the name on the account.
    // --------------------------------------------
    public void changeName(String newName)
    {
        name = newName;
    }
	
}
