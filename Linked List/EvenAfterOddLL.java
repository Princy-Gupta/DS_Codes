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

            LinkedListNode<Integer> newHead = Solution.evenAfterOdd(head);
            print(newHead);

            t -= 1;
        }

    }
}




/*
class LinkedListNode<T> {
	public T data;
	public LinkedListNode<T> next;

	public LinkedListNode(T data) {
		this.setData(data);
		this.next = null;
	}



}
* */
public class Solution {
	public static LinkedListNode<Integer> sortEvenOdd(LinkedListNode<Integer> head) 
    {
        LinkedListNode<Integer> oh = null;
        LinkedListNode<Integer> ot = null;
        
        LinkedListNode<Integer> eh = null;
        LinkedListNode<Integer> et = null;
        
        LinkedListNode<Integer> temp = head;
        
        if(head == null)
            return null;
        if(head.next == null)
            return head;
        
        while(temp != null)
        {
            if(temp.data % 2 == 1)
            {
                if(oh == null)
                {
                    oh = temp;
                    ot = temp;
                    temp = temp.next;
                }
                else
                {
                    ot.next = temp;
                    ot = ot.next;
                    temp = temp.next;
                }
            }
            else
            {
                if(eh == null)
                {
                    eh = temp;
                    et = temp;
                     temp = temp.next;
                }
                else
                {
                    et.next = temp;
                    et=et.next;
                     temp = temp.next;
                }
            }
           
        }
        
      	if(oh == null)
        {
            return eh;
        }
        ot.next = eh;
   		return oh;

	}
}
