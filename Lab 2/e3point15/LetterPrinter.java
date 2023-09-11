//Tommy Hudson LetterPrinter program
package e3point15;

public class LetterPrinter 
{

	public static void main(String[] args) 
	{
		Letter dearJohn = new Letter("Mary","John");
		dearJohn.addLine("I am sorry we must part.");
		dearJohn.addLine("I wish you all the best.");
		System.out.print(dearJohn.getText());

	}

}
