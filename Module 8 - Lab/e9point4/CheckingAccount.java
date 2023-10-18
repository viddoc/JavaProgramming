//Tommy Hudson CheckingAccount program
package e9point4;

/**
   A checking account has a limited number of free deposits and withdrawals.
*/
public class CheckingAccount extends BankAccount
{
   private int overdrafts;
   /**
      Constructs a checking account with a zero balance.
   */
   public CheckingAccount()
   {
	   overdrafts = 0;
   }
   /**
    * Withdraw method that has a $20 fee for the first overdraft in a month and $30 fee for every overdraft after that month.
    */
   public void withdraw(double amount)
   {
      double balance = getBalance();
      
      if (balance < amount && overdrafts == 0)
      {
         super.withdraw(amount+20);  
         overdrafts++;
      }
      else if (balance < amount && overdrafts >= 1)
      {
    	  super.withdraw(amount+30);
    	  overdrafts++;
      }
      else
      {
    	  super.withdraw(amount);
      }
   }
   /**
    * Method to reset the overdrafts for the new month.
    */
   public void monthEnd()
   {
	   overdrafts = 0;
   }

}

