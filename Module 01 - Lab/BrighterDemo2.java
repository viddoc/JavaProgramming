//Tommy Hudson BrighterDemo2 Program
import java.awt.Color;
import javax.swing.JFrame;

public class BrighterDemo2
{
    public static void main(String[] args)

    {

        Color example = new Color(100, 100, 150);
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
        
        JFrame frame = new JFrame();
        frame.setSize(200, 200);
        Color myColor = brighterColor;
        frame.getContentPane().setBackground(myColor);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}