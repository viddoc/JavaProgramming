//Tommy Hudson ReplaceTester Program
public class ReplaceTester
{
	public static void main(String[] args)
    {
		String example = "Mississippi";
		String exampleReplaced1 = example.replace("i", "!");
		String exampleReplaced2 = exampleReplaced1.replace("s", "$");
		System.out.println("Expected: M!$$!$$!pp!");
		System.out.print("Actual: ");
		System.out.println(exampleReplaced2);
    }    
}
