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

            boolean ans = Solution.isPalindrome(head);
            System.out.println(ans);

            t -= 1;

        }
        
    }
}




public class Solution {

	public static boolean isPalindrome(LinkedListNode<Integer> head) {
		//Your code goes here
        if(head==null)
            return true;
        
        LinkedListNode<Integer> temp=head,temp1=head;
        int c=0;
        while(temp!=null)
        {
            c++;
            temp=temp.next;
        }
        temp=head;
        int t=0;
        int i=0;
        if(c%2==0)
         t=c/2 -1;
        else 
         t=(c/2);
        while(i<t)
        {
            temp=temp.next;
            i++;
        }
        temp1=temp.next;
        temp.next=null;
        
        temp=head;
         temp1=reverse_R(temp1);
        // while(temp1!=null)
        // {  System.out.print(temp1.data);
        //  temp1=temp1.next;}
         
          while(temp1!=null)
        {
            if(temp1.data.equals(temp.data))
                
            {  temp1=temp1.next;
            temp=temp.next;
            }
              else
                  return false;
        }
       
        return true;
	}
public static LinkedListNode<Integer> reverse_R(LinkedListNode<Integer> head) {
		if(head==null||head.next==null){
            return head;
        }
        LinkedListNode<Integer> tail=head.next;
        LinkedListNode<Integer> smallhead=reverse_R(head.next);
        tail.next=head;
        head.next=null;
        return smallhead;
	}  
}

