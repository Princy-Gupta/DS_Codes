import java.util.*;
public class Solution {

	public static int maxFrequencyNumber(int[] arr){
		/* Your class should be named Solution
		 * Don't write main().
		 * Don't read input, it is passed as function argument.
		 * Return output and don't print it.
	 	 * Taking input and printing output is handled automatically.
		*/
        int f = Integer.MIN_VALUE;
        int result = 0;
        
        ArrayList<Integer> output = new ArrayList<>();
        HashMap<Integer,Integer> seen = new HashMap<>();
        
        for(int i=0;i<arr.length;i++)
        {
            if(seen.containsKey(arr[i]))
            {
                int v = seen.get(arr[i]);
                seen.put(arr[i],++v);
            }
            else
            {
                seen.put(arr[i],1);
            }
        }
        
        for(int i=0;i<arr.length;i++)
        {
            int num = seen.get(arr[i]);
            
            if(num > f)
            {
                f = num;
                result = arr[i];
                
            }
        }
        
        return result;
		
	}
}