//Tommy Hudson ListDemo program
package e16point2;

/**
   A program that will show an exception due to the faulty addFirst method of the LinkedList class
*/
public class ListTest
{ 
	public static void main(String[] args)
	{
		 
		LinkedList staff = new LinkedList();
		ListIterator iterator = staff.listIterator();
		try
		{
		staff.addFirst("Tom");
		staff.addFirst("Romeo");
		if (iterator.next() != "Tom")
		{
			throw new IllegalArgumentException();
		}
		staff.addFirst("Harry");
		staff.addFirst("Diana");
		
		// | in the comments indicates the iterator position
		 // |DHRT
		iterator.next(); // D|HRT
		iterator.next(); // DH|RT

		// Add more elements after second element
      
		iterator.add("Juliet"); // DHJ|RT
		iterator.add("Nina"); // DHJN|RT

		iterator.next(); // DHJNR|T

		// Remove last traversed element 

		iterator.remove(); // DHJN|T
		// Print all elements

		iterator = staff.listIterator();
		while (iterator.hasNext())
		{
			System.out.print(iterator.next() + " ");
		}
		System.out.println();
		} 
		catch (Exception e) 
		{
			e.printStackTrace();
		}
	}
}
