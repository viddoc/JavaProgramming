//Tommy Hudson Employee program
package e9point1;
/**
 * Class to set up a basic employee object with a name and a salary.
 */
public class Employee 
{
	private String name;
	private double baseSalary;
	
	public void setName(String newName) 
	{ 
		this.name = newName;
	}
	
	public void setBaseSalary(double newSalary) 
	{ 
		this.baseSalary = newSalary;
	}
	
	public String getName() 
	{
		return name;
	}
	
	public double getSalary() 
	{
		return baseSalary;
	}
}
