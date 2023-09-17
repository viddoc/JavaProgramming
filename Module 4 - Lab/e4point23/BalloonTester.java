//Tommy Hudson BalloonTester program
package e4point23;

public class BalloonTester 
{

	public static void main(String[] args) 
	{
		Balloon balloon = new Balloon();
		
		balloon.addAir(100);
		System.out.println("Volume: " + balloon.getVolume());
		System.out.println("Surface Area: " + balloon.getSurfaceArea());
		System.out.println("Radius: " + balloon.getRadius());
		balloon.addAir(100);
		System.out.println("Volume: " + balloon.getVolume());
		System.out.println("Surface Area: " + balloon.getSurfaceArea());
		System.out.println("Radius: " + balloon.getRadius());
	}

}
