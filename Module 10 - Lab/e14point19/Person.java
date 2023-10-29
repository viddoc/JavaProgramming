//Tommy Hudson Person program
package e14point19;
//Person class that implements Comparable to compare itself
public class Person implements Comparable<Person>
{
    //Instance variable
    private String name;
    //Constructor
    public Person(String name)
    {   
        this.name = name;
    }
    //CompareTo method to compare Person Objects
    public int compareTo(Person other)
    {
        int result = name.compareTo(other.name);
        return result;   
    }
    /**
     * Get name
     * @return name
     */
    public String getName()
    {   
        return this.name;
    }
    /**
     * Method to return String representation of the object
     */
    @Override
    public String toString()
    {
        return this.name;
    }
}

