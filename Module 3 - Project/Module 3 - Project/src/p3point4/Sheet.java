//Tommy Hudson Sheet Program
package p3point4;
/**
 * Class designed to calculate and display different paper size sheets in the ISO 216 standard.
 */
public class Sheet 
{
	/**
	 * Declare instance variables.
	 */
	private String name;
	private int number, width, height;
	/**
	 * Construct Sheet object with initial values.
	 */
	public Sheet()
	{
		width = 841;
		height = 1189;
		number = 0;
		name = "A" + number;
		
	}
	/**
	 * Cuts sheet in half to get new dimensions and name.
	 */
	public void cutInHalf()
	{
		if(height > width)
		{
			height /= 2;
			number++;
			name = "A" + number;
		}
		
		else
		{
			width /= 2;
			number++;
			name = "A" + number;
		}
		
	}
	/**
	 * Gets the name of the paper sheet.
	 * @return name of the sheet
	 */
	public String getName()
	{
		return name;
	}
	/**
	 * Gets the width of the paper sheet.
	 * @return width
	 */
	public int getWidth()
	{
		return width;
	}
	/**
	 * Gets the height of the paper sheet.
	 * @return height
	 */
	public int getHeight()
	{
		return height;
	}
}
