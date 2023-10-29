//Tommy Hudson ArrayUtil program
package e14point3;

import java.util.Random;
/**
 * This class contains utility methods for array manipulation.
 */
public class ArrayUtil
{ 
   private static Random generator = new Random();
   /**
    * Creates an array filled with random values.
    * @param number the length of the array
    * @param from the smallest of possible random values
    * @param to the largest of possible random values
    * @return an array filled with numbers between from and to
    */
   public static int[] randomIntArray(int number, int from, int to)
   {  
      int[] a = new int[number];      
      for (int i = 0; i < a.length; i++)
      {
         a[i] = generator.nextInt(to-from)+from;
      }
      return a;
   }
   /**
    * Swaps two entries of an array.
    * @param a the array
    * @param i the first position to swap
    * @param j the second position to swap
    */
   public static void swap(int[] a, int i, int j)
   {
	   int temp = a[i];
	   a[i] = a[j];
	   a[j] = temp;
   }
}


