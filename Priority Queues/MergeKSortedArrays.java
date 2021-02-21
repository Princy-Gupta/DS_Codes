import java.util.*;
public class Solution {

	public static ArrayList<Integer> mergeKSortedArrays(ArrayList<ArrayList<Integer>> input) {

		/* Your class should be named Solution
		 * Don't write main().
		 * Don't read input, it is passed as function argument.
		 * Return output and don't print it.
	 	 * Taking input and printing output is handled automatically.
        */
   PriorityQueue<Integer> pq = new PriorityQueue<>();
        
        for(int i=0;i<input.size();i++){
            ArrayList<Integer> temp = input.get(i);
            for(int j=0;j<temp.size();j++){
                pq.add(temp.get(j));
            }
        }

        ArrayList<Integer> output = new ArrayList<>();

        while(!pq.isEmpty()){
            output.add(pq.remove());
        }

        return output;

	}

}