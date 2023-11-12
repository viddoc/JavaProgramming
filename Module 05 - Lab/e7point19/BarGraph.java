//Tommy Hudson BarGraph program
package e7point19;

import java.util.Scanner;
//Class to create a simple ASCII bar graph using asterisks after getting the values from the user.
public class BarGraph 
{

	public static void main(String[] args) 
	{
		Scanner in = new Scanner(System.in);
		final int MAX = 40;
		//Get the number of bars for the graph.
		System.out.print("How many bars do you need on this bar chart: ");
		int size = in.nextInt();
		//Create the array with the size provided.
		double[] values = new double [size];
		//Populate the array with the values.
		System.out.println("Please enter the values for each bar.");
		for (int i = 0; i < size; i++)
		{
			System.out.print((i+1) + ". ");
			values[i] = in.nextInt();
		}
		in.close();
		//Find the largest value in the array.
		double maxElement = values[0];
		for (int i = 1; i < size; i++)
		{
			if (maxElement < values[i])
			{
				maxElement = values[i];
			}
		}
		//Create the bar graph using for-loops
		for (int i = 0; i < size; i++)
		{
			double bar = MAX * (values[i]/maxElement);
			for (int j = 0; j < bar; j++)
			{
				System.out.print("*");
			}
			System.out.println();
		}
		
	}

}
