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
            
            LinkedListNode<Integer> head1 = takeInput(); 
            LinkedListNode<Integer> head2 = takeInput(); 

            LinkedListNode<Integer> newHead = Solution.mergeTwoSortedLinkedLists(head1, head2);
            print(newHead);
            
            t -= 1;
        }

    }
}

/*************** 
 * Following is the Node class already written 
class LinkedListNode<T> {
	T data;
	LinkedListNode<T> next;

	public Node(T data) {
		this.data = data;
	}
}
 ***************/

public class Solution {

	public static LinkedListNode<Integer> mergeTwoList(LinkedListNode<Integer> head1, LinkedListNode<Integer> head2) {
		/* Your class should be named Solution
		 * Don't write main().
		 * Don't read input, it is passed as function argument.
		 * Return output and don't print it.
	 	 * Taking input and printing output is handled automatically.
		*/
        
		LinkedListNode<Integer>l1=head1,t1= head1;
        LinkedListNode<Integer> l2=head2,t2=head2;
           LinkedListNode<Integer> h,t;
        if(l1.data<l2.data)
        {
            h=l1;
            t=l1;
            l1=l1.next;
            
        }
        else
        {
            
            h=l2;
            t=l2;
            l2=l2.next;
            
        }
        
            
        LinkedListNode<Integer> head=null;
        while(l1!=null && l2!=null)
        {
            if(l1.data<l2.data)
            {
                t.next=l1;
                l1=l1.next;
                t=t.next;
            }
            else
            {
                t.next=l2;
                l2=l2.next;
                t=t.next;
                
            }
           
            
        }
        if(l2==null)
        {
            t.next=l1;
        }
        else
            t.next=l2;
        return h;
	}

}

