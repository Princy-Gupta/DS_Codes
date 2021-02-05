public class Solution {

	/*	Binary Tree Node class 
	 * 
	 * 	class BinaryTreeNode<T> {
			T data;
			BinaryTreeNode<T> left;
			BinaryTreeNode<T> right;
			
			public BinaryTreeNode(T data) {
				this.data = data;
			}
		}
		*/
	
		public static BinaryTreeNode<Integer> SortedArrayToBST(int[] arr, int n){
          BinaryTreeNode<Integer> root=SortedArrayToBST(arr,0,arr.length-1);
        return root;
	}
    public static BinaryTreeNode<Integer> SortedArrayToBST(int[] arr,int s,int e)
    {  if(s>e)
        return null;
        int p=(s+e)/2;
        BinaryTreeNode<Integer> root= new BinaryTreeNode<Integer>(arr[p]);
      
        root.left= SortedArrayToBST(arr,s,p-1);
      root.right= SortedArrayToBST(arr,p+1,e);
     return root;
    }
            
			
		}
	