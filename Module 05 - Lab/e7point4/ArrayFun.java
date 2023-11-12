//Tommy Hudson ArrayFun Program
package e7point4;

public class ArrayFun 
{
	//Create a method named SumWithoutSmallest that returns a double value that is the sum of all numbers in an array minus the smallest number.
    public double SumWithoutSmallest(double[] values)
    {
    	//Variables to hold the information needed. sum will hold the first element of the array so the loop will need to start on the second.
        double sum = values[0], sumWithoutSmallest = 0, minElement=values[0];
        //Single for-loop to do all of the calculations.
        for (int i = 1; i <= (values.length-1); i++)
        {
        	//If-statement to find the smallest element.
            if (i < (values.length-1) && minElement > values[i])
            {
                minElement = values[i];
            }
            //Keep a running total of the sum of the array.
            sum += values[i];
            //If-statement to subtract the smallest element from the sum.
            if (i == (values.length-1))
            {
            	sumWithoutSmallest = sum - minElement;
            }
        }

        return sumWithoutSmallest;
    }

}
