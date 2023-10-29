//Tommy Hudson InsertionSorter program
package e14point9;
/**
 * The sort method of this class sorts an array, using the insertion 
 * sort algorithm.
 */
public class InsertionSorter
{
   /**
    * Sorts an array, using insertion sort.
    * @param a the array to sort
    */
   public static int sort(int[] a)
   {
		int count = 0;
		for (int i = 1; i < a.length; i++)
		{
			int next = a[i];
			// Move all larger elements up
			int j = i;
			while (j > 0 && a[j - 1] > next)
		   	{
				a[j] = a[j - 1];
			   	j--;
				count++;
		   	}
		   	// Insert the element
		   	a[j] = next;
	   }
	   return count;
   	}
}

