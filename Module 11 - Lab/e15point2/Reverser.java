//Tommy Hudson Reverser program
package e15point2;

import java.util.Collections;
import java.util.LinkedList;


public class Reverser 
{

	public static void main(String[] args) 
	{
		//String array of names to be passed into the LinkedList
		String[] namesArray = {"Tommy", "Inna", "Raymond", "Brittany", "Hal", "Beverly"};
		LinkedList<String> namesList = new LinkedList<String>();
		
		for (int i = 0; i < namesArray.length; i++)
		{
			namesList.add(namesArray[i]);
		}
		
		System.out.println(namesList);
		reverse(namesList);
		System.out.println(namesList);

	}
	/**
	 * Method to pass a LinkedList containing Strings and reverse the order
	 * @param strings the LinkedList passed
	 */
	public static void reverse(LinkedList<String> strings)
	{
		Collections.reverse(strings);
		
	}
}
