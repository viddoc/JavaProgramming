//Tommy Hudson DarkerDemo program	
import java.awt.Color;

public class DarkerDemo 
{
	    public static void main(String[] args)

	    {

	        Color example = new Color(50, 100, 150);
	        Color darkerColor = example.RED.darker();
	        Color darkerDarker = darkerColor.RED.darker();
	        int red = darkerDarker.getRed();
	        int green = darkerDarker.getGreen();
	        int blue = darkerDarker.getBlue();
	        System.out.print("Red: ");
	        System.out.println(red);
	        System.out.print("Green: ");
	        System.out.println(green);
	        System.out.print("Blue: ");
	        System.out.println(blue);
	    }
}
