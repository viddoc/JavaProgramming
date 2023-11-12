//Tommy Hudson BasicAccount program
package e9point2;
/**
 * Class that creates a BasicAccount that extends the BankAccount class but this withdraw method will not allow an overdraw.
 */
public class BasicAccount extends BankAccount 
{
	public BasicAccount () {}
		
	@Override
	public void withdraw(double amount)
	{
		double balance = getBalance();
		if (amount > balance)
		{
			System.out.println("Insufficient funds available to withdraw. Please try different amount.");
		}
		else
		{
			super.withdraw(amount);
		}
	}
}
