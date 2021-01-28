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
        while (i < datas.length && !datas[i].equals("-1")) {
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

            int n = Integer.parseInt(br.readLine().trim());
            head = Solution.appendLastNToFirst(head, n);
            print(head);

            t -= 1;
        }
        
    }
}









public class Solution {

	public static LinkedListNode<Integer> appendLastNToFirst(LinkedListNode<Integer> head, int n) 
    {
        if(head == null)
            return null;
        if(n==0)
        	return head;
		int i = 0;
        LinkedListNode<Integer> temp = head;
        LinkedListNode<Integer> temp1 = head;
        LinkedListNode<Integer> temp2 = head;
        
        while(temp.next != null)
        {
            i++;
            temp = temp.next;
           // i++;
        }
        
        int count = i-n;
        int j=0;
        
        while(j<count)
        {
            temp1 = temp1.next;
            j++;
        }
        temp2=temp1.next;
        temp1.next = null;
        temp.next=head;
        
        return temp2;
        
	}

}