//Tommy Hudson SavingsAccount program
package e3point9;

public class SavingsAccount
{
	/**
	 * Create instance variables.
	 */
	private double balance;
	private double rate;
	/**
	 * Construct an account with zero balance and zero interest rate.
	 */
	public SavingsAccount()
	{
		balance = 0;
		rate = 0;
	}
	/**
	 * Construct an account with a given balance and rate.
	 * @param initialBalance the initial balance
	 * @param initialRate the initial rate
	 */
	public SavingsAccount(double initialBalance, double initialRate)
	{
		this.balance = initialBalance;
		this.rate = initialRate;
	}
	/**
	 * Method to deposit money into account.
	 * @param amount the amount to deposit
	 */
	public void deposit(double amount)
	{
		balance += amount;
	}
	/**
	 * Method to withdraw money from account.
	 * @param amount the amount to withdraw
	 */
	public void withdraw(double amount)
	{
		balance -= amount;
	}
	/**
	 * Method to calculate and apply interest to the account.
	 */
	public void addInterest()
	{
		double interest = balance * rate;
		balance += interest;
	}
	/**
	 * Method to get the current balance of the account
	 * @return the current balance
	 */
	public double getBalance()
	{
		return balance;
	}
	
}
