//Tommy Hudson WordFileReader program
package e19point2;

import java.util.stream.Stream;
import java.io.IOException;
import java.io.FileNotFoundException;
import java.io.File;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;

public class WordFileReader 
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
		Stream<String> words = wordList.stream().flatMap(line -> Stream.of(line.split("\\s+")));
		long count = words.filter(word -> word.equals("the")).count();
		System.out.println("The number of words that are the word 'the' is: " + count);
		in.close();

	}
	
}
