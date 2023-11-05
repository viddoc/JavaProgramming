//Tommy Hudson Words program

package p19point5;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Comparator;
import java.util.HashSet;
import java.util.List;
import java.util.stream.Stream;
import java.util.stream.Collectors;

public class Words 
{

    public static void main(String[] args) throws IOException 
    {
        try (Stream<String> lines = Files.lines(Paths.get("words.txt"))) 
        {
            long count = lines
                    .filter(w -> !w.endsWith("'s"))
                    .filter(w -> hasUniqueVowels(w))
                    .count();
            System.out.println("Number of words with five unique vowels: " + count);
        }

        try (Stream<String> lines = Files.lines(Paths.get("words.txt"))) 
        {
            List<String> examples = lines
                    .filter(w -> !w.endsWith("'s"))
                    .filter(w -> hasUniqueVowels(w))
                    .limit(20)
                    .collect(Collectors.toList());
            System.out.println("20 words with five unique vowels: " + examples);
        }

        try (Stream<String> lines = Files.lines(Paths.get("words.txt"))) 
        {
            String shortest = lines
                    .filter(w -> !w.endsWith("'s"))
                    .filter(w -> hasUniqueVowels(w))
                    .min(Comparator.comparing(String::length))
                    .orElse("");
            System.out.println("Shortest: " + shortest);
        }

        try (Stream<String> lines = Files.lines(Paths.get("words.txt"))) 
        {
            List<String> allShortest = lines
                    .filter(w -> !w.endsWith("'s"))
                    .filter(w -> hasUniqueVowels(w))
                    .filter(w -> w.length() == 7)
                    .collect(Collectors.toList());
            System.out.println("All of that length: " + allShortest);
        }
    }

    public static boolean hasUniqueVowels(String word) 
    {
            HashSet<Character> vowels = new HashSet<>();
            for (char c : word.toLowerCase().toCharArray()) 
            {
                if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u') 
                {
                	//Return false if the vowel has already been seen
                    if (vowels.contains(c)) 
                    {
                        return false;
                    }
                    //Add to the set if it is unique
                    else 
                    {
                        vowels.add(c);
                    }
                }
            }
            //Return true for words with 5 unique vowels in the set
            return vowels.size() == 5;
        }
}

