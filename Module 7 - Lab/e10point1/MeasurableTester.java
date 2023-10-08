//Tommy Hudson MeasureableTester program
package e10point1;
/**
*  This program demonstrates the measurable BankAccount and Country classes.
*/
public class MeasurableTester
{
   public static void main(String[] args)
   {
      // Calling the average method with an array of BankAccount objects
      Measurable[] accounts = new Measurable[3];
      accounts[0] = new BankAccount(0);
      accounts[1] = new BankAccount(10000);
      accounts[2] = new BankAccount(2000);
      // Calling the smallest and largest methods with an array of BankAccount objects
      double averageBalance = Data.average(accounts);
      System.out.println("Average balance: " + averageBalance);
      System.out.println("Expected: 4000");
      
      double smallestBalance = Data.smallest(accounts);
      double largestBalance = Data.largest(accounts);
      System.out.println("Smallest bank account: " + smallestBalance);
      System.out.println("Expected: 0");
      System.out.println("Largest bank account: " + largestBalance);
      System.out.println("Expected: 10000");
      // Calling the average method with an array of Country objects
      Measurable[] countries = new Measurable[3];
      countries[0] = new Country("Uruguay", 176220);
      countries[1] = new Country("Thailand", 513120);
      countries[2] = new Country("Belgium", 30510);
      
      double averageArea = Data.average(countries);
      System.out.println("Average area: " + averageArea);
      System.out.println("Expected: 239950");
      // Calling the smallest and largest method with an array of Country objects
      double smallestArea = Data.smallest(countries);
      double largestArea = Data.largest(countries);
      System.out.println("Smallest Area for a country: " + smallestArea);
      System.out.println("Expected: 30510");
      System.out.println("Largest Area for a country: " + largestArea);
      System.out.println("Expected: 513120");
   }
}

