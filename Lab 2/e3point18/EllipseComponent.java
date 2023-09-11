//Tommy Hudson EllipseComponent program
package e3point18;

import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Color;
import java.awt.geom.Ellipse2D;
import javax.swing.JComponent;

public class EllipseComponent extends JComponent 
{
	/**
	 * Create component to draw an Ellipse.
	 */
	public void paintComponent(Graphics g)
	{
		Graphics2D g2 = (Graphics2D) g;
		Ellipse2D.Double largeEllipse = new Ellipse2D.Double(3,3,getWidth()-6, getHeight()-6);
		
		g2.draw(largeEllipse);
		g2.setColor(Color.red.darker().darker());
		g2.fill(largeEllipse);
	}
}
