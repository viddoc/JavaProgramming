package e3point9;

public class SavingsAccountTester
{
	public static void main(String[] args)
	{
		SavingsAccount tommysAccount = new SavingsAccount(1000,10);
		System.out.println(tommysAccount.getBalance());
		tommysAccount.addInterest();
		System.out.println("1000+10%=1100");
		System.out.println("Expected output: 1100.0");
		System.out.print("Actual output: ");
		System.out.println(tommysAccount.getBalance());
		
	}
}
