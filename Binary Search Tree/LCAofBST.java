public class Solution {

	/*
	 * Binary Tree Node class
	 * 
	 * class BinaryTreeNode<T> { T data; BinaryTreeNode<T> left; BinaryTreeNode<T> right;
	 * 
	 * public BinaryTreeNode(T data) { this.data = data; } }
	 */


	
	public static int getLCA(BinaryTreeNode<Integer> root, int a, int b) 
    {
		int m=0,n=0;
		
        if(root == null)
        {
            return -1;
        }
        if(root.data == a || root.data == b)
        {
            return root.data;
        }
        if(a<root.data || b<root.data)
        {
              m = getLCA(root.left,a,b);
        }
       	if(a>root.data || b>root.data)
        {
          n = getLCA(root.right,a,b);   
        }
        
        
        if(m != 0 && n==0)
        {
            return m;
        }
        if(n!= 0 && m==0)
        {
            return n;
        }
        if(m==0 && n==0)
        {
            return 0;
        }
        else
        {
          return root.data;
        }
	}
}

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

/*	public static int lcaInBST(BinaryTreeNode<Integer> root , int a , int b){
		// Write your code here
        
if(root==null)
            return 0;
                int left=0,right=0;

if(root.data==a || root.data==b)
    return root.data;
   
        if(a<root.data || b<root.data)
        left=lcaInBST( root.left, a,  b);
        if(a>root.data || b>root.data)
        right=lcaInBST( root.right, a,  b);
        if(left!=0 && right==0)
            return left;
        if(right!=0 && left==0)
            return right;
        if(right==0 && left==0)
            return 0;
        else return root.data;
	}
}
*/