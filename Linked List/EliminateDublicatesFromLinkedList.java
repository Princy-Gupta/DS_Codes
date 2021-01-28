import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class LinkedListNode<T> {
    T data;
    LinkedListNode<T> next;
    
    public LinkedListNode(T data) {
        this.data = data;
    }
}

public class Runner {
    
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    
    public static LinkedListNode<Integer> takeInput() throws IOException {
        LinkedListNode<Integer> head = null, tail = null;

        String[] datas = br.readLine().trim().split("\\s");

        int i = 0;
        while(i < datas.length && !datas[i].equals("-1")) {
            int data = Integer.parseInt(datas[i]);
            LinkedListNode<Integer> newNode = new LinkedListNode<Integer>(data);
            if(head == null) {
                head = newNode;
                tail = newNode;
            }
            else {
                tail.next = newNode;
                tail = newNode;
            }
            i += 1;
        }

        return head;
    }
    
    public static void print(LinkedListNode<Integer> head){
        while(head != null) {
            System.out.print(head.data + " ");
            head = head.next;
        }
        
        System.out.println();
    }
    
    public static void main(String[] args) throws NumberFormatException, IOException {
        int t = Integer.parseInt(br.readLine().trim());

        while (t > 0) {
            
            LinkedListNode<Integer> head = takeInput(); 

            head = Solution.removeDuplicates(head);
            print(head);

            t -= 1;
        }
        
    }
}









public class Solution {

	public static LinkedListNode<Integer> removeDuplicates(LinkedListNode<Integer> head) 
    {
        if(head == null || head.next==null)
            return null;
		LinkedListNode<Integer> temp1=head;
        LinkedListNode<Integer>temp2=temp1.next;
        
        while(temp2 != null)
        {
            if(temp1.data.equals(temp2.data))
            {
                temp2= temp2.next;
            }
            else
            {
                temp1.next = temp2;
                temp1 = temp1.next;
                temp2 = temp2.next;
            }
        }
        temp1.next = temp2;
        return head;
	}

}