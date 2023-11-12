//Tommy Hudson PowersOfTwo program
package e6point12;
//Class to show all of the powers of 2 up to the 20th power.
public class PowersOfTwo 
{
    public static void main(String[] args)
    {
    	//For loop to run each power of 2 and print for each iteration.
        for (int i = 0; i <= 20; i++)
        {
            System.out.println("2 to the power of " + i + " = " + Math.pow(2,i));
        }
    }
}
