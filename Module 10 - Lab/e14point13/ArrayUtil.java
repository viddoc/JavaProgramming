//Tommy Hudson ArrayUtil program
package e14point13;

import java.util.Random;
/**
 * This class contains utility methods for array manipulation.
 */
public class ArrayUtil
{ 
   private static Random generator = new Random();
   /**
    * Creates an array filled with random values.
    * @param size the length of the array
    * @param to the number of possible random values
    * @return an array filled with length numbers between
    * 0 and to - 1
    */
   public static int[] randomIntArray(int size, int to)
   {  
      int[] a = new int[size];      
      for (int i = 0; i < a.length; i++)
      {
         a[i] = generator.nextInt(to);
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
   
   static void printArray(int a[])
   {
       for (int i = 0; i < a.length; i++)
       {
           System.out.print(a[i] + " ");
       }
       System.out.println();
   }
}


