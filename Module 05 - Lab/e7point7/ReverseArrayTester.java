//Tommy Hudson ReverseArrayTester program
package e7point7;

import java.util.Scanner;

public class ReverseArrayTester 
{

	public static void main(String[] args) 
	{
		Scanner in = new Scanner(System.in);
		int size;
		//Find out the size of the array.
		System.out.print("How many numbers would you like to enter for this: ");
		size = in.nextInt();
		//Create array to hold the input numbers.
		int[] inputArr = new int[size];
		//For-loop to populate the array.
		for (int i = 0; i < size; i++)
		{
			System.out.print((i+1)+". ");
			inputArr[i] = in.nextInt();
		}
		
		in.close();
		//Create array to hold the reversed input.
		int[] reversedArr = new int[size];
		
		//Create the object
		ReverseArray reverser = new ReverseArray(inputArr);
		//Call the method
		reversedArr = reverser.Reverse();
		//Print the input numbers.
		System.out.print("The numbers you input were: ");
		for (int i = 0; i < size; i++)
		{
			System.out.print(inputArr[i] + " ");
		}
		//Print the output numbers.
		System.out.print("\nThose numbers reversed are: ");
		for (int i = 0; i < size; i++)
		{
			System.out.print(reversedArr[i] + " ");
		}
		
		

	}

}
