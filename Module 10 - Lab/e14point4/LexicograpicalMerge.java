//Tommy Hudson LexicographicalMerge program
package e14point4;

import java.util.Scanner;

public class LexicograpicalMerge 
{

	public static void main(String[] args) 
	{
		Scanner in = new Scanner(System.in);
		//Create String array
		String[] array = new String[5];
		//Explain program purpose and what is expected of the user
		System.out.println("This program will ask you to input five strings and will sort them in lexicographical order.");
		System.out.println("Please enter your strings now.");
		//Populate the String array
		for (int i = 0; i < array.length; i++)
		{
			System.out.print("String #" + (i+1) +": ");
			array[i] = in.next();
		}
		in.close();
		//Call the sort method
		MergeSorter.sort(array);
		//Output the sorted array
		System.out.println("Now they will be output sorted lexicographically.");
		for (int i = 0; i < array.length; i++)
		{
			System.out.println(array[i]);
		}

	}

}
