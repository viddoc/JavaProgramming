//Tommy HUdson Input program
package e8point16;

import java.util.Scanner;

public class Input 
{
	public Input()
	{
		
	}
	/**
	 * Method to display a prompt for the user to input an integer between a minimum and maximum number, test the number, 
	 * and return the number if acceptable or give an error message and have them try again.
	 * @param in the number input by user
	 * @param prompt the prompt for the user to input an integer
	 * @param error the message to be displayed if there is an error
	 * @param min the minimum number to be allowed
	 * @param max the maximum number to be allowed
	 * @return the acceptable integer
	 */
	public static int readInt(Scanner in, String prompt, String error, int min, int max)
	{
		System.out.print(prompt);
		int input = in.nextInt();
		//While loop for data validation.
		while (input <= min || input >= max)
		{
			System.out.println(error);
			input = in.nextInt();
		}
		return input;
	}
}
