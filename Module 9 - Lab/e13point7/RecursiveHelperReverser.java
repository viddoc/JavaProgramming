//Tommy Hudson RecursiveHelperReverser program
package e13point7;

import java.util.Scanner;

public class RecursiveHelperReverser 
{

	public static void main(String[] args) 
	{
		Scanner in = new Scanner(System.in);
		String word;
		int start = 0;
		System.out.println("This program is designed to reverse any word or phrase that you enter.");
		System.out.print("Please enter the word or phrase you would like reversed: ");
		word = in.next();
		in.close();
		int end = word.length();
		System.out.println(reverse(word, start, end));

	}
	
	public static String reverse(String word, int start, int end)
	{
		return word.substring(0,start) + reverse(word.substring(start, end)) + word.substring(end, word.length());
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
