public class Solution {

	/*
	 * Binary Tree Node class
	 * 
	 * class BinaryTreeNode<T> { T data; BinaryTreeNode<T> left; BinaryTreeNode<T> right;
	 * 
	 * public BinaryTreeNode(T data) { this.data = data; } }
	 */


	public static boolean searchInBST(BinaryTreeNode<Integer> root, int k) {
        boolean b= false;
		if(root==null)
            return false;
        if(root.data==k)
            return true;
        if(k>root.data)
        {  b= searchInBST(root.right, k);
         if(b)
             return true;
         }
        if(k<root.data)
        {
             b= searchInBST(root.left, k);
         if(b)
             return true;
         }
        return false;
        }
            
	}
