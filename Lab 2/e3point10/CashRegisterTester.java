//Tommy Hudson CashRegisterTester program
package e3point10;

public class CashRegisterTester
{

	public static void main(String[] args) 
	{
		CashRegister register = new CashRegister();
		register.recordPurchase(1);
		register.recordPurchase(5);
		register.recordPurchase(10);
		register.recordPurchase(6);
		register.recievePayment(25);
		register.printReceipt();
		register.giveChange();

	}

}
