//Tommy Hudson Geometry program
package e8point7;

public class Geometry
{
   
    public Geometry()
    {
    }
    /**
    * Method to calculate the Volume of a Cube.
    * @param h the height of a side.
    * @return the volume of the cube.
    */
    public static double cubeVolume(double h)
    {
        return Math.pow(h, 3);
    }
    /**
     * Method to calculate the Surface Area of a Cube.
     * @param h the height of a side.
     * @return the surface area of the cube.
     */
    public static double cubeSurface(double h)
    {
        return 6*(Math.pow(h, 2));
    }
    /**
     * Method to calculate the Volume of a Sphere.
     * @param r the radius of the sphere.
     * @return the volume of the sphere.
     */
    public static double sphereVolume(double r)
    {
        return ((4/3)*Math.PI*(Math.pow(r, 3)));
    }
    /**
     * Method to calculate the Surface Area of a Sphere.
     * @param r the radius of the sphere.
     * @return the surface area of the sphere.
     */
    public static double sphereSurface(double r)
    {
        return (4*Math.PI*Math.pow(r, 2));
    }
    /**
     * Method to calculate the Volume of a Cylinder.
     * @param r the radius of the cylinder.
     * @param h the height of the cylinder.
     * @return the volume of the cylinder.
     */
    public static double cylinderVolume(double r, double h)
    {
        return (Math.PI*Math.pow(r, 2)*h);
    }
    /**
     * Method to calculate the Surface Area of a Cylinder.
     * @param r the radius of the cylinder.
     * @param h the height of the cylinder.
     * @return the surface area of the cylinder.
     */
    public static double cylinderSurface(double r, double h)
    {
        return (2*Math.PI*r*h)+(2*Math.PI*Math.pow(r, 2));
    }
    /**
     * Method to calculate the Volume of a Cone.
     * @param r the radius of the cone.
     * @param h the height of the cone.
     * @return the volume of the cone.
     */
    public static double coneVolume(double r, double h)
    {
        return (Math.PI*Math.pow(r,2)*(h/3));
    }
    /**
     * Method to calculate the Surface Area of a Cone.
     * @param r the radius of the cone
     * @param h the height of the cone
     * @return the surface area of the cone
     */
    public static double coneSurface(double r, double h)
    {
        return (Math.PI*r)*(r+(Math.sqrt((Math.pow(h, 2)+Math.pow(r, 2)))));
    }
}