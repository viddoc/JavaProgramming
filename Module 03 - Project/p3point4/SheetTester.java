//Tommy Hudson SheetTester program
package p3point4;

public class SheetTester extends Sheet {
	
	static Sheet test = new Sheet();
	
	public static void SheetPrint()
	{
		System.out.println("Sheet type: " + test.getName());
		System.out.println("Height: " + test.getHeight()+"mm");
		System.out.println("Width: " + test.getWidth() + "mm");
	}
	public static void main(String[] args) 
	{
		SheetPrint();
		test.cutInHalf();
		SheetPrint();
		test.cutInHalf();
		SheetPrint();
		test.cutInHalf();
		SheetPrint();
		test.cutInHalf();
		SheetPrint();
		test.cutInHalf();
		SheetPrint();
	}

}
