//Tommy Hudson CheckerboardComponent program
package p6point20;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import javax.swing.JComponent;

public class CheckerboardComponent extends JComponent 
{

	public void paint(Graphics g) 
    {
        Graphics2D g2 = (Graphics2D) g;
        //Set starting position to 0,0
        int xPosition = 0;
        int yPosition = 00;
        //Outside loop to run 8 times to create 8 rows and columns of 8 squares.
        for (int i = 0; i < 8; i++) 
        {
        	//Inside loop to run 8 times to create a square and fill it with color each iteration
            for (int j = 0; j < 8; j++) 
            {
            	xPosition = j * 100;
            	yPosition = i * 100;
            	//Determine if square will be white or black on this pass.
            	if (i % 2 == j % 2) 
            	{
            		g2.setColor(Color.white);
            	} 
            	else 
            	{
            		g2.setColor(Color.black);
            	}
            	//Fill the square with color.
            	g2.fillRect(xPosition, yPosition, 100, 100);
            }
         }
    }
}
