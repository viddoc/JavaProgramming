//Tommy Hudson BinaryTreeTester program
package e17point10;

public class BinaryTreeTester
{
	public static void main(String[] args) 
	{
		// Tree from page 777 in sorted order
	      BinaryTree names =
	         new BinaryTree("Juliet",
	            new BinaryTree("Diana",
	               new BinaryTree(), new BinaryTree("Harry")),
	            new BinaryTree("Tom",
	               new BinaryTree("Romeo"), new BinaryTree()));

	      Visitor printVisitor = new Visitor() 
	      {
	            @Override
	            public boolean visit(Object data) 
	            {
	                System.out.print(data + " ");
	                return true;
	            }
            };
            
         // Print the tree using inorder traversal.
            System.out.println("Inorder traversal:");
            names.inorder(printVisitor);
            System.out.println();
   
	}
}