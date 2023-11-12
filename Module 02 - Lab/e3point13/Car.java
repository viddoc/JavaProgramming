//Tommy Hudson Car program
package e3point13;

public class Car 
{
	/**
	 * Instance Variables
	 */
	private double mpg;
	private double gas;
	/**
	 * Construct the object Car with the miles per gallon supplied.
	 * @param mpg miles per gallon of the car
	 */
	public Car(double mpg)
	{
		this.mpg = mpg;
		gas = 0;
	}
	/**
	 * Calculate the amount of gas used to drive the amount of miles driven.
	 * @param miles amount of miles driven
	 */
	public void drive(double miles)
	{
		double gasUsed = miles/mpg;
		gas -= gasUsed;
	}
	/**
	 * Gets the amount of gas remaining in tank.
	 * @return amount of gas in tank
	 */
	public double getGasInTank()
	{
		return gas;
	}
	/**
	 * Adds gas to the tank of the car.
	 * @param gasAdded amount of gas added
	 */
	public void addGas(double gasAdded)
	{
		gas += gasAdded;
	}
	
	
}
