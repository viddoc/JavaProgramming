//Tommy Hudson FunWithMonths program
package e4point18;
/**
 * Import Scanner for user input.
 */
import java.util.Scanner;
/**
 * Class to convert the number of a month input by user into the name of that month using str.substring.
 */
public class FunWithMonths 
{

	public static void main(String[] args) 
	{
		/**
		 * Create Scanner object.
		 */
		Scanner in = new Scanner(System.in);
		/**
		 * Create string with months at 10 character intervals.
		 */
		String months = "January   February  March     April     May       June      July      August    September October   November  December  ";
		/**
		 * Ask for user input and then calculate which month to output.
		 */
		System.out.print("Please enter the number of a month to see the name: ");
		int input = in.nextInt();
		int end = input*10;
		int start = end-10;
		System.out.print(months.substring(start, end));
		/**
		 * Close the Scanner object.
		 */
		in.close();
	}

}
