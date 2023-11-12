//Tommy Hudson WordCompare program
package e5point5;
/**
 * Import Scanner for user input.
 */
import java.util.Scanner;
/**
 * Class to compare the first half of an input word with the second half of that word.
 */
public class WordCompare 
{

	public static void main(String[] args) 
	{
		/**
		 * Create Scanner object.
		 */	
		Scanner in = new Scanner(System.in);
		/**
		 * Ask for word to be input then calculate the halves of that word.
		 */
		System.out.print("Please enter one word for comparison: ");
		String word = in.next();
		int length = word.length();
		String half1 = word.substring(0, length/2);
		String half2 = word.substring(length/2);
		/**
		 * Compare the halves against each other and output the results.
		 */
		if(half1.equals(half2))
		{
			System.out.println("First and second half same.");
		}
		else
		{
			System.out.println("First and second half different.");
		}
		/**
		 * Close the Scanner object.
		 */
		in.close();

	}

}
