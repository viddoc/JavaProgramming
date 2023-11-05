//Tommy Hudson CashRegister program with running total for the day option
package e3point11;

public class CashRegister 
{
		/**
		 * Create the instance variables.
		 */
		private double purchase;
		private double payment;
		private String prices;
		private int salesCount;
		private double salesTotal;
		/**
		 * Construct an empty CashRegister.
		 */
		public CashRegister()
		{
			purchase = 0;
			payment = 0;
			prices = "";
			salesCount = 0;
			salesTotal = 0;
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
			salesCount++;
			salesTotal += amount;
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
		/**
		 * Gets the number of sales for the day.
		 * @return the number of sales
		 */
		public int getSalesCount()
		{
			return salesCount;
		}
		/**
		 * Gets the total amount of the sales for the day.
		 * @return the tot1al amount of sales
		 */
		public double getSalesTotal()
		{
			return salesTotal;
		}
		/**
		 * Method to reset all instance variables for the next day.
		 */
		public void reset()
		{
			purchase = 0;
			payment = 0;
			prices = "";
			salesCount = 0;
			salesTotal = 0;
		}
}