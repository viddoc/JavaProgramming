//Tommy Hudson CouponCalculatorTester program
package e5point23;

import java.util.Scanner;

public class CouponCalculatorTester 
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);

        System.out.print("Please enter the cost of your groceries: $");
        double cost = in.nextDouble();
        CouponCalculator coupon = new CouponCalculator(cost);
        coupon.getCoupon();

        in.close();
    }
}