//Tommy Hudson PrimeNumberPalindromes program
package p19point3;

import java.math.BigInteger;
import java.util.Scanner;
import java.util.stream.Stream;

public class PrimeNumberPalindromes 
{
	public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        System.out.print("Please enter a number to limit the number of perfect square palindromes calculated: ");
        int n = in.nextInt();
        in.close();
        // Generate an infinite stream of prime numbers
        Stream<BigInteger> primeNumbers = Stream.iterate(BigInteger.TWO,BigInteger::nextProbablePrime);

        // Filter the stream to only include palindrome prime numbers
        Stream<BigInteger> palindromePrimeNumbers = primeNumbers.filter(PrimeNumberPalindromes::isPalindrome);

        // Limit the stream to the first n palindrome prime numbers
        Stream<BigInteger> firstNPalindromePrimeNumbers = palindromePrimeNumbers.limit(n);

        // Print the first n palindrome perfect squares
        firstNPalindromePrimeNumbers.forEach(System.out::println);
    }
    private static boolean isPalindrome(BigInteger n) 
    {
        String nStr = n.toString();
        return nStr.equals(new StringBuilder(nStr).reverse().toString());
    }
    
}
