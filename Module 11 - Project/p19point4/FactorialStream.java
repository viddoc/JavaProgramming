//Tommy Hudson FactorialStream program
package p19point4;

import java.math.BigInteger;
import java.util.stream.Stream;
import java.util.Scanner;

public class FactorialStream 
{

    public static void main(String[] args) 
    {
    	Scanner in = new Scanner(System.in);
    	System.out.print("Enter how many factorials you would like to see printed: ");
        int n = in.nextInt();
    	//Produce an infinite stream containing arrays [1, 1!], [2, 2!], [3, 3!], and so on
        Stream<BigInteger[]> factorialPairs = Stream.iterate(new BigInteger[]{BigInteger.ONE, BigInteger.ONE},
                pair -> new BigInteger[]{pair[0].add(BigInteger.ONE), pair[1].multiply(pair[0])});

        //Extract the factorials from the pairs
        Stream<BigInteger> factorials = factorialPairs.map(pair -> pair[1]);

        //Print the factorials up to a specific number input by user
        factorials.limit(n).forEach(System.out::println);
        in.close();

    }
}