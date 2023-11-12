//Tommy Hudson Bug program
package e3point16;

public class Bug 
{
	/**
	 * Instance Variables.
	 */
	private int bugPosition;
	private String bugDirection;
	/**
	 * Construct Bug object with initial position and direction of movement.
	 * @param initialPosition the initial position
	 */
	public Bug(int initialPosition)
	{
		this.bugPosition = initialPosition;
		this.bugDirection = "Right";
	}
	/**
	 * Method to control direction of movement.
	 */
	public void turn()
	{
		if(this.bugDirection == "Right")
		{
			this.bugDirection = "Left";
		}
		else
		{
			this.bugDirection = "Right";
		}
	}
	/**
	 * Method to update position of the Bug.
	 */
	public void move() 
	{
		if(this.bugDirection == "Right")
		{
			this.bugPosition++;
		}
		else
		{
			this.bugPosition--;
		}
	}
	/**
	 * Method to return the Bug position.
	 * @return Bug position
	 */
	public int getPosition()
	{
		return bugPosition;
	}
	
}
