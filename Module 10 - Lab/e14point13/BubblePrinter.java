//Tommy Hudson BubblePrinter program
package e14point13;

import java.util.Scanner;

public class BubblePrinter
{

	public static void main(String[] args) 
	{
		Scanner in = new Scanner(System.in);
		//Variables for number of elements, and the largest number 
		int size, to;
		System.out.println("This program will create a random array specified by the user, print it, sort it, and then print it again.");
		System.out.print("Please enter size of the array: ");
		size = in.nextInt();
		System.out.print("Please enter the largest value allowed: ");
		to = in.nextInt();
		in.close();
		//Create random integer array
		int[] array = ArrayUtil.randomIntArray(size, to);
		ArrayUtil.printArray(array);
		BubbleSort.sort(array);
		ArrayUtil.printArray(array);

	}

}
