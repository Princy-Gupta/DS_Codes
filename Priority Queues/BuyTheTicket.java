import java.util.*;
public class Solution {
	
	public static int buyTicket(int input[], int k) {
		/* Your class should be named Solution
		* Don't write main().
		* Don't read input, it is passed as function argument.
		* Return output and don't print it.
		* Taking input and printing output is handled automatically.
		*/
        com max= new com ();
        PriorityQueue<Integer> pq= new PriorityQueue<>(max);
        // ArrayList<Integer> arr= new ArrayList<>();
        Queue<Integer> arr = new LinkedList<>();
        for(int i=0;i<input.length;i++)
        {
            pq.add(input[i]);
            arr.add(input[i]);
        }
        int time=0;
        int i=0;
       int p=pq.remove();
        while(i!=k || arr.peek()!=p )
        {
            
            if(arr.peek()==p)
            {
                p=pq.remove();
                time++;
                arr.remove();
                k--;
            }
            else
            {
                int r=arr.remove();
                arr.add(r);
                if(k==0)
                {
                    k=arr.size()-1;
                }
                else
                {
                    k--;
                }
            }
            
        }
        return time+1;

	}
}
class com implements Comparator<Integer>
{

	@Override
	public int compare(Integer o1, Integer o2) {
		// TODO Auto-generated method stub
		if(o1<o2)
			return 1;
		else return -1;
	}
	
}