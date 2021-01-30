/********** Given Queue Class **************
// You can directly use these functions

class Queue<T> {

	public int size();

	public boolean isEmpty();

	public T front();

	public void enqueue(T element);

	public T dequeue();
}

**********************************/



public class Solution {
   static int count = 0;

	public static void reverseQueue(Queue<Integer> q) 
    {
        
			/*//while(count != 4)
            {
                count++;
                int x = q.dequeue();
                q.enqueue(x);
            }*/
        if(q.size()==1)
            return;
        int x = q.dequeue();
        reverseQueue(q);
        q.enqueue(x);
	}
}



import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;

public class Runner {

    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    public static Queue<Integer> takeInput() throws NumberFormatException, IOException {

        int n = Integer.parseInt(br.readLine().trim());

        String[] values = br.readLine().trim().split(" ");

        Queue<Integer> queue = new LinkedList<>();

        for (int i = 0; i < n; i++) {
            queue.add(Integer.parseInt(values[i]));
        }

        return queue;

    }

    public static void main(String[] args) throws NumberFormatException, IOException {

        int t = Integer.parseInt(br.readLine().trim());

        while (t > 0) {
            Queue<Integer> queue = takeInput();
            Solution.reverseQueue(queue);

            while (!queue.isEmpty()) {
                System.out.print(queue.poll() + " ");
            }

            System.out.println();

            t -= 1;
        }
    }
}