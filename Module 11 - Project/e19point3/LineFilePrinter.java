package e19point3;

import java.util.stream.Stream;
import java.io.IOException;
import java.io.FileNotFoundException;
import java.io.File;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;

public class LineFilePrinter 
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
		lines = lines.filter(line -> line.contains("the "));
		lines.forEach(System.out::println);
		in.close();
	}
}

