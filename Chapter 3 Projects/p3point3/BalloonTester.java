//Tommy Hudson BalloonTester program
package p3point3;

public class BalloonTester extends Balloon {

	public static void main(String[] args) 
	{
		Balloon balloon = new Balloon();
		balloon.inflate(5);
		System.out.println(balloon.getVolume());
		
	}

}
