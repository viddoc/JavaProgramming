//Tommy Hudson SquareSequence program
package e10point5;

public class SquareSequence implements Sequence
{
   private int n;

   public int next()
   {
      n++;
      return n * n; 
   }
}

