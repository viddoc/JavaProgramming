//Tommy Hudson MeasurerTester program
package e10point7;

import java.awt.Rectangle;

/**
* This program demonstrates the use of a Measurer.
*/
public class MeasurerTester
{
   public static void main(String[] args)
   {
      //Create the measurer.
      Measurer areaMeas = new AreaMeasurer();
      //Create the rectangles.
      Rectangle[] rects = new Rectangle[] 
         {
            new Rectangle(5, 10, 20, 30),
            new Rectangle(10, 20, 30, 40),
            new Rectangle(20, 30, 5, 15)
         };
      //Find and print the average area.
      double averageArea = Data.average(rects, areaMeas);
      System.out.println("Average area: " + averageArea);
      System.out.println("Expected: 625");
      //Find and print the largest rectangle.
      Object largestRectangle = Data.largest(rects, areaMeas);
      System.out.println("Largest rectangle: " + largestRectangle);
      System.out.println("Expected: x=10,y=20,width=30,height=40");
   }
}

