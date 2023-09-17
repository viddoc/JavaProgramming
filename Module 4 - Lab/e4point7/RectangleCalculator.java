//Tommy Hudson RectangleCalculator program
package e4point7;
/**
 * Import Scanner for user input.
 */
import java.util.Scanner;
/**
 * Class to calculate Area, Perimeter, and the Diagonal through a rectangle.
 */
public class RectangleCalculator
{
	public static void main(String[] args)
	{
		/**
		 * Create Scanner object.
		 */
		Scanner in = new Scanner(System.in);
		/**
		 * Prompt user for Height and Width.
		 */
		System.out.println("Please enter the height and width of a rectangle.");
		System.out.print("Height: ");
		double height = in.nextDouble();
		System.out.print("Width: ");
		double width = in.nextDouble();
		/**
		 * Perform and print calculations.
		 */
		System.out.println("Area: " + (width*height));
		System.out.println("Perimeter: " + ((2*width)+(2*height)));
		System.out.println("Diagonal: " + (Math.sqrt((Math.pow(height, 2))+(Math.pow(width, 2)))));
		/**
		 * Close the Scanner object.
		 */
		in.close();
	}
}
