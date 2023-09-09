//Tommy Hudson BrighterDemo Program
import java.awt.Color;

public class BrighterDemo
{
    public static void main(String[] args)

    {

        Color example = new Color(50, 100, 150);
        Color brighterColor = example.brighter();
        int red = brighterColor.getRed();
        int green = brighterColor.getGreen();
        int blue = brighterColor.getBlue();
        System.out.print("Red: ");
        System.out.println(red);
        System.out.print("Green: ");
        System.out.println(green);
        System.out.print("Blue: ");
        System.out.println(blue);
    }
}