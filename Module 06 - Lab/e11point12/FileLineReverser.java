//Tommy Hudson FileLineReverser Program
package e11point12;

import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Scanner;

//Class designed to read input from a user specified input file and reverse each line to an output file also specified by the user.
public class FileLineReverser 
{

	public static void main(String[] args) throws Exception, IOException
	{
		if (args.length != 2) 
		{
            System.out.println("Usage: ReverseLines <input_file> <output_file>");
            System.exit(1);
        }
        // Create a File object for the input file.
        File inputFile = new File(args[0]);
        // Check if the input file exists.
        if (!inputFile.exists()) 
        {
            System.out.println("Input file does not exist.");
            System.exit(1);
        }
        // Create a Scanner object to read the input file.
        Scanner in = new Scanner(inputFile);
        // Create a PrintWriter object to write the output file.
        File outputFile = new File(args[1]);
        PrintWriter writer = new PrintWriter(outputFile);
        //ArrayList to hold each line.
        ArrayList<String> lines = new ArrayList<String>();
        // Read each line in the input file.
        while (in.hasNextLine()) 
        {
        	String line = in.nextLine();
        	lines.add(line);
        }
        // Reverse the order of the lines and write to the output file.
        for (int i = lines.size() - 1; i >= 0; i--) 
        {
            writer.write(lines.get(i) + "\n");   
        }
        // Close the Scanner and PrintWriter objects.
        in.close();
        writer.close();

	}

}
