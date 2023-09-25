//Tommy Hudson PrimePrinter program
package p6point4;

import java.util.Scanner;

public class PrimePrinter 
{

	public static void main(String[] args) 
	{
		Scanner in = new Scanner(System.in);
		int input;
		//Get the number that will be used as the stop point.
		System.out.print("Please enter any number to see every prime number up to that number: ");
		input = in.nextInt();
		//Create the object that will call the method.
		PrimeGenerator hopeful = new PrimeGenerator(input);
		hopeful.nextPrime(input);
		in.close();
	}

}
