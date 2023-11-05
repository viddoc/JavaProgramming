//Tommy Hudson LineFileReader program
package e19point1;

import java.util.stream.Stream;
import java.io.IOException;
import java.io.FileNotFoundException;
import java.io.File;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;

public class LineFileReader 
{

	public static void main(String[] args) throws IOException, FileNotFoundException
	{
		String filename = "inputfile.txt"; 
		Scanner in = new Scanner(new File(filename));
		List<String> wordList = new ArrayList<>();
		while(in.hasNextLine())
		{
			wordList.add(in.nextLine());
		}
		Stream<String> lines = wordList.stream();
		long count = lines.filter(line -> line.contains("the ")).count();
		System.out.println("The number of lines containing the word 'the' is: " + count);
		in.close();

	}

}
