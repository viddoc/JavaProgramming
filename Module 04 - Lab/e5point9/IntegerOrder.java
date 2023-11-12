//Tommy Hudson IntegerOrder program
package e5point9;
/**
 * Import Scanner for user input.
 */
import java.util.Scanner;
/**
 * Class designed to ask the user to input three integers and determine if they are in order (either ascending or descending) or not in order.
 */
public class IntegerOrder 
{

	public static void main(String[] args) 
	{
		/**
		 * Create the Scanner.
		 */
		Scanner in = new Scanner(System.in);
		/**
		 * Prompt for user input and create strings to hold the values for simplified outputs.
		 */
		System.out.println("Please enter three numbers.");
		System.out.print("1: ");
		int first = in.nextInt();
		System.out.print("2: ");
		int second = in.nextInt();
		System.out.print("3: ");
		int third = in.nextInt();
		String numbers = first + " " + second + " " + third;
		String inOrder = numbers + " in order";
		String notInOrder = numbers + " not in order";
		/**
		 * Use if and else if statements to determine if the integers are in order or not.
		 */
		if(first<second && second<third)
		{
			System.out.println(inOrder);
		}
		else if(first>second && second>third)
		{
			System.out.println(inOrder);
		}
		else
		{
			System.out.println(notInOrder);
		}
		/**
		 * Close the Scanner object.
		 */
		in.close();
	}

}
