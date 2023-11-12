//Tommy Hudson RecursiveBinary program
package e13point5;

import java.util.Scanner;

public class RecursiveBinary 
{
	public static void main(String[] args)
	{
		Scanner in = new Scanner(System.in);
		int number;
		System.out.println("This program is designed to convert any number into its binary digit representation.");
		System.out.print("Please enter a number to see the binary of that number: ");
		number = in.nextInt();
		System.out.println(convert(number));
		in.close();
	}
	
	public static String convert(int number)
	{
		if (number == 0) 
		{
            return "0";
        } 
		else if (number == 1) 
		{
            return "1";
        } 
		else 
		{
            int modded = number % 2;
            int divided = number / 2;
            String binary = convert(divided);
            return binary + modded;
		}
	}
}
