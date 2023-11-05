//Tommy Hudson SieveOfEratosthenes program
package e15point3;

import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;


public class SieveOfEratosthenes 
{

	public static void main(String[] args) 
	{
		Scanner in = new Scanner(System.in);

        System.out.print("Enter a positive integer: ");
        int n = in.nextInt();
        in.close();
        

        System.out.print("All prime numbers less than " + n + " are: ");
        System.out.println(theSieve(n));
	}
	/**
	 * Method to calculate all prime numbers up to the user input number using The Sieve of Eratosthenes method
	 * @param n user input number to calculate up to
	 * @return Set of numbers containing all prime numbers up to n
	 */
	public static Set<Integer> theSieve(int n)
	{
		//Create the TreeSet of Integers
		Set<Integer> numbers = new TreeSet<Integer>();
		//If n is less than 2 the calculations can't be performed and return an empty set
		if(n < 2)
		{
			System.out.println("Not possible to calculate prime numbers less than two.");
			return numbers;
		}
		else
		{
			//Populate the set
			for(int i = 2; i <= n; i++)
			{
				numbers.add(i);
			}
			//For loop to test all numbers up to the square root of n
			for(int i = 2; i <= Math.sqrt(n); i++)
			{
				//Inner for loop to calculate and remove all non-prime numbers 
				for(int j = 2; j * i <= n; j++)
				{
					numbers.remove(i * j);
				}
			}
		}
		
		return numbers;
	}
}


