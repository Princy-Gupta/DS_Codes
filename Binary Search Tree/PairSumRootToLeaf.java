public class Solution {

/*	Binary Tree Node class
 * 
 * class BinaryTreeNode<T> {
		T data;
		BinaryTreeNode<T> left;
		BinaryTreeNode<T> right;
		
		public BinaryTreeNode(T data) {
			this.data = data;
		}
	}
	*/
	
	public static void rootToLeafPathsSumToK(BinaryTreeNode<Integer> root, int k)
    {
        String s="";
        PathSum(root,k,s);
		// Write your code here
	}
    
    public static void PathSum(BinaryTreeNode<Integer> root,int k, String s)
    {
        if(root == null)
            return;
        if(root.left==null && root.right==null)
        {
            if(root.data == k)
            {
                System.out.println(s+root.data);
                return;
            }
        }
        PathSum(root.left,k-root.data,s+root.data + " ");
        PathSum(root.right,k-root.data,s+root.data+" ");
        return;
    }
}
