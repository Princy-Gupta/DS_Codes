/* 

    Following is the class used to represent the Node of a Singly Linked List

    class Node<T> {
        public T data;
        public Node<T> next;

        public Node(T data) {
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
*/

public class Solution {

    public static void deleteAlternateNodes(Node<Integer> head) 
    {
        Node<Integer> f = head;
        Node<Integer> r = head.next;
        
        if(head.next == null)
        {
            return;
        }
        
        while(f.next != null && r.next!= null && r.next.next!= null)
        {
            f.next = r.next;
            f = f.next;
            r = r.next.next;
            
        }
        if(r.next != null)
        {
            f.next = r.next;
        }
        else
        {
            f.next = null;
        }
        
        
    }
}



import java.util.Scanner;

class Node<T> {
    public T data;
    public Node<T> next;

    public Node(T data) {
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

public class Runner {

    static Scanner s = new Scanner(System.in);

    public static void main(String[] args) {

        Node<Integer> list = input();
        Solution.deleteAlternateNodes(list);
        print(list);
    }

    public static void print(Node<Integer> head) {
        while (head != null) {
            System.out.print(head.getData() + " ");
            head = head.next;
        }
    }

    public static Node<Integer> input() {
        int data = s.nextInt();

        Node<Integer> head = null;
        Node<Integer> tail = null;
        while (data!=-1) {
            Node<Integer> newNode = new Node<Integer>(data);
            if (head == null) {
                head = newNode;
                tail = newNode;
            } else {
                tail.next = newNode;
                tail = newNode;
            }
            data = s.nextInt();
        }
        return head;
    }

}