//Tommy Hudson Battery program
package p3point9;
/**
 * Class that creates a battery that can be depleted and charged.
 */
public class Battery 
{
	/**
	 * Declare instance variables.
	 */
	private double currentCapacity;
	private double batteryCapacity;
	/**
	 * Construct battery with a set capacity.
	 * @param capacity Capacity of the battery created
	 */
	public Battery(double capacity)
	{
		batteryCapacity = capacity;
		currentCapacity = capacity;
	}
	/**
	 * Drain the battery of charge.
	 * @param amount Amount of charge depleted
	 */
	public void drain(double amount)
	{
		currentCapacity -= amount;
	}
	/**
	 * Recharges the battery to it's charged capacity.
	 */
	public void charge()
	{
		currentCapacity = batteryCapacity;
	}
	/**
	 * Gets the current capacity of the battery.
	 * @return currentCapacity The amount of charge remaining in the battery
	 */
	public double getRemainingCapacity()
	{
		return currentCapacity;
	}

}
