//Tommy Hudson Reverse program
package e11point11;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;
import java.util.ArrayList;
//Class to take an input file and reverse the output to the same file.
public class Reverse 
{
    public static void main(String[] args) throws FileNotFoundException, IOException
    {
    	//Make sure that the argument usage is correct.
    	if (args.length != 1) 
		{
            System.out.println("Usage: Reverse <input_file>");
            System.exit(1);
        }
    	//Place input file into variable.
        File inputFile = new File(args[0]);
        //Check to make sure the file exists.
        if (!inputFile.exists()) 
        {
            System.out.println("Input file does not exist.");
            System.exit(1);
        }
        //Create Scanner to read input file.
        Scanner in = new Scanner(inputFile);
        //Create Array List to hold the reversed input.
        ArrayList<String> strArrayList = new ArrayList<String>();
        //Pull the input data from the file.
        while (in.hasNextLine())
        {
        	//Pull a line then reverse it then add it to the Array List.
        	String input = in.nextLine();
        	input = new StringBuilder(input).reverse().toString();
            strArrayList.add(input);
        }
        //Close the Scanner and open a PrintWriter to output the data to the same file.
        in.close();
        PrintWriter out = new PrintWriter(inputFile);
        //Enhanced For-Loop to output to the same file.
        for (String string : strArrayList)
        {
            out.println(string);
        }
        //Close the PrintWriter
        out.close();
    }
}
