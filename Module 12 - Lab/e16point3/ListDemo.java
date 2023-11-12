//Tommy Hudson ListDemo program
package e16point3;

import java.util.NoSuchElementException;

/**
   A program that demonstrates the LinkedList class
*/
public class ListDemo
{  
   public static void main(String[] args)
   {  
      LinkedList staff = new LinkedList();
      staff.addFirst("Tom");
      staff.addFirst("Romeo");
      staff.addFirst("Harry");
      staff.addFirst("Diana");
      
      

      ListIterator iterator = staff.listIterator();
      
      iterator.add("Juliet");
      iterator.add("Nina");

      // Print all elements

      iterator = staff.listIterator();
      try
      {
 
              System.out.print(iterator.next() + " ");
     
      }
      catch (NoSuchElementException e) 
      {
    	  e.printStackTrace();
      }
   }
}

