//Tommy Hudson ReverseLoop program
package e7point1;

import java.util.Scanner;

public class ReverseLoop
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        //Create the array of ints with 10 elements.
        int[] input = new int[10];
        //Get the numbers for the array.
        System.out.println("Please enter a number on each line.");
        for (int i = 0; i < 10; i++)
        {
            System.out.print((i+1)+". ");
            input[i] = in.nextInt();
        }
        //Print the array in reverse order.
        for (int i = 9; i >=0; i--)
        {
            System.out.print(input[i]+" ");
        }
        
        in.close();
    }
}