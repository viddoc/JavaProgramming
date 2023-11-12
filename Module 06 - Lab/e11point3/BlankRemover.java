//Tommmy Hudson BlankRemover program
package e11point3;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

//Class to take input from a file, remove any blank lines at the beginning or end, and output back to the same file.
public class BlankRemover 
{
    //Use throws FileNotFoundException in case there is an issue with the input file.
    public static void main(String[] args) throws FileNotFoundException
    {
        //Create File object with the input text file.
        File inputFile = new File("inputBlankRemover.txt");        
        //Create Scanner object to read the input text file.
        Scanner in = new Scanner(inputFile);
        //Create String variable to hold the scanned text.
        String line = "";
        //While loop to read in the text from the file line by line.
        while (in.hasNextLine())
        {
            line += in.nextLine() + "\n";
        }
        //Close Scanner object
        in.close();
        //Trim the white spaces from the beginning and the end of the string.
        line = line.trim();
        //Create PrintWriter object to output to the same file. This overwrites the original data on the file.
        PrintWriter out = new PrintWriter(inputFile);
        //Print the String to the file.
        out.println(line);
        //Close the PrintWriter object.
        out.close();
    }
}
