//Tommy Hudson HollePrinter Program
public class HollePrinter
{
    public static void main(String[] args)
    {
        String hW = "Hello, World!";
        hW = hW.replace("e", "@");
        hW = hW.replace("o", "e");
        hW = hW.replace("@", "o");
        System.out.println(hW);
    }
}
