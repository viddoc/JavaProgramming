//Tommy Hudson Tree program
package e17point9;

import java.util.List;
import java.util.Stack;
import java.util.ArrayList;

/**
   Add a method void depthFirst(Visitor v) to the Tree class of
   Section 17.4 (below).
   Keep visiting until the visit method returns false.
*/
public class Tree
{
   private Node root;

   class Node
   {
      public Object data;
      public List<Node> children;

      /**
         Computes the size of the subtree whose root is this node.
         @return the number of nodes in the subtree
      */
      public int size()
      {
         int sum = 0;
         for (Node child : children) { sum = sum + child.size(); }
         return 1 + sum;
      }
   }

   /**
      Constructs an empty tree.
   */
   public Tree()
   {
      root = null;
   }

   /**
      Constructs a tree with one node and no children.
      @param rootData the data for the root
   */
   public Tree(Object rootData)
   {
      root = new Node();
      root.data = rootData;
      root.children = new ArrayList<>();
   }

   /**
      Adds a subtree as the last child of the root.
   */
   public void addSubtree(Tree subtree)
   {
      root.children.add(subtree.root);
   }

   /**
      Computes the size of this tree.
      @return the number of nodes in the tree
   */
   public int size()
   {
      if (root == null) { return 0; }
      else { return root.size(); }
   }
   
   private static void preorder(Node n, Visitor v)
   {
      if (n == null) 
      { 
    	  return; 
      }
      v.visit(n.data);
      for(Node c:n.children)
      {
    	  preorder(c, v);
      }
      
   }
   
   void preorder(Visitor v)
   {
	   preorder(root, v);
   }
    
   public void depthFirst(Visitor v)
   {
		if(root == null)
		{
			return;
		}
		
		Stack<Node> s = new Stack<Node>();
		s.push(root);
		boolean more = true;
		while(more && s.size() > 0)
		{
			Node n = s.pop();
			more = v.visit(n.data);
			if(more)
			{
				for(Node c : n.children)
				{
					s.push(c);
				}
			}
		}
	}
}
