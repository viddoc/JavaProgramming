//Tommy Hudson Sequence program
package e10point5;

public interface Sequence
{
   int next();
   //Default method that yields an array of the first n values of the sequence.
   default int [] values(int n)
   {
		
		int[] values = new int[n];
	   for(int i = 0; i < n; i++)
	   {
		   values[i] = next();
	   }
	   return values;
   }
}

