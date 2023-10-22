//Tommy Hudson RecursiveReverser program
package e13point6;

import java.util.Scanner;

public class RecursiveReverser 
{

	public static void main(String[] args) 
	{
		Scanner in = new Scanner(System.in);
		String word;
		System.out.println("This program is designed to reverse any word or phrase that you enter.");
		System.out.print("Please enter the word or phrase you would like reversed: ");
		word = in.next();
		in.close();
		System.out.println(reverse(word));

	}

	public static String reverse(String word)
	{
		if ((word.isEmpty()) || (word.length() == 1))
		{
			return word;
		}
		else
		{
			return reverse(word.substring(1)) + word.charAt(0);
		}
	}
}
