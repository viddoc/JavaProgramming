//Tommy Hudson IOIntegers program
package e4point3;
/**
 * Import Scanner for user input.
 */
import java.util.Scanner;
/**
 * Class to ask for user to input two integer numbers and do various calculations with them.
 */
public class IOIntegers 
{

	public static void main(String[] args) 
	{
		/**
		 * Create the Scanner object.
		 */
		Scanner in = new Scanner(System.in);
		/**
		 * Prompt for user entered numbers.
		 */
		System.out.println("Please enter two different numbers.");
		System.out.print("Number 1: ");
		int number1 = in.nextInt();
		System.out.print("Number 2: ");
		int number2 = in.nextInt();
		/**
		 * Calculate and output.
		 */
		System.out.println("Sum: " + (number1+number2));
		System.out.println("Difference: " + (number1-number2));
		System.out.println("Product: " + (number1*number2));
		System.out.println("Average: " + ((number1+number2)/2));
		System.out.println("Distance: " + (Math.abs(number1-number2)));
		System.out.println("Maximum: " + (Math.max(number1, number2)));
		System.out.println("Minimum: " + (Math.min(number1, number2)));
		/**
		 * Close the Scanner object.
		 */
		in.close();
	}

}
