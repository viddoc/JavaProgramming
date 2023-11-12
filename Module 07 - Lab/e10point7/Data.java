//Tommy Hudson Data program
package e10point7;

public class Data
{
   /**
   * Computes the average of the measures of the given objects.
   * @param objects an array of objects
   * @param meas the measurer for the objects
   * @return the average of the measures
   */
   public static double average(Object[] objects, Measurer meas)
   {
      double sum = 0;
      for (Object obj : objects)
      {
         sum = sum + meas.measure(obj);
      }
      if (objects.length > 0) 
      { return sum / objects.length; }
      else 
      { return 0; }
   }
   /**
    * Computes the largest object by measures of the given objects.
    * @param objects an array of objects
    * @param m the measurer of the objects
    * @return the largest object
    */
   public static Object largest(Object[] objects, Measurer m)
   {
      double largestMeasure = m.measure(objects[0]);
      int largestElement = 0;
      for (int i = 1; i < objects.length; i++)
      {
         if(largestMeasure < m.measure(objects[i]))
         {
            largestMeasure = m.measure(objects[i]);
            largestElement = i;
         }
      }
      return objects[largestElement];
      
   }
}

