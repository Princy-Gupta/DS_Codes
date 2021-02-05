public class Solution {

	public static boolean isBST(BinaryTreeNode<Integer> root) {
		/* Your class should be named Solution
		* Don't write main().
		* Don't read input, it is passed as function argument.
		* Return output and don't print it.
		* Taking input and printing output is handled automatically.
		*/
       if(root==null)
           return true;
        int max=Max(root.left);
        int min=Min(root.right);
        if(max>=root.data || min<root.data)
            return false;
        boolean lft=isBST(root.left);
        boolean rt=isBST(root.right);
        if(lft && rt)
            return true;
        return false;
        
	}
    public static int Max(BinaryTreeNode<Integer> root)
    {
        if(root==null)
            return Integer.MIN_VALUE;
        return Math.max(root.data,Math.max(Max(root.left),Max(root.right)));
    }
    public static int Min(BinaryTreeNode<Integer> root)
    {
        if(root==null)
            return Integer.MAX_VALUE;
        return Math.min(root.data,Math.min(Min(root.left),Min(root.right)));
    }
    
}