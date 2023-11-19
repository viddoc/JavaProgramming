//Tommy Hudson BinaryTreeIntegers program
package e17point8;

public class BinaryTreeIntegers
{

	public static void main(String[] args) 
	{
		BinarySearchTree bst = new BinarySearchTree();
		Integer[] integers = {0, 5, 12, 26, 34, 49};
		
		for(Integer i:integers)
		{
			bst.add(i);
		}
		
		AveragingVisitor visitor = new AveragingVisitor();
		
		bst.inorder(visitor);
		System.out.print("Values: ");
		bst.print();
		System.out.print("Average: ");
		System.out.println(visitor.average());
		System.out.println("Expected: 21.0");
	}
	static class AveragingVisitor implements Visitor
	   {
		    Integer sum = 0;
		    int count = 0;

		    @Override
		    public void visit(Object data) 
		    {
		        sum += Integer.valueOf(data.toString());
		        count++;
		    }

		    public double average() 
		    {
		        return (double) sum / count;
		    }

		}
}
