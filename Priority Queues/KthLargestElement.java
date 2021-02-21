import java.util.*;

public class Solution {

	public static int kthLargest(int n, int[] input, int k) {
		// Write your code here
      PriorityQueue<Integer> pq= new PriorityQueue<>();
        
        int i=0;
        	for(;i<k;i++)
        {
            pq.add(input[i]);
        }
         for(;i<input.length;i++)
        {
            int min=pq.peek();
            if(min<input[i])
            {
                pq.remove();
                pq.add(input[i]);
            }
        }
         
      return pq.remove();
	}
}