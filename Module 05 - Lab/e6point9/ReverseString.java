//Tommy Hudson ReverseString program
package e6point9;

import java.util.Scanner;

public class ReverseString 
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        //String variables to hold the input string and the reversed string.
        String input, output;
        //Get string from the user.
        System.out.print("Please enter a word: ");
        input = in.next();
        output = "";
        //Use for loop to populate the output variable with the chars in reverse from the input.
        for (int i = input.length()-1; i >= 0; i--)
        {
            output += input.charAt(i);
        }
        System.out.print(output);

        in.close();
    }    
}
