//Tommy Hudson StringFinder program
package e13point9;

import java.util.Scanner;

public class StringFinder 
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        String word, search;
        System.out.println("This program allows you to search for a string of characters inside of another word, returning true if the string is found.");
        System.out.print("Please enter the word you would like to use: ");
        word = in.next();
        System.out.print("Please enter the string you would like to search for: ");
        search = in.next();
        in.close();
        System.out.println(find(word,search));
    }

    public static boolean find(String word, String search) 
    {
        if (search.isEmpty()) 
        {
          return true;
        } 
        else if (word.isEmpty()) 
        {
          return false;
        } 
        else if (word.charAt(0) == search.charAt(0)) 
        {
          return find(word.substring(1), search.substring(1));
        } 
        else 
        {
          return find(word.substring(1), search);
        }
    }
}
