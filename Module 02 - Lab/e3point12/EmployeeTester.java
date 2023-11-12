//Tommy Hudson EmployeeTester program
package e3point12;

public class EmployeeTester 
{

	public static void main(String[] args) 
	{
		Employee tommy = new Employee("Hudson, Tommy", 50000);
		System.out.println(tommy.getName());
		System.out.println(tommy.getSalary());
		tommy.raiseSalary(10);
		System.out.println(tommy.getSalary());
	}

}
