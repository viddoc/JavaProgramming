//Tommy Hudson Checkerboard program
package p6point20;

import javax.swing.JFrame;
//Class to build the Checkerboard Component
public class Checkerboard 
{
	public static void main(String[] args)
	{
		//Create the frame and the component
		JFrame board = new JFrame();
		CheckerboardComponent component = new CheckerboardComponent();
		//Set title and 
		board.setTitle("Checkerboard");
		board.add(component);
		board.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		board.setSize(900, 900);
		board.setResizable(true);
		board.setVisible(true);

	}
}