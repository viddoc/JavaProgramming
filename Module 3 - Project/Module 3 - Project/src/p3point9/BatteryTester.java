//Tommy Hudson BatteryTester
package p3point9;

public class BatteryTester
{
	public static void main(String[] args) 
	{
		Battery AA = new Battery(3000);
		System.out.println(AA.getRemainingCapacity());
		AA.drain(1000);
		System.out.println(AA.getRemainingCapacity());
		AA.charge();
		System.out.println(AA.getRemainingCapacity());
	}

}
