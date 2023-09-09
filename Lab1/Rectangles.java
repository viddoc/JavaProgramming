//Tommy Hudson Rectangles program
import java.awt.Rectangle;

public class Rectangles
{
	public static void main(String[] args) 
	{
		Rectangle rect1 = new Rectangle(0,0,10,11);
		Rectangle rect2 = new Rectangle(50,50,6,7);
		double width1 = rect1.getWidth();
		double height1 = rect1.getHeight();
		double perimeter1 = (2*width1)+(2*height1);
		double width2 = rect2.getWidth();
		double height2 = rect2.getHeight();
		double area2 = width2*height2;
		System.out.print("Rectangle 1 Perimeter: ");
		System.out.println(perimeter1);
		System.out.print("Rectangle 1 Width: ");
		System.out.println(width1);
		System.out.print("Rectangle 1 Height: ");
		System.out.println(height1);
		System.out.print("Rectangle 2 Area: ");
		System.out.println(area2);
		System.out.print("Rectangle 2 Width: ");
		System.out.println(width2);
		System.out.print("Rectangle 2 Height: ");
		System.out.println(height2);			
	}
}
