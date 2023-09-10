//Tommy Hudson Greeter program
package p3point14;
/**
 * Class that will create a customized greeting and goodbye as well as a comical refusal to help. 
 */
public class Greeter
{
    /**
     * Declare instance variable that will hold the name being interacted with.
     */
    private String name;
    /**
     * Construct the name being used.
     * @param name
     */
    public Greeter(String name)
    {
        this.name = name;
    }
    /**
     * Method to parse a greeting.
     * @return
     */
    public String sayHello()
    {
        String greeting = "Hello, ";
        String fullGreeting = greeting.concat(name+".");
        return fullGreeting;
    }
    /**
     * Method to parse a goodbye.
     * @return
     */
    public String sayGoodbye()
    {
        String goodbye = "Goodbye, " + name + ".";
        return goodbye;
    }
    /**
     * Method to return a refusal.
     * @return
     */
    public String refuseHelp()
    {
        String refusal = "I'm sorry, " + name + ". I am afraid I can't do that.";
        return refusal;
    }

}
