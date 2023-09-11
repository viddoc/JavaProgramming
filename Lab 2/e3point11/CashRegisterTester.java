//Tommy Hudson CashRegisterTester program
package e3point11;

public class CashRegisterTester 
{
	public static void main(String[] args) 
	{
		CashRegister register = new CashRegister();
		register.recordPurchase(1);
		register.recordPurchase(5);
		register.recievePayment(10);
		register.printReceipt();
		register.giveChange();
		register.recordPurchase(10);
		register.recordPurchase(6);
		register.recievePayment(20);
		register.printReceipt();
		register.giveChange();
		System.out.println("\nSales Count: " + register.getSalesCount());
		System.out.println("Sales Total: " + register.getSalesTotal());
		

	}
}
