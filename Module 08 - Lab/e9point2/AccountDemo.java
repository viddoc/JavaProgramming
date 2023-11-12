//Tommy Hudson AccountDemo program

package e9point2;

/**
   This program simulates a bank with checking and savings accounts.
*/
public class AccountDemo
{
   public static void main(String[] args)
   {
      // Create account
      BasicAccount tommysAccount = new BasicAccount();
      tommysAccount.deposit(100);
      tommysAccount.withdraw(150);
      
   }
}

