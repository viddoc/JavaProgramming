//Tommy Hudson BubbleSort Program
package e14point13;

public class BubbleSort 
{
	static void sort(int a[])
    {
        int temp = 0;
        int n = a.length;
        for (int i = 0; i < n; i++) 
        {
            for (int j = 1; j < (n - i); j++) 
            {
                if (a[j-1] > a[j]) 
                {
                    // Swap a[j-1] and a[j]
                    temp = a[j-1];
                    a[j-1] = a[j];
                    a[j] = temp;
                
                }
            
            }
        }
    }
}