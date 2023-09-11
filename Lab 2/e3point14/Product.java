//Tommy Hudson Product program
package e3point14;

public class Product 
{
	/**
	 * Instance variables
	 */
	private String name;
	private double price;
	/**
	 * Construct the product with the name and the price of the product.
	 * @param name product name
	 * @param price product price
	 */
	public Product(String name, double price)
	{
		this.name = name;
		this.price = price;
	}
	/**
	 * Gets the name of the product
	 * @return name of product
	 */
	public String getName()
	{
		return name;
	}
	/**
	 * Gets the price of the product
	 * @return price of product
	 */
	public double getPrice()
	{
		return price;
	}
	/**
	 * Reduces the price of the product by the amount specified.
	 * @param amount amount to reduce price by
	 */
	public void reducePrice(double amount)
	{
		price -= amount;
	}
}
