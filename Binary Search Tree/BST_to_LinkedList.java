public class Solution 
{

	/*
	 * Binary Tree Node class
	 * 
	 * class BinaryTreeNode<T> { T data; BinaryTreeNode<T> left; BinaryTreeNode<T>
	 * right;
	 * 
	 * public BinaryTreeNode(T data) { this.data = data; } }
	 */

	/*
	 * LinkedList Node Class
	 *
	 * 
	 * class LinkedListNode<T> { T data; LinkedListNode<T> next;
	 * 
	 * public LinkedListNode(T data) { this.data = data; } }
	 */
    
     static LinkedListNode<Integer> head=null,tail=null;
       

	public static LinkedListNode<Integer> constructLinkedList(BinaryTreeNode<Integer> root) 
    {
        
        if(root == null)
            return null;
        constructLinkedList(root.left);
        
        LinkedListNode<Integer> n = new LinkedListNode<>(root.data);
        if(head == null)
        {
            head = n;
            tail = n;
        
        }
        else
        {
            tail.next = n;
            tail = tail.next;
        }
        
        constructLinkedList(root.right);
        
        return head;
        
	}
 /* public static LinkedListNode<Integer> ll(BinaryTreeNode<Integer> root)
    {
        
    }*/
}