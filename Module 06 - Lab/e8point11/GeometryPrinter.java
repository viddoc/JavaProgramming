//Tommy Hudson GeometryPrinter program
package e8point11;

import java.awt.geom.Ellipse2D;
import java.text.DecimalFormat;

public class GeometryPrinter 
{

	public static void main(String[] args) 
	{
		//Create ellipse object
		Ellipse2D.Double ellipse = new Ellipse2D.Double(0, 0, 30, 20);
		//Create object to format the output in precision format
        DecimalFormat ft = new DecimalFormat("#.##");
        //Output the results
		System.out.println("The perimeter of this ellipse is " + ft.format(Geometry.perimeter(ellipse)) + ".");
		System.out.println("The area of this ellipse is " + ft.format(Geometry.area(ellipse)) + ".");
	}

}
