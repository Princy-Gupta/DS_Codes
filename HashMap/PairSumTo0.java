import java.util.*;

public class Solution {
	public static int PairSum(int[] input, int size) {
		/* Your class should be named Solution
		 * Don't write main().
		 * Don't read input, it is passed as function argument.
		 * Return output and don't print it.
	 	 * Taking input and printing output is handled automatically.
        */
        int count=0,c=0;
          HashMap<Integer,Integer> map = new HashMap<>();
         for(int i=0;i<input.length;i++)
         {
             if(map.containsKey(-(input[i])))
             {
                 int m=map.get(-(input[i]));
                 if(map.containsKey(input[i]))
                 {
                      c=map.get(input[i]);
                     
                 }
                 
                 int p=m;
                 while(p>0)
                 {
                     //System.out.print(input[i]+" ");
                     count++;
                     p--;
                 }
                
            
                 map.put(input[i],++c);
                 c=0;
                 continue;
             }
             else
             {
                 if(map.containsKey(input[i]))
                 {
                     int m=map.get(input[i]);
                      map.put(input[i],++m);
                 }
                 else
                  map.put(input[i],1);
             }
            
             
         }
     return count;  
	}
}