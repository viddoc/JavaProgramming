//Tommy Hudson BugTester program
package e3point16;

public class BugTester {

	public static void main(String[] args) 
	{
		Bug cicada = new Bug(10);
		System.out.println("Expected position: 10");
		System.out.println("Actual position: "+cicada.getPosition());
		cicada.move();
		cicada.move();
		System.out.println("Expected position: 12");
		System.out.println("Actual position: "+cicada.getPosition());
		cicada.turn();
		cicada.move();
		cicada.move();
		System.out.println("Expected position: 10");
		System.out.println("Actual position: "+cicada.getPosition());
		cicada.move();
		cicada.move();
		cicada.move();
		System.out.println("Expected position: 7");
		System.out.println("Actual position: "+cicada.getPosition());
		cicada.turn();
		cicada.move();
		System.out.println("Expected position: 8");
		System.out.println("Actual position: "+cicada.getPosition());
	}

}
