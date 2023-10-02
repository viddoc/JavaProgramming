//Tommy Hudson InputAverager program
package e11point7;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;
//Class that will take an input text file with lines of numbers and average those numbers. If the line is blank it will show an average of 0 for that line.
public class InputAverager 
{
	public static void main(String[] args) throws FileNotFoundException, IOException
	{
		//Create file object to open the input file.
		File inputFile = new File("inputAverager.txt");
		//Create scanner object to read the input file.
	    Scanner in = new Scanner(inputFile);
	    //Create string to hold each line that is read in.
	    String line;
	    //Variable to keep track of which line is being processed.
	    int row = 0;
	    //While loop to read each line and process it.
		while (in.hasNextLine()) 
		{
			row++;
			//Assign the string a line from the input file.
			line = in.nextLine();
			//If the string is not empty execute this if-statement.
			if (!line.trim().isEmpty()) 
			{
				//Create a string array of each line by splitting the numbers by the space char.
				String[] numbers = line.split(" ");
				//Will hold the total value of the line.
			    double sum = 0;
			    //Will hold the number of values in the line.
			    int count = 0;
			    //Enhanced for-loop to calculate each line's sum and number of values.
			    for (String num : numbers) 
			    {
			    	//Parse the value of the string.
			    	sum += Double.parseDouble(num);
			        count++;
			    }
			    //Print the output to the console of the Average.
			    System.out.println("Average of row " + row + ": " + sum / count);
			}
			//The line is empty so it should print zero.
			else 
			{
				System.out.println("Average of row " + row + ": 0");
			}
		}
		//Close the Scanner.
		in.close();
    }
}