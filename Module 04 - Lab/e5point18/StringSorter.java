//Tommy Hudson StringSorter program
package e5point18;
/**
 * Import Scanner for user input
 */
import java.util.Scanner;
/**
 * Class designed to lexicographically sort three strings input by the user.
 */
public class StringSorter 
{

	public static void main(String[] args) 
	{
		Scanner in = new Scanner(System.in);
		/**
		 * Prompt user for the three strings and create three empty placeholder String variables for the sorting.
		 */
		System.out.print("Enter three strings: ");
		String string1 = in.next();
		String string2 = in.next();
		String string3 = in.next();
		String str1 = "", str2 = "", str3 = "";
		/**
		 * Use nested if-else statements to sort the strings with compareTo methods.
		 */
		if (string1.compareTo(string2) < 0 && string1.compareTo(string3) < 0) 
		{
			str1 = string1;
			if (string2.compareTo(string3) < 0) 
			{
				str2 = string2;
				str3 = string3;
			} 
			else 
			{
				str2 = string3;
				str3 = string2;
			}
		} 
		else if (string2.compareTo(string1) < 0 && string2.compareTo(string3) < 0) 
		{
			str1 = string2;
			if (string1.compareTo(string3) < 0) 
			{
				str2 = string1;
				str3 = string3;
			} 
			else 
			{
				str2 = string3;
				str3 = string1;
			}
		} 
		else
		{
			str1 = string3;
			if (string1.compareTo(string2) < 0) 
			{
				str2 = string1;
				str3 = string2;
			} 
			else 
			{
				str2 = string2;
				str3 = string1;
			}
		}
		/**
		 * Output the sorted strings.
		 */
		System.out.println(str1+"\n"+str2+"\n"+str3);
		
		in.close();
	}

}
