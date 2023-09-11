//Tommy Hudson Moth program
package e3point17;

public class Moth 
{
	/**
	 * Instance variable
	 */
	private double mothPosition;
	/**
	 * Construct a Moth with a initial position.
	 * @param initialPosition is the position the moth starts
	 */
	public Moth(double initialPosition)
	{
		this.mothPosition = initialPosition;
	}
	/**
	 * Will move the moth half of the distance to the light.
	 * @param lightPosition The position that the Moth will be flying toward
	 */
	public void moveToLight(double lightPosition)
	{
		this.mothPosition += (lightPosition/2);
	}
	/**
	 * Gets the current position of the moth.
	 * @return Moth position
	 */
	public double getPosition()
	{
		return mothPosition;
	}
}
