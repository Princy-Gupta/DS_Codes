import java.util.*;
public class Solution {

	public static void inplaceHeapSort(int arr[]) {
		/* Your class should be named Solution
		* Don't write main().
		* Don't read input, it is passed as function argument.
		* Change in the given input itself.
		* Taking input and printing output is handled automatically.
		*/
        
        for(int i=0;i<arr.length;i++)
        {
            heapify(arr,i);
        }
      
        for(int i=0;i<arr.length;i++)
        {
            arr[arr.length-1-i]=removeheap(arr,arr.length-i);
        }
      
       
    }
    private static int removeheap(int arr[], int l)
    {
        
        int temp=arr[0];
        arr[0]=arr[l-1];
        l--;
        int index=0;
        int left=1;
        int right=2;
        while(left<l)
        {
            int min=index;
            if(arr[left]<arr[min])
            {
                min=left;
            }
            if(right<l && arr[right]<arr[min])
            {
                min=right;
            }
            if(min==index)
                break;
            else
            {
                int temp1=arr[index];
                arr[index]=arr[min];
                arr[min]=temp1;
                index=min;
                left=2*index +1;
                right=2*index+2;
                
            }
        }
        return temp;
        
    }
    private static void heapify(int arr[],int i)
    {
        int child=i;
        int parent=(child-1)/2;
        while(child>0)
        {
            if(arr[child]<arr[parent])
            {
                int temp=arr[child];
                arr[child]=arr[parent];
                arr[parent]=temp;
                child=parent;
                parent=(child-1)/2;
                
            }
            else
                return;
        }
    }
		
	}