//Tommy Hudson PersonTester program
package p3point6;

public class PersonTester
{
	public static void main(String[] args) 
	{
		Person name = new Person("Tommy");
		Person friend1 = new Person("Sam");
		Person friend2 = new Person ("Bill");
		Person friend3 = new Person ("Mike");
		Person friend4 = new Person ("Fred");
		
		name.befriend(friend1);
		name.befriend(friend2);
		name.befriend(friend3);
		name.befriend(friend4);
		System.out.println(name.getFriendNames());
		name.unfriend(friend4);
		System.out.println(name.getFriendNames());
		

	}

}
