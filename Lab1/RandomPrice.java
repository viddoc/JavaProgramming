//Tommy Hudson RandomPrice program

import java.util.Random;

public class RandomPrice 
{
	public static void main (String[] args)
	{
		Random rand = new Random();
		double max = 19.95, min = 10.00; 
	    double randPrice = rand.nextDouble(max - min) + min;
	    System.out.printf("Price: $%.2f", randPrice);

	}

}
