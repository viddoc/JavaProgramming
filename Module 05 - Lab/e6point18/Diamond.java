//Tommy Hudson Diamond program
package e6point18;

import java.util.Scanner;
//Class to print an ASCII diamond built with asterisks. The side of the diamond will be the length specified by the user.
public class Diamond
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        //Variables for the length of the side and the length of the diagonal angle(width) across the middle of the diamond.
        int side, angle;
        //Get the length of the side from the user.
        System.out.print("Please enter a number that will represent the side length of an ASCII diamond: ");
        side = in.nextInt();
        in.close();
        //Calculate the width across the diamond.
        angle = (side * 2) - 1;
        //Print out the top half of the diamond and the middle line.
        for (int i = 1; i <= side; i++) 
        {
            int half = i * 2 - 1;
            int spaces = (angle - half) / 2;
            printDiamond(spaces, half);
            System.out.println("");
        }
        //Print out the bottom half of the diamond starting after the middle.
        for (int i = side-1; i > 0; i--) 
        {
            int half = i * 2 - 1;
            int spaces = (angle - half) / 2;
            printDiamond(spaces, half);
            System.out.println("");
        }
    }
    //Method used to specify which character should be printed based on location.
    private static void printDiamond(int spaces, int asterisks) 
    {
        for (int i = 0; i < spaces; i++) 
        {
            System.out.print(" ");
        }

        for (int i = 0; i < asterisks; i++) 
        {
            System.out.print("*");
        }

        for (int i = 0; i < spaces; i++) 
        {
            System.out.print(" ");
        }
    }

}