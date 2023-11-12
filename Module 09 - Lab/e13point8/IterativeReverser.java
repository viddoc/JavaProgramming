//Tommy Hudson IterativeReverser program
package e13point8;

import java.util.Scanner;

public class IterativeReverser 
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
  		StringBuilder reversedWord = new StringBuilder();
  		for (int i = word.length() - 1; i >= 0; i--) 
		{
    		reversedWord.append(word.charAt(i));
  		}
  		return reversedWord.toString();
	}
}

