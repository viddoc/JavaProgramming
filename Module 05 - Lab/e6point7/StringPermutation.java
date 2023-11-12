//Tommy Hudson StringPermutation program
package e6point7;

import java.util.Random;
import java.util.Scanner;

public class StringPermutation 
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
		Random rand = new Random();
		
		String input, first, middle, last, output;
		int i, j;
		
		System.out.print("Please enter a word: ");
		input = in.next();
		output = "";
		
		
		//For-loop to run as many times as the length of the input word
		for(int k = 0; k < input.length(); k++)
		{
            //Find a random integer for i and j. Neither can be in the last position and j has to be greater than i.
            int max = input.length()-1;
			i = rand.nextInt(max);
            int min = i+1;
			j = rand.nextInt((max-min+1)+min);		
			
			if(i == 0)													
			{
				first = "";
			}
			else
			{
				first = input.substring(0, i);
			}
			
			if(i + 1 == j)
			{
				middle = "";
			}
			
			else
			{
				middle = input.substring(i + 1, j);
			}
			
			if(j == input.length() - 1)
			{
				last = "";
			}
			else
			{
				last = input.substring(j + 1, input.length());
			}
			
			// Set the word variable using the combination from the loop iteration
			output = first + input.substring(j, j + 1) + middle + input.substring(i, i + 1) + last;
		}
		
		System.out.println(output);
	    in.close();
    }    
}
