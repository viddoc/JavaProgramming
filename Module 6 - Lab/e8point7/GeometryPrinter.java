//Tommy Hudson GeometryPrinter program
package e8point7;

import java.util.Scanner;
import java.text.DecimalFormat;

public class GeometryPrinter 
{
    public static void main(String[] args)
    {
        //Create scanner for user input.
        Scanner in = new Scanner(System.in);
        //Create object to format the output in precision format.
        DecimalFormat ft = new DecimalFormat("#.##");
        //Get the radius and height from the user.
        System.out.print("Please enter the radius of an object: ");
        double radius = in.nextDouble();
        System.out.print("Please enter the height of an object: ");
        double height = in.nextDouble();
        //Close the scanner.
        in.close();
        //Output each methods return.
        System.out.println("The volume of a cube with a height of " + height + " is " + ft.format(Geometry.cubeVolume(height)));
        System.out.println("The surface area of a cube with a height of " + height + " is " + ft.format(Geometry.cubeSurface(height)));
        System.out.println("The volume of a sphere with a radius of " + radius + " is " + ft.format(Geometry.sphereVolume(radius)));
        System.out.println("The surface area of a sphere with a radius of " + radius + " is " + ft.format(Geometry.sphereSurface(radius)));
        System.out.println("The volume of a cylinder with a height of " + height +" and a radius of " + radius + " is " + ft.format(Geometry.cylinderVolume(radius,height)));
        System.out.println("The surface area of a cylinder with a height of " + height +" and a radius of " + radius + " is " + ft.format(Geometry.cylinderSurface(radius,height)));
        System.out.println("The volume of a cone with a height of " + height +" and a radius of " + radius + " is " + ft.format(Geometry.coneVolume(radius,height)));
        System.out.println("The surface area of a cone with a height of " + height +" and a radius of " + radius + " is " + ft.format(Geometry.coneSurface(radius,height)));
    }
}
