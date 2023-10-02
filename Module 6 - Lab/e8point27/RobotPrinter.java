//Tommy Hudson RobotPrinter program
package e8point27;

public class RobotPrinter 
{

	public static void main(String[] args) 
	{
		Robot rob = new Robot(50,50);
		System.out.println(rob.getLocation());
		System.out.println("Direction = " + rob.getDirection());
		rob.move();
		rob.move();
		rob.turnLeft();
		System.out.println("Direction = " + rob.getDirection());
		System.out.println(rob.getDirection());
		rob.move();
		rob.move();
		rob.turnRight();
		System.out.println("Direction = " + rob.getDirection());
		System.out.println(rob.getDirection());
		rob.turnRight();
		System.out.println(rob.getDirection());
		rob.turnRight();
		System.out.println(rob.getDirection());
		rob.move();
		rob.move();
		rob.move();
		System.out.println("Direction = " + rob.getDirection());
		
	}

}
