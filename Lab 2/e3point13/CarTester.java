//Tommy Hudson CarTester program
package e3point13;

public class CarTester {

	public static void main(String[] args) 
	{
		Car optima = new Car(26);
		System.out.println("Gas: " + optima.getGasInTank());
		optima.addGas(16);
		System.out.println("Gas: " + optima.getGasInTank());
		optima.drive(100);
		System.out.println("Gas: " + optima.getGasInTank());
		optima.addGas(5);
		System.out.println("Gas: " + optima.getGasInTank());

	}

}
