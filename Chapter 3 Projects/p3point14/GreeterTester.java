package p3point14;

public class GreeterTester 
{
    public static void main(String[] args)
    {
        Greeter first = new Greeter("Tommy");
        Greeter second = new Greeter("World");

        System.out.println(first.sayHello());
        System.out.println(first.refuseHelp());
        System.out.println(first.sayGoodbye());
        System.out.println(second.sayHello());
    }    
}
