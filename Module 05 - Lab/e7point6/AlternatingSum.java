//Tommy Hudson AternatingSum program
package e7point6;

import java.util.Scanner;

public class AlternatingSum 
{
	public static void main(String[] args)
	{
		Scanner in = new Scanner(System.in);
		int size;
		//Find out the size of the array.
		System.out.print("How many numbers would you like to enter for this: ");
		size = in.nextInt();
		double[] input = new double[size];
		//Populate the array.
		for (int i = 0; i < size; i++)
		{
			System.out.print((i+1)+". ");
			input[i] = in.nextDouble();
		}
		in.close();
		//Set sum to the first element.
		double sum = input[0];
		//Start for-loop from 1.
		for (int i = 1; i < size; i++)
		{
			//If it is an even element add the number and if it is odd subtract it.
			if(i % 2 == 0)
			{
				sum += input[i];
			}
			else
			{
				sum -= input[i];
			}
		}
		//Print the numbers so the user can see what was entered.
		System.out.print("The numbers you entered were: ");
		for (int i = 0; i < size; i++)
		{
			System.out.print(input[i] + " ");
		}
		//Explain how the calculation is being done.
		System.out.print("\nThe alternating sum will be calculated like this " + input[0]);
		for (int i = 1; i < size; i++)
		{
			if(i % 2 == 0)
			{
				System.out.print( " + " + input[i]);
			}
			else
			{
				System.out.print(" - " + input[i]);
			}
		}
		//Print the result.
		System.out.println("\nThe sum of numbers calculated using alternating sum is " + sum + ".");
		
	}
}
