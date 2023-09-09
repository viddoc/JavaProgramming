//Tommy Hudson ReverseTester Program

public class ReverseTester
{
    public static void main(String[] args)
    {
        StringBuilder desserts = new StringBuilder("desserts");
        System.out.print("Inital: ");
        System.out.println(desserts);
        desserts.reverse();
        desserts.toString();
        System.out.println("Expected: stressed");
        System.out.print("Actual: ");
        System.out.println(desserts);
    }

}
