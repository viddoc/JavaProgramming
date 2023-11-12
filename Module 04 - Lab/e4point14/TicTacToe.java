//Tommy Hudson TicTacToe program
package e4point14;
/**
 * Class to print a tic-tac-toe playing board.
 */
public class TicTacToe 
{
	public static void main(String[] args)
	{
		/**
		 * String variables to be called to create the board.
		 */
		String bottomLine = "+--+--+--+\n";
		String comb = "+--+--+--+\n|  |  |  |\n";
		/**
		 * Print the board by calling the variables.
		 */
		System.out.print(comb+comb+comb+bottomLine);
	}
}
