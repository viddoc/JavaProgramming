//Tommy Hudson RandomSequence program
package e10point5;

public class RandomSequence implements Sequence
{
   public int next()
   {
      return (int) (Integer.MAX_VALUE * Math.random());
   }
}

