//Tommy Hudson PerimeterTester program
import java.awt.Rectangle;

public class PerimeterTester
{
	public static void main(String[] args) 
	{
		Rectangle square = new Rectangle(0,0,15,15);
		double width = square.getWidth();
		double height = square.getHeight();
		double perimeter = (2*width)+(2*height);
		System.out.println("Expected Perimeter: 60.0");
		System.out.print("Perimeter: ");
		System.out.println(perimeter);
	}
}
