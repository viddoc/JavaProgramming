//Tommy Hudson Manager program
package e9point1;
/**
 * Class to set up a basic manager object that is a subclass of the employee class and adds a bonus.
 */
public class Manager extends Employee 
{
	private double bonus;
	
	public Manager () {}
	
	public Manager(double newBonus)
	{
		this.bonus = newBonus;
	}
	
	public void setBonus(double newBonus)
	{
		 this.bonus = newBonus;
	}
	
	public double getBonus()
	{
		return bonus;
	}
	
}