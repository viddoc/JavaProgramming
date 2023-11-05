//Tommy Hudson StreamPerformance program
package p19point1;

import java.util.Random;
import java.util.concurrent.TimeUnit;
import java.util.stream.IntStream;

public class StreamPerformance 
{
    public static void main(String[] args) 
    {
        int[] nArray = {10, 100, 1000, 10000, 100000};
        Random random = new Random();
        
        for (int n : nArray) 
        {
            int[] randomIntegers = random.ints(n).toArray();
            
            // Measure time for regular stream
            long startTime = System.nanoTime();
            long regularCount = IntStream.of(randomIntegers)
                    .filter(num -> num % 2 == 0)
                    .limit(n)
                    .count();
            long regularTime = TimeUnit.NANOSECONDS.toMillis(System.nanoTime() - startTime);

            // Measure time for parallel stream
            startTime = System.nanoTime();
            long parallelCount = IntStream.of(randomIntegers)
                    .parallel()
                    .filter(num -> num % 2 == 0)
                    .limit(n)
                    .count();
            long parallelTime = TimeUnit.NANOSECONDS.toMillis(System.nanoTime() - startTime);
            
            System.out.println("\nn = " + n);
            System.out.println("Regular Stream Count: " + regularCount);
            System.out.println("Regular Stream Time (ms): " + regularTime);
            System.out.println("Parallel Stream Count: " + parallelCount);
            System.out.println("Parallel Stream Time (ms): " + parallelTime);
        }
    }
}