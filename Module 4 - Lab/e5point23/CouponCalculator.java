//Tommy Hudson CouponCalculator program
package e5point23;
/**
 * Class to determine the amount of a coupon received based on the amount spent.
 */
public class CouponCalculator 
{
	/**
	 * Global variables to hold the discount percentages.
	 */
    final private double NO_DISCOUNT = 0;
    final private double DISCOUNT1 = 8;
    final private double DISCOUNT2 = 10;
    final private double DISCOUNT3 = 12;
    final private double DISCOUNT4 = 14;
    /**
     * Instance variable to construct the CouponCalculator.
     */
    private double cost;
    /**
     * Construct with the cost of the groceries.
     * @param cost of the groceries
     */
    public CouponCalculator(double cost)
    {
        this.cost = cost;
    }

    public void getCoupon()
    {
        double discountRate, coupon;
        /**
         * Determine the amount of the discount and the coupon based on the cost of the groceries using if-else statements.
         */
        if(cost<10)
        {
            discountRate = NO_DISCOUNT;
            System.out.print("You did not win a coupon today. Try again next time.");
        }
        else if (cost <= 60)
        {
            discountRate = DISCOUNT1/100;
            coupon = cost * discountRate;
            System.out.printf("You win a discount coupon of $%.2f. ( %.0f%% of your purchase)",coupon,DISCOUNT1);
        }
        else if (cost <= 150)
        {
            discountRate = DISCOUNT2/100;
            coupon = cost * discountRate;
            System.out.printf("You win a discount coupon of $%.2f. ( %.0f%% of your purchase)",coupon,DISCOUNT2);
        }
        else if (cost <= 210)
        {
            discountRate = DISCOUNT3/100;
            coupon = cost * discountRate;
            System.out.printf("You win a discount coupon of $%.2f. ( %.0f%% of your purchase)",coupon,DISCOUNT3);
        }
        else
        {
            discountRate = DISCOUNT4/100;
            coupon = cost * discountRate;
            System.out.printf("You win a discount coupon of $%.2f. ( %.0f%% of your purchase)",coupon,DISCOUNT4);
        }
    }
}
