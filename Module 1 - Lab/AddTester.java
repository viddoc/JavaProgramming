//Tommy Hudson AddTester Program
import java.awt.Rectangle;
import java.awt.Point;

public class AddTester
{
	public static void main(String[] args) 
	{
	    Rectangle box = new Rectangle(5, 10, 20, 30);
        box.add(0, 0);
        
        Point location = box.getLocation();
        double width = box.getWidth();
        double height = box.getHeight();
        
        System.out.println("Expected Location: 0, 0");
        System.out.print("Location: ");
        System.out.println(location);
        System.out.println("Expected Width: 25");
        System.out.print("Width: ");
        System.out.println(width);
        System.out.println("Expected Height: 40");
        System.out.print("Height: ");
        System.out.println(height);
	}
}
