//Tommy Hudson ArrayFunTester program
package e7point4;

import java.util.Scanner;

public class ArrayFunTester 
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);

        int size = 0;
        double sum = 0;
        //Find out how many elements will be in the array.
        System.out.print("How many numbers would you like to enter: ");
        size = in.nextInt();
        //Create the array with the size entered by user.
        double[] array = new double[size];
        //For-loop to populate the array.
        for (int i = 0; i < size; i++)
        {
            System.out.print((i+1) + ". ");
            array[i] = in.nextDouble();
        }
        //Close the scanner.
        in.close();
        //Create the object needed to call the SumWithoutSmallest method.
        ArrayFun sws = new ArrayFun();
        sum = sws.SumWithoutSmallest(array);
        //Print the results.
        System.out.print("The sum of the numbers entered without the smallest number is " + sum + ".");

       
    }
}
