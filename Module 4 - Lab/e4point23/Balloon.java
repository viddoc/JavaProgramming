//Tommy Hudson Balloon program
package e4point23;
/**
 * Class used to create a balloon with 0 volume with the volume able to be changed and surface area and radius calculated and retrieved.
 */
public class Balloon 
{
	/**
	 * Instance variables necessary.
	 */
	private double volume,radius;
	/**
	 * Constructor for the Balloon object.
	 */
	public Balloon()
	{
		volume = 0;
		radius = 0;
	}
	/**
	 * Adds air to increase the volume of the balloon and calculates the new radius of the balloon.
	 * @param amount to increase the volume by
	 */
	public void addAir(double amount)
	{
		volume += amount;
		radius = Math.cbrt(((3*volume)/(4*Math.PI)));
	}
	/**
	 * Gets the current volume of the balloon.
	 * @return volume of the balloon
	 */
	public double getVolume()
	{ 
		return volume;
	}
	/**
	 * Gets the current surface area of the balloon.
	 * @return surface area of the balloon
	 */
	public double getSurfaceArea()
	{
		double surfaceArea = (4*Math.PI*Math.pow(radius, 2));
		return surfaceArea;
	}
	/**
	 * Gets the current radius of the balloon.
	 * @return radius of the balloon
	 */
	public double getRadius()
	{
		return radius;
	}
}

