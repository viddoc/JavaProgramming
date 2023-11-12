//Tommy Hudson CashRegister program with Receipt Option
package e3point10;

public class CashRegister 
{
		/**
		 * Create the instance variables.
		 */
		private double purchase;
		private double payment;
		private String prices;
		/**
		 * Construct an empty CashRegister.
		 */
		public CashRegister()
		{
			purchase = 0;
			payment = 0;
			prices = "";
		}
		/**
		 * Record the sale of an item.
		 * @param amount the price of the item
		 */
		public void recordPurchase(double amount)
		{
			purchase += amount;
			String price = String.valueOf(amount);
			prices = prices.concat(price + "\n       ");			
		}
		/**
		 * Processes a payment received from the customer.
		 * @param amount the amount of the payment
		 */
		public void recievePayment(double amount)
		{
			payment += amount;
		}
		
		/**
		 * Computes the change due and resets the machine for next customer.
		 * @return the change due to the customer
		 */
		public double giveChange()
		{
			double change = payment - purchase;
			purchase = 0;
			payment = 0;
			return change;
		}
		
		/**
		 * Prints a receipt of all items sold in a sale.
		 */
		public void printReceipt()
		{
			System.out.println("\n    Your Receipt\n");
			System.out.println("Items: " + prices);
			System.out.println("Total: " + purchase);
			System.out.println("Paid: " + payment);
			System.out.println("Change: " + (payment - purchase));
		}
}
