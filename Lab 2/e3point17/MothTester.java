//Tommy Hudson MothTester program
package e3point17;

public class MothTester 
{

	public static void main(String[] args) 
	{
		Moth mothra = new Moth(25);
		
		mothra.moveToLight(100);
		System.out.println("Expected position: 75.0");
		System.out.println("Actual position: "+mothra.getPosition());
		mothra.moveToLight(99);
		System.out.println("Expected position: 124.5");
		System.out.println("Actual position: "+mothra.getPosition());
		
	}

}
