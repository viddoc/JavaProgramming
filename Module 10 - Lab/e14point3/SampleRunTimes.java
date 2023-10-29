//Tommy Hudson SampleRunTimes program
package e14point3;

import java.util.Scanner;

public class SampleRunTimes 
{

	public static void main(String[] args) 
	{
		Scanner in = new Scanner(System.in);
		//Variables for the smallest number, largest number, and number of elements
		int from, to, number;
		System.out.println("This program will measure the amount of time elapsed to sort a random array specified by the user");
		System.out.print("Please enter number of measurements: ");
		number = in.nextInt();
		System.out.print("Please enter the smallest value allowed: ");
		from = in.nextInt();
		System.out.print("Please enter the largest value allowed: ");
		to = in.nextInt();
		in.close();
		//Create random integer array
		int[] array = ArrayUtil.randomIntArray(number, from, to);
		System.out.println("Unsorted");
		for (int i = 0; i < array.length; i++)
		{
			System.out.print(array[i] + " ");
		}
		//Create StopWatch object
		StopWatch timer = new StopWatch();
		//Start timer
		timer.start();
		//Sort array
		SelectionSorter.sort(array);
		//Stop timer
		timer.stop();
		System.out.println("\nSorted");
		for (int i = 0; i < array.length; i++)
		{
			System.out.print(array[i] + " ");
		}
		//Print elapsed time
		System.out.printf("\nElapsed milliseconds:%8d%n", timer.getElapsedTime());
		//Reset timer
		timer.reset();
		
		
		

	}

}
