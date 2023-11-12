//Tommy Hudson Employee program
package e3point12;

public class Employee 
{
	/**
	 * Instance variables.
	 */
	private String name;
	private double salary;
	/**
	 * Construct employee with name and salary.
	 * @param employeeName name of employee
	 * @param currentSalary salary of employee
	 */
	public Employee(String employeeName, double currentSalary)
	{
		name = employeeName;
		salary = currentSalary;
	}
	/**
	 * Method to return employee name.
	 * @return name of employee
	 */
	public String getName()
	{
		return name;
	}
	/**
	 * Method to return employee salary. 
	 * @return salary of employee
	 */
	public double getSalary()
	{
		return salary;
	}
	/**
	 * Method to give a raise to the employee by a set percentage.
	 * @param byPercent percentage of salary to raise salary by
	 */
	public void raiseSalary(double byPercent)
	{
		double raise = (byPercent/100) * salary;
		salary += raise;
	}
}
