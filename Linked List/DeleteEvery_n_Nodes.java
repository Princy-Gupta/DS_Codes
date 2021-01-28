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
            String[] m_n = br.readLine().trim().split("\\s");

            int m = Integer.parseInt(m_n[0]);
            int n = Integer.parseInt(m_n[1]);

            LinkedListNode<Integer> newHead = Solution.skipMdeleteN(head, m, n);
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

	public T getData() {
		return data;
	}

	public void setData(T data) {
		this.data = data;
	}

}
* */
public class solution {
	public static LinkedListNode<Integer> skipMdeleteN(LinkedListNode<Integer> head, int M, int N) 
    {
        LinkedListNode<Integer> temp = head;
        LinkedListNode<Integer> t1 =head;
        LinkedListNode<Integer> t2 = head;
        if (M == 0 || head == null)
            return null;
      	if (N== 0)
            return head;
        
        while(t1 != null)
        {
            int i=1;
            while(i<M && t1.next != null)
            {
              t1 = t1.next;
             i++;
            }
            t2 = t1;
            
            
            int j=0;
            while(j<N && t2.next != null )
            {
                t2 = t2.next;
            	j++;
            }
                t1.next = t2.next;
            	t1 = t1.next;
        }
        
        return head;
        
       /* if(m==0)
            return null;
        if(n==0)
            return head;
        LinkedListNode<Integer> temp=head,temp1=head;
        int i=0;
        int j=0;
        while(temp!=null && temp1!=null)
            
        {
            
           
            while(i<m-1 && temp.next!=null)
            {
                temp=temp.next;
                i++;
            }
            temp1=temp;
            while(j<n && temp1.next!=null)
            {
                temp1=temp1.next;
                j++;
            }
            
            temp.next=temp1.next;
            temp=temp.next;
            i=0;
            j=0;
            
        }
        return head;*/
        
        
        
       

	}
}



