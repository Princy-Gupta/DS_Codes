import java.util.Scanner;

class Node {
	int data;
	Node next;

	public Node(int data) {
		this.data = data;
		this.next = null;
	}
}

public class QueueUse {

	private static Scanner s = new Scanner(System.in);

	public static void main(String[] args) {
		Queue queue = new Queue();

		int q = s.nextInt();

		while (q > 0) {
			int choice, input;
			choice = s.nextInt();

			switch(choice) {
				case 1:
					input = s.nextInt();
					queue.enqueue(input);
					break;

				case 2:
					System.out.println(queue.dequeue());
					break;

				case 3:
					System.out.println(queue.front());
					break;

				case 4:
					System.out.println(queue.getSize());
					break; 

				default: 
					System.out.println((queue.isEmpty()) ? "true" : "false");
			}

			q -= 1;
		}

	}

}

/***************
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);

		Queue<Integer> st = new Queue<Integer>();

		int choice = s.nextInt();
		int input;

		while (choice !=-1) {
			if(choice == 1) {
				input = s.nextInt();
				st.enqueue(input);
			}
			else if(choice == 2) {
				try {
					System.out.println(st.dequeue());
				} catch (QueueEmptyException e) {
					System.out.println(-1);
				}
			}
			else if(choice == 3) {
				try {
					System.out.println(st.front());
				} catch (QueueEmptyException e) {
					System.out.println(-1);
				}
			}
			else if(choice == 4) {
				System.out.println(st.size());
			}
			else if(choice == 5) {
				System.out.println(st.isEmpty());
			}
			choice = s.nextInt();
		}
	}
}

class Node<T> {
	T data;
	Node<T> next;

	public Node(T data) {
		this.data = data;
	}
}


 ***********/





















public class Queue  {
	
	//Define the data members
    Node head;
    Node tail;
    int size;


	public Queue() {
		//Implement the Constructor
        head=null;
        tail=null;
        size=0;
	}
	





	public int getSize() { 
		//Implement the getSize() function
        return size;
    }


    public boolean isEmpty() { 
    	//Implement the isEmpty() function
        if(size==0)
            return true;
        return false;
    }


    public void enqueue(int data) {
    	//Implement the enqueue(element) function
        Node newNode= new Node(data);
        if(head==null)
        {  head=newNode;
         tail=newNode;
        }
        else
        {
            tail.next=newNode;
            tail=tail.next;
        }
        size++;
    }


    public int dequeue() {
        if(size==0)
         	return  -1;
         Node newNode= head;
        head=head.next;
        size--;
        return newNode.data;
           
    }


    public int front()  {
    	//Implement the front() function
        if(size==0)
            return -1;
        return head.data;
    }
}

