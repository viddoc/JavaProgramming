//Tommy Hudson ProductTester program
package e3point14;

public class ProductTester {

	public static void main(String[] args) 
	{
		Product toaster = new Product("Toaster", 29.95);
		Product blender = new Product("Blender", 49.95);
		System.out.println(toaster.getName()+": $"+ toaster.getPrice());
		System.out.println(blender.getName()+": $"+ blender.getPrice());
		toaster.reducePrice(5);
		blender.reducePrice(5);
		System.out.println(toaster.getName()+": $"+ toaster.getPrice());
		System.out.println(blender.getName()+": $"+ blender.getPrice());
	
	}

}
