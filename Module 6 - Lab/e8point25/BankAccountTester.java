package e8point25;

public class BankAccountTester 
{

	public static void main(String[] args) 
	{
		BankAccount tommysChecking = new BankAccount(2000);
		tommysChecking.withdraw(500);
		tommysChecking.deposit(300);
		tommysChecking.withdraw(800);
		tommysChecking.deposit(1000);
		System.out.println("Balance: $" + tommysChecking.getBalance());
		System.out.println("Transactions: " + tommysChecking.getStatement());
		tommysChecking.clearStatement();
		System.out.println("Transactions: " + tommysChecking.getStatement());
	}

}
