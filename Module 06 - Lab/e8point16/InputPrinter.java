//Tommy Hudson InputPrinter program
package e8point16;

import java.util.Scanner;

public class InputPrinter 
{

	public static void main(String[] args) 
	{
		//Create Scanner object
		Scanner in = new Scanner(System.in);
		//Minimum and maximum variables
		int min = 10, max = 79;
		//String prompt and error messages
		String prompt = "Please enter a number from " + min + " to " + max + " : ";
		String error = "Error. Number not within range. Please try again: ";
		//Call method
		Input.readInt(in, prompt, error, min, max);
		//Success 
		System.out.println("Success!");
		//Close Scanner object
		in.close();

	}

}
