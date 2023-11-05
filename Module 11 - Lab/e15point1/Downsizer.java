//Tommy Hudson Downsizer program
package e15point1;

import java.util.LinkedList;
import java.util.ListIterator;

public class Downsizer 
{

	public static void main(String[] args) 
	{
		//String array to hold names to populate the LinkedList
		String[] employeeArray = {"Tommy", "Alex", "Joyce", "Danice", "Merla", "Nasser", "Cindy", "Julie"};
		LinkedList<String> employeeList = new LinkedList<String>();
		
		for (int i = 0; i < employeeArray.length; i++)
		{
			employeeList.add(employeeArray[i]);
		}
		
		System.out.println(employeeList);
		downsize(employeeList, 2);
		System.out.println(employeeList);


	}
	/**
	 * Method to remove every nth employee
	 * @param employeeNames Names of employees
	 * @param n Number of employees to iterate before removal
	 */
	public static void downsize(LinkedList<String> employeeNames, int n)
	{
		ListIterator<String> iter = employeeNames.listIterator();
		int count = 1;
		while(iter.hasNext())
		{
			iter.next();
			if (count % n == 0)
			{
				iter.remove();
			}
			count++;
		}
	}

}
