
import java.util.*;
public class Solution {

/*	TreeNode structure 
 * 
 * class TreeNode<T> {
		T data;
		ArrayList<TreeNode<T>> children;

		TreeNode(T data){
			this.data = data;
			children = new ArrayList<TreeNode<T>>();
		}
	}*/
	
		
	
	public static TreeNode<Integer> findSecondLargest(TreeNode<Integer> root)
    {
        TreeNode<Integer> max = new TreeNode<>(Integer.MIN_VALUE);
        TreeNode<Integer> smax = max;
        Queue<TreeNode> q = new LinkedList<>();
        q.add(root);
        while(!q.isEmpty())
        {
            TreeNode<Integer> p = q.remove();
            if(max.data < p.data)
            {
                smax = max;
                max = p;
                
            }
            if(p.data > smax.data && p.data < max.data)
            {
                smax = p;
            }
            
            for(int i=0;i<p.children.size();i++)
            {
                q.add(p.children.get(i));
			}
        }
        return smax;
        
	}
	
	
}












import java.util.ArrayList;
import java.util.Scanner;

 class QueueEmptyException extends Exception {
}

 class QueueUsingLL<T> {

    class Node<T> {
        T data;
        Node<T> next;
        Node(T data){
            this.data = data;
        }
    }
    
    private Node<T> head;
    private Node<T> tail;
    private int size = 0;

    public int size(){
        return size;
    }

    public boolean isEmpty(){
        if(size == 0){
            return true;
        }
        return false;
    }

    public T front() throws QueueEmptyException{
        if(size == 0){
            QueueEmptyException e = new QueueEmptyException();
            throw e;
        }

        return head.data;
    }


    public void enqueue(T element){
        Node<T> newNode = new Node<T>(element);

        if(head == null){
            head = newNode;
            tail = newNode;
        }
        else{
            tail.next = newNode;
            tail = newNode;
        }

        size++;
    }

    public T dequeue() throws QueueEmptyException{
        if(head == null){
            QueueEmptyException e = new QueueEmptyException();
            throw e;
        }
        if(head == tail){
            tail = null;
        }
        T temp = head.data;
        head = head.next;
        size--;
        return temp;
    }
}

   class TreeNode<T> {
        T data;
        ArrayList<TreeNode<T>> children;

        TreeNode(T data){
            this.data = data;
            children = new ArrayList<TreeNode<T>>();
        }
    }
 
public class Main {

    

    static Scanner s = new Scanner(System.in);

    public static TreeNode<Integer> takeInputLevelWise(){
        QueueUsingLL<TreeNode<Integer>> pendingNodes = new QueueUsingLL<TreeNode<Integer>>();  // Queue of node that are entered themselves but their children aren't added yet
        int rootData = s.nextInt();
        TreeNode<Integer> root = new TreeNode<Integer>(rootData);
        pendingNodes.enqueue(root);
        while(!pendingNodes.isEmpty()){
            TreeNode<Integer> currentNode;
            try {
                currentNode = pendingNodes.dequeue();
                int numChild = s.nextInt();
                for(int i = 0 ; i < numChild; i++){
                    int currentChild = s.nextInt();
                    TreeNode<Integer> childNode = new TreeNode<Integer>(currentChild);
                    pendingNodes.enqueue(childNode);
                    currentNode.children.add(childNode);
                }
            } catch (QueueEmptyException e) {
            }
        }
        return root;
    }


    public static void main(String[] args) {
        TreeNode<Integer> root =  takeInputLevelWise();
        TreeNode<Integer> ans = Solution.findSecondLargest(root);
        if(ans == null){
            System.out.println(Integer.MIN_VALUE);
        }else{
            System.out.println(ans.data);
        } 
    }

}

