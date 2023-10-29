//Tommy Hudson PersonSorter program
package e14point19;

import java.util.Scanner;
import java.util.Arrays;

public class PersonSorter 
{
    public static void main(String[] args)
    {
        //Scanner object creation
        Scanner in = new Scanner(System.in);
        //Prompt for names
        System.out.println("Please enter 10 persons names.");
        //Variables to hold first, last, and all Person objects
        Person first = null;
        Person last = null;
        Person[] persons = new Person[10];
        //For loop to populate array
        for (int i = 0; i < 10; i++)
        {
            System.out.print((i+1) + ": ");
            Person temp = new Person(in.next());
            persons[i] = temp;
        }
        //Scanner object deletion
        in.close();
        //Sort persons using Arrays sort
        Arrays.sort(persons);
        //Assign first and last from sorted array
        first = persons[0];
        last = persons[9];
        //Print results
        System.out.println("First person: " + first);
        System.out.println("Last person: " + last);

    }
}
