//Tommy Hudson IncomeTax1913 program
package e5point15;
/**
 * Class used to calculate the amount of income tax that would have been paid in the United States in 1913.
 */
public class IncomeTax1913 
{
	/**
	 * Constant values for the tax rates and the limits for each rate, there is no limit for Rate 6.
	 */
	private static final double RATE1 = .01;
	private static final double RATE2 = .02;
	private static final double RATE3 = .03;
	private static final double RATE4 = .04;
	private static final double RATE5 = .05;
	private static final double RATE6 = .06;

	private static final double RATE1_LIMIT = 50000;
	private static final double RATE2_LIMIT = 75000;
	private static final double RATE3_LIMIT = 100000;
	private static final double RATE4_LIMIT = 250000;
	private static final double RATE5_LIMIT = 500000;
	
	/**
	 * Instance variables for the amount of income tax and the amount of income.
	 */
	private double incomeTax;
	private double income;
	/**
	 * Constructor for the IncomeTax1913 object that sets the amount of income.
	 * @param income amount of income
	 */
	public IncomeTax1913(double income)
	{
		this.income = income;
	}
	/**
	 * Method to get the amount of tax that would be owed based on the income and the tax rates which is determined by income level.
	 * @return amount of income tax
	 */
	public double getTax()
	{
		if (income <= RATE1_LIMIT)
		{
			incomeTax = income * RATE1;
		}
		else if (income <= RATE2_LIMIT)
		{
			incomeTax = (RATE1_LIMIT * RATE1) + ((income-RATE1_LIMIT) * RATE2);
		}
		else if (income <= RATE3_LIMIT)
		{
			incomeTax = (RATE1_LIMIT * RATE1) + ((RATE2_LIMIT - RATE1_LIMIT) * RATE2) + ((income - RATE2_LIMIT) * RATE3);
		}
		else if (income <= RATE4_LIMIT)
		{
			incomeTax = (RATE1_LIMIT * RATE1) + ((RATE2_LIMIT - RATE1_LIMIT) * RATE2) + ((RATE3_LIMIT - RATE2_LIMIT) * RATE3) + ((income - RATE3_LIMIT) * RATE4);
		}
		else if (income <= RATE5_LIMIT)
		{
			incomeTax = (RATE1_LIMIT * RATE1) + ((RATE2_LIMIT - RATE1_LIMIT) * RATE2) + ((RATE3_LIMIT - RATE2_LIMIT) * RATE3) + ((RATE4_LIMIT - RATE3_LIMIT) * RATE4)
					+ ((income - RATE4_LIMIT) * RATE5);
		}
		else
		{
			incomeTax = (RATE1_LIMIT * RATE1) + ((RATE2_LIMIT - RATE1_LIMIT) * RATE2) + ((RATE3_LIMIT - RATE2_LIMIT) * RATE3) + ((RATE4_LIMIT - RATE3_LIMIT) * RATE4) 
					+ ((RATE5_LIMIT - RATE4_LIMIT) * RATE5) + ((income - RATE5_LIMIT) * RATE6);
		}
		return incomeTax;

	}

}
