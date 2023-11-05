//Tommy Hudson IntegerPalindromes program
package p19point2;

import java.math.BigInteger;
import java.util.Scanner;
import java.util.stream.Stream;

public class IntegerPalindromes 
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        System.out.print("Please enter a number to limit the number of perfect square palindromes calculated: ");
        int n = in.nextInt();
        in.close();
        // Generate an infinite stream of perfect squares
        Stream<BigInteger> perfectSquares = Stream.iterate(BigInteger.ONE,i->i.add(BigInteger.ONE))
        		.map(i -> i.pow(2));

        // Filter the stream to only include palindrome perfect squares
        Stream<BigInteger> palindromePerfectSquares = perfectSquares.filter(IntegerPalindromes::isPalindrome);

        // Limit the stream to the first n palindrome perfect squares
        Stream<BigInteger> firstNPalindromePerfectSquares = palindromePerfectSquares.limit(n);

        // Print the first n palindrome perfect squares
        firstNPalindromePerfectSquares.forEach(System.out::println);
    }
    private static boolean isPalindrome(BigInteger n) 
    {
        String nStr = n.toString();
        return nStr.equals(new StringBuilder(nStr).reverse().toString());
    }
}
