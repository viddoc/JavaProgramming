//Tommy Hudson BankAccount program
package e10point3;

public class Data
{
   /**
   *  Computes the average of the measures of the given objects.
   *  @param objects an array of Measurable objects
   *  @return the average of the measures
   */
   public static double average(Measurable[] objects)
   {
      double sum = 0;
      for (Measurable obj : objects)
      {
         sum = sum + obj.getMeasure();
      }
      if (objects.length > 0) { return sum / objects.length; }
      else { return 0; }
   }
   /**
    * Returns the largest value of the array.
    * @param objects an array of Measurable objects
    * @return the largest measure
    */
   public static Object largest(Measurable[] objects)
   {
	   double largest = objects[0].getMeasure();
	   int largestElement = 0;
	   for (int i = 1; i < objects.length; i++)
	   {
		   if (objects[i].getMeasure() > largest)
		   {
			   largest = objects[i].getMeasure();
			   largestElement = i;
		   }
	   }
	   Object max = objects[largestElement];
	   return max;
   }
   /**
    * Returns the smallest value of the array.
    * @param objects an array of Measurable objects
    * @return the smallest measure
    */
   public static Object smallest(Measurable[] objects)
   {
	   double smallest = objects[0].getMeasure();
	   int smallestElement=0;
	   for (int i = 1; i < objects.length; i++)
	   {
		   if (objects[i].getMeasure() < smallest)
		   {
			   smallest = objects[i].getMeasure();
			   smallestElement = i;
		   }
	   }
	   Object min = objects[smallestElement];
	   return min;
   }
}

