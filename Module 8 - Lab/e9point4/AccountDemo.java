//Tommy Hudson AccountDemo program
package e9point4;

/**
   This program simulates a bank with checking and savings accounts.
*/
public class AccountDemo
{
   public static void main(String[] args)
   {
      // Create account
	   CheckingAccount tommysAccount = new CheckingAccount();
	   tommysAccount.deposit(100);
	   tommysAccount.withdraw(125);
	   System.out.println("Balance: " + tommysAccount.getBalance());
	   System.out.println("Expected Balance: -45");
	   tommysAccount.deposit(145);
	   tommysAccount.withdraw(125);
	   System.out.println("Balance: " + tommysAccount.getBalance());
	   System.out.println("Expected Balance: -55");
   }
}

