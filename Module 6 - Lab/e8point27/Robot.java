//Tommy Hudson Robot program
package e8point27;

import java.awt.Point;
/**
 * Class to move a robot on an infinite plane, keeping track of coordinate position and direction of travel.
 */
public class Robot 
{
	//Instance variables
	private int xPosition, yPosition;
	private String direction;
	/**
	 * Constructors
	 * @param x is the starting x coordinate
	 * @param y is the starting y coordinate
	 */
	public Robot(int x, int y)
	{
		this.xPosition = x;
		this.yPosition = y;
		this.direction = "N";
	}
	/**
	 * Method to turn the robot left. Uses a switch statement to change the direction.
	 */
	public void turnLeft()
	{
		switch (direction)
		{
			case "N": direction = "W"; break;
			case "W": direction = "S"; break;
			case "S": direction = "E"; break;
			case "E": direction = "N"; break;
		}
	}
	/**
	 * Method to turn the robot right. Uses a switch statement to change the direction.
	 */
	public void turnRight()
	{
		switch (direction)
		{
			case "N": direction = "E"; break;
			case "W": direction = "N"; break;
			case "S": direction = "W"; break;
			case "E": direction = "S"; break;
		}
	}
	/**
	 * Method to move the robot one space depending on the direction it is traveling.
	 */
	public void move()
	{
		switch (direction)
		{
			case "N": yPosition += 1; break;
			case "W": xPosition -= 1; break;
			case "S": yPosition -= 1; break;
			case "E": xPosition += 1; break;
		}
	}
	/**
	 * Method to get the current location of the robot using a Point type.
	 * @return the location of the robot
	 */
	public Point getLocation()
	{
		Point location = new Point(xPosition,yPosition);
		return location;
	}
	/**
	 * Method to get the current direction the robot is traveling.
	 * @return the direction that the robot is traveling
	 */
	public String getDirection()
	{
		return direction;
	}
}
