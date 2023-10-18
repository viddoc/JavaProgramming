//Tommy Hudson FibonacciNumbers program
package p6point2;

import java.util.Scanner;
//Class to print all of the Fibonacci numbers up to a specified user input number.
public class FibonacciNumbers 
{

	public static void main(String[] args) 
	{
		Scanner in = new Scanner(System.in);
		int fold1 = 1, fold2 = 1, fnew = 0;
		//Get user input number to test against.
		System.out.print("Please enter a number to see the Fibonacci number of that number: ");
		int n = in.nextInt();
		in.close();
		//Run the for-loop up to the user input number.
		for (int i = 0; i < n; i++)
		{
			
			fold2 = fold1;
			fold1 = fnew;
			fnew = fold1 + fold2;
		}
		
		System.out.print("Fibonacci number is " + fnew);

	}

}
