//Tommy Hudson Letter program
package e3point15;

public class Letter 
{
	/**
	 * Instance variables.
	 */
	private String sender;
	private String recipient;
	private String body;
	/**
	 * Construct a letter object with the names of the recipient and sender as well as a body containing only a newline character.
	 * @param from whom the letter is being sent from
	 * @param to whom the letter is being sent to
	 */
	public Letter(String from, String to)
	{
		sender = from;
		recipient = to;
		body = "\n";
	}
	/**
	 * Method to add a line to the body.
	 * @param line the line being added
	 */
	public void addLine (String line)
	{
		body += line + "\n";
	}
	/**
	 * Method to parse the letter and return it as a string.
	 * @return the letter
	 */
	public String getText()
	{
		String letter = "Dear " + recipient + ":\n" + body + "\nSincerely,\n\n" + sender;
		return letter;
	}
}
