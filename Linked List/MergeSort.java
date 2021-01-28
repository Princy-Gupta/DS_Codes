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
    
    public static void print(LinkedListNode<Integer> head) {
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

            LinkedListNode<Integer> newHead = Solution.mergeSort(head);
            print(newHead);
            
            t -= 1;
        }

    }
}




/*

    Following is the Node class already written for the Linked List

    class LinkedListNode<T> {
        T data;
        LinkedListNode<T> next;
    
        public LinkedListNode(T data) {
            this.data = data;
        }
    }

*/

public class Solution {

	public static LinkedListNode<Integer> mergeSort(LinkedListNode<Integer> head)
    {
        
        
        if(head == null || head.next == null )
            return head;
		LinkedListNode<Integer> fast = head,slow=head,temp=head;
        
            
        while(fast.next!= null && fast.next.next!= null)
        {
            slow = slow.next;
            fast = fast.next.next;
        }
        LinkedListNode<Integer> head2 = slow.next;
        slow.next = null;
        
        LinkedListNode<Integer> l = mergeSort(temp);
        LinkedListNode<Integer> r = mergeSort(head2);
        LinkedListNode<Integer> result = mergeSort(l,r);
        
        return result;
        
        
	}
    
    
    public static LinkedListNode<Integer> mergeSort(LinkedListNode<Integer> head1,LinkedListNode<Integer> head2)
    {
        if(head1 == null)
            return head2;
        if(head2 == null)
            return head1;
        
        LinkedListNode<Integer> head=null;
        LinkedListNode<Integer> tail = null;
        LinkedListNode<Integer> l = head1;
        LinkedListNode<Integer> r = head2;
        
        if(l.data <= r.data)
        {
            head = l;
            tail = l;
            l = l.next;
        }
        else
        {
            head = r;
            tail = r;
            r = r.next;
        }
        
    
        while(l!= null && r!= null)
        {
            if(l.data <= r.data)
            {
                tail.next = l;
                l = l.next;
                tail = tail.next;
            }
            else
            {
                tail.next = r;
                r = r.next;
                tail = tail.next;
            }
        }
        
        if(l == null)
        {
            tail.next = r;
        }
        else
        {
            tail.next = l;
        }
        
        return head;
    }

}


