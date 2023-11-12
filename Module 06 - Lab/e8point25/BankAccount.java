//Tommy Hudson BankAccount program
package e8point25;

import java.util.ArrayList;

public class BankAccount 
{
		// Instance Variables
		private double balance;
		private ArrayList<Double> statement = new ArrayList<Double>();
		
		
		/**
		 * Constructs a BankAccount object with an initial balance and update the statement
		 * @param initialBalance the initial balance
		 */
		public BankAccount(double initialBalance)
		{
			balance = initialBalance;
			updateStatement(initialBalance);
		}
		
		// Methods
		/**
		 * Method to deposit an amount into the bank account and update the statement
		 * @param amount amount to be deposited
		 */
		public void deposit(double amount)
		{
			balance += amount;
			updateStatement(amount);
		}
		
		/**
		 * Method to withdraws an amount from the bank account and update the statement
		 * @param amount amount to be withdrawn
		 */
		public void withdraw(double amount)
		{
			balance -= amount;
			updateStatement(-amount);
		}
		
		/**
		 * Method that gets the current balance of the account
		 * @return balance the balance of the account
		 */
		public double getBalance()
		{
			return balance;
		}
		
		/**
		 * Method that will add a transaction to the statement
		 * @param value value to be added
		 */
		public void updateStatement(double value)
		{
			statement.add(value);
		}
		
		/**
		 * Method to get the current account statement
		 * @return statement the current account statement
		 */
		public ArrayList<Double> getStatement()
		{
			return statement;
		}
		
		/**
		 * Method to reset the statement
		 */
		public void clearStatement()
		{
			statement.clear();
		}
}
