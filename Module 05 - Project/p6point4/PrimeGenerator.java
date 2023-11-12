//Tommy Hudson PrimeGenerator program
package p6point4;
//Class to calculate all prime numbers up to a number that is input by the user.
public class PrimeGenerator 
{
	//Instance variables.
    private int inputNumber;
    private int primeNumber;
    /**
     * Construct the object with the number entered by user.
     * @param number entered by user and will be the number that all prime numbers are calculated up to.
     */
    public PrimeGenerator(int number)
    {
        this.inputNumber = number;
    }
    /**
     * Method with an algorithm used to determine if a number is prime or not.
     * @param number that will be used to determine when to stop calculating.
     * @return boolean true value if it is a prime number or false if it is not.
     */
    public boolean isPrime(int number)
    {
    	//Number passed by the method nextPrime to be tested if it is prime or not.
        this.primeNumber = number;
        //Set the boolean variable to true until it is proven not to be.
        boolean isPrime = true;
        //Run the for-loop to test which numbers it is divisible by.
        for (int i = 2; i <= primeNumber / 2; ++i) 
        {
        	//Test if the current number in the loop is a prime number.
        	if (primeNumber % i == 0) 
        	{
        		isPrime = false;
        		break;
        	}
        }
        return isPrime;
    }

    public void nextPrime(int number)
    {
    	//For-loop to print every prime number up to the specified number.
        for (int i = 2; i < inputNumber; i++)
        {
        	//If it is a prime number print it.
            if (isPrime(i)==true)
            {
            System.out.println(i);
            }
        }
    }
}
