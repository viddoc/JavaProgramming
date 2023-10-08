//Tommy Hudson Person program
package e10point29;
//Class that will hold a person's name and implements Comparable interface to compare two Person objects.
public class Person implements Comparable<Person>
{
	//Instance variable
	 private String name;
	 /**
	  * Constructor
	  * @param name of the person
	  */
	 public Person(String name)
	 {
		 this.name = name;
	 }
	 /**
	  * Setter for the name variable.
	  * @param name of the person
	  */
	 public void setName(String name) 
	 {
		 this. name = name;
	 }
	 /**
	  * Getter for the name variable.
	  * @return name of the person
	  */
	 public String getName() 
	 {
		 return name;
	 }
	 /**
	  * Method to implement the Comparable interface.
	  */
	 @Override
	 public int compareTo(Person p) 
	 {
		 return name.compareTo(p.name);
	 }
}
