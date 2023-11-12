//Tommy Hudson IncomeTax1913Tester
package e5point15;

import java.util.Scanner;

public class IncomeTax1913Tester 
{

	public static void main(String[] args) 
	{
		Scanner in = new Scanner(System.in);
		
		System.out.print("Please enter your income to have the income tax you would owe in 1913 calculated: ");
		double income = in.nextDouble();
		IncomeTax1913 incomeTax = new IncomeTax1913(income);
		System.out.println("Your expected income tax in 1913 would be: $" + incomeTax.getTax());
		in.close();
	}

}
