import java.util.*;

public class Solution {

	public static boolean checkMaxHeap(int arr[]) {
		/*
		 * Your class should be named Solution Don't write main(). Don't read input, it
		 * is passed as function argument. Return output and don't print it. Taking
		 * input and printing output is handled automatically.
		 */
        int parent=0;
        int left=1;
        int right=2;
        while(left<arr.length)
        {
            if(arr[parent]<arr[left])
                return false;
            if( right<arr.length && arr[parent]<arr[right])
                return false;
            parent++;
            left= 2*parent+1;
            right=2*parent+2;
        }
        return true;
        
	}
}