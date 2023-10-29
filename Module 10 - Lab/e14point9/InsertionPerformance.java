//Tommy Hudson InsertionPerformance Program
package e14point9;

import java.util.Scanner;

public class InsertionPerformance 
{

	public static void main(String[] args) 
	{
		Scanner in = new Scanner(System.in);
		//Variables for number of elements, and the largest number 
		int size, to;
		System.out.println("This program will measure the amount of time elapsed and number of iterations to sort a random array specified by the user");
		System.out.print("Please enter size of the array: ");
		size = in.nextInt();
		System.out.print("Please enter the largest value allowed: ");
		to = in.nextInt();
		in.close();
		//Create random integer array
		int[] array = ArrayUtil.randomIntArray(size, to);
		//Create StopWatch object
		StopWatch timer = new StopWatch();
		//Start timer
		timer.start();
		//Sort array
		int count = InsertionSorter.sort(array);
		//Stop timer
		timer.stop();
		//Print elapsed time
		System.out.printf("Elapsed milliseconds:%8d%n", timer.getElapsedTime());
		System.out.println("Number of iterations to finish sorting: " + count);
		//Reset timer
		timer.reset();
	}

}
