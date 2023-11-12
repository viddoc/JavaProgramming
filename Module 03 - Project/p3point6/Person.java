//Tommy Hudson Person program
package p3point6;
/**
 * Class to allow someone to enter their name and add their friends to a list or remove friends.
 */
public class Person 
{   
    /**
     * Declare instance variables.
     */
    private String name;
    private String friends;
    /**
     * Construct object Person who will have the friends.
     * @param name The name of the one with the friends
     */
    public Person(String name) 
    {
       this.name = name;
       this.friends = " ";
    }
    /**
     * Add the specified friend to the list of friends.
     * @param p The name of the friend being added
     */
    public void befriend(Person p) 
    {
        friends = friends + " " + p.name;
    }
    /**
     * Remove the specified friend from the list of friends.
     * @param p The name of the friend being removed
     */
    public void unfriend(Person p) {
        String name = p.name;
		friends = friends.replace(" " + name, "");
    }
    /**
     * Gets the current list of friends.
     * @return Friends list
     */
    public String getFriendNames() 
    {
        return friends;
    }
}
