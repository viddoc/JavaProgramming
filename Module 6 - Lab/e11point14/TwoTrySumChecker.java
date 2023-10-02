//Tommy Hudson TwoTrySumChecker program
package e11point14;

import java.util.InputMismatchException;
import java.util.Scanner;
//Class to ask a user to input numbers then check that a number was entered. If two consecutive non-numbers are entered the program will output the sum of the correct numbers and end.
public class TwoTrySumChecker 
{
	public static void main(String[] args)
	{
	// Create a Scanner object.
    Scanner in = new Scanner(System.in);
    // Variable for the sum of input numbers.
    double sum = 0.0, value = 0.0;
    boolean error = false;
    // Ask the user to enter numbers until they enter a value that is not a number.
    System.out.println("Enter a series of numbers to have the sum printed for you.");
    System.out.println("Any non-numbers entered will produce an error, two consecutive errors will stop the program.");
    System.out.println("Enter two non-numbers consecutively to end the program.");
    while (error == false) 
    {
        // Try to a number from the user.
        try {
        	System.out.print("Enter any number: ");
        	value = in.nextDouble();
            sum += value;
        	} 
        catch (InputMismatchException e) 
        {
            // If the user entered a value that is not a number give them a second chance.
            System.out.print("Invalid input. Please enter any number: ");
            in.next();
            // If the user enters a value that is not a number again, quit reading input.
            try 
            {
                value = in.nextDouble();
                sum += value;
            } 
            catch (InputMismatchException ex) 
            {
                System.out.println("Too many invalid inputs in a row, ending program");
                error = true;
                break;
            }
        }
    }
    // Close the Scanner object.
    in.close();
    // Print the sum of numbers entered correctly.
    System.out.println("The sum of the numbers entered correctly is: " + sum);
	}
}
