//Tommy Hudson EmployeeTester program
package e9point1;
/**
 * Class to test out the Employee and Manager classes.
 */
public class EmployeeTester {

	public static void main(String[] args) 
	{
		Manager tommy = new Manager();
		tommy.setName("Tommy");
		tommy.setBaseSalary(50000);
		tommy.setBonus(5000);
		
		System.out.println("Manager name: " + tommy.getName());
		System.out.println("Manager salary: " + tommy.getSalary());
		System.out.println("Manager bonus: " + tommy.getBonus());

	}

}
