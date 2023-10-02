//Tommy Hudson Geometry program
package e8point11;

import java.awt.geom.Ellipse2D;

public class Geometry 
{
	public Geometry()
    {
    }
    /**
    * Method to calculate the Perimeter/Circumference of an Ellipse
    * @param e the ellipse object
    * @return the perimeter of the ellipse
    */
    public static double perimeter(Ellipse2D.Double e)
    {
    	//Find the minor-axis and major-axis and then calculate and return the perimeter
    	double b = e.getHeight()/2;
    	double a = e.getWidth()/2;
    	double h = Math.pow((a-b), 2) / Math.pow((a+b), 2);
      
    	return Math.PI*(a+b)*(1+(3*h)/10+Math.sqrt(4-3*h)); 
    } 
    /**
    * Method to calculate the Area of an Ellipse
    * @param e the ellipse object
    * @return the area of the ellipse
    */
    public static double area(Ellipse2D.Double e)
    {
    	//Find the minor-axis and major-axis and then calculate and return the area
    	double b = e.getHeight()/2;
        double a = e.getWidth()/2;
        
        return Math.PI*a*b;
    }
}
