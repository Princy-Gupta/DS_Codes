/*
	
	Following is the structure used to represent the Binary Tree Node

	class BinaryTreeNode<T> {
		T data;
		BinaryTreeNode<T> left;
		BinaryTreeNode<T> right;

		public BinaryTreeNode(T data) {
			this.data = data;
			this.left = null;
			this.right = null;
		}
	}

 */
import java.util.*;
public class Solution {

	static int pairSum(BinaryTreeNode<Integer> root, int sum) 
    {

		Queue<BinaryTreeNode<Integer>> nodes = new LinkedList<>();
        nodes.add(root);
      //  int i=0;
        ArrayList<Integer> arr = new ArrayList<>();
       	
        while(!nodes.isEmpty())
        {
            BinaryTreeNode<Integer> front = nodes.remove();
            arr.add(front.data);
            if(front.left!=null)
            {
                nodes.add(front.left);
                
            }
            if(front.right!= null)
            {
                nodes.add(front.right);
            }
        }
            Collections.sort(arr);
            int i=0;
            int j=arr.size()-1;
            while(i<j)
            {
                int m = arr.get(i)+arr.get(j);
                if(m> sum)
                {
                    j--;
                }
                else if(m<sum)
                {
                    i++;
                }
                else
                {
                    System.out.println(arr.get(i++) + " "+arr.get(j--));
                   
                }
            }
        return 0;
            
	}

}