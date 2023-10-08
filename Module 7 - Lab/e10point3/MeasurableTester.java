//Tommy Hudson MeasureableTester program
package e10point3;
/**
*  This program demonstrates the measurable BankAccount and Country classes.
*/
public class MeasurableTester
{
   public static void main(String[] args)
   {
     Measurable[] person = new Person[3];
     person[0] = new Person("Tommy", 187);
     person[1] = new Person("Bob", 165);
     person[2] = new Person("Ray", 189);
     
     double averageHeight = Data.average(person);
     System.out.println("Average Height: " + averageHeight);
     System.out.println("Expected: 183.33");
     
     Person tallestPerson = (Person) Data.largest(person);
     System.out.println("The tallest person is: " + tallestPerson.getName());
     System.out.println("Expected: Ray");
   }
}

