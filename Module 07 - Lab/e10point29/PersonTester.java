//Tommy Hudson PersonTester program
package e10point29;

import java.util.Scanner;

public class PersonTester 
{

	public static void main(String[] args) 
	{
		Scanner in = new Scanner(System.in);
		//Create array of Person objects to hold 10 names.
		Person[] names = new Person[10];
		System.out.println("Please enter 10 people's names.");
		//Populate the array of Person objects.
		for(int i = 0; i < names.length; i++)
		{
			System.out.print("Name " + (i+1) + ": ");
			names[i] = new Person(in.nextLine());
		}
		in.close();
		//Variables to hold the first and last name.
		Person first = names[0];
		Person last = names[0];
		//
		for (int i = 1; i < names.length; i++) 
		{
			if (names[i].compareTo(first) < 0)
	        {
	           first = names[i];
	        }
	        if (names[i].compareTo(last) > 0)
	        {
	           last = names[i];
	        }
		}
		//Print the results of the comparisons.
	    System.out.println("The first person is: " + first.getName());
	    System.out.println("The last person is: " + last.getName());
    }
}
