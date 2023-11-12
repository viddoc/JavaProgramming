//Tommy Hudson ReverseArray program

package e7point7;
//Class to create and return a reversed array.
public class ReverseArray 
{
	//Instance varaible.
	private int[] inputArr;
	//Constructor
	public ReverseArray(int[] array)
	{
		this.inputArr = array;
	}
	//Method to reverse the provided array.
	public int[] Reverse()
	{
		//Create the array to hold the reversed elements with the same size as the provided array.
		int [] reverseArr = new int[inputArr.length];
		//For-loop to set the element of the iteration to the corresponding element in the input array.
		for(int i = 0; i < inputArr.length; i++)
		{
			reverseArr[i] = inputArr[(inputArr.length-1)-i];
		}
		//Return the reversed array.
		return reverseArr;
	}

}
