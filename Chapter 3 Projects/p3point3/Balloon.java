//Tommy Hudson Balloon program
package p3point3;
/**
 * Class designed to be able to create a balloon object, inflate that balloon, and return the volume.
*/
public class Balloon {
	
	/**
	 * Declare the instance variable for radius.
	 */
	private double r;
	/**
	 * Constructor to initialize Balloon object.
	 */
	public Balloon()
	{
		r = 0;
	}
	/** 
	 * Will inflate our balloon increasing the radius by the amount supplied.
	 * @param amount the amount to increase radius by
	*/
	public void inflate (double amount)
	{
		r += amount;
	}
	/**
	 * Will calculate and return the current volume of the balloon.
	 * @return
	 */
	public double getVolume()
	{
		double volume = ((4.0/3.0)*(Math.PI)*(r*r*r));
		return volume;
	}

}
