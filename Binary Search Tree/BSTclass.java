/***************
 * BinaryTreeNode class already given - 
 * 
class BinaryTreeNode<T> {
	T data;
	BinaryTreeNode<T> left;
	BinaryTreeNode<T> right;

	public BinaryTreeNode(T data) {
		this.data = data;
	}
}
***************/

/**************
 * Main function that we are using internally 
 * 
public static void main(String[] args) {
		BinarySearchTree bst = new BinarySearchTree();
		int choice, input;
		while(true) {
			choice = s.nextInt();
			switch(choice) {
				case 1 : 
					input = s.nextInt();
					bst.insertData(input);
					break;
				case 2 : 
					input = s.nextInt();
					bst.deleteData(input);
					break;
				case 3 : 
					input = s.nextInt();
					System.out.println(bst.search(input));
					break;
				default :
					bst.printTree();
					return;
			}

		}
*******************/

public class BinarySearchTree
{
     BinaryTreeNode<Integer> root;
    public BinaryTreeNode<Integer> insertData(BinaryTreeNode<Integer> root,int data)
    {
        if(root==null)
        {
           BinaryTreeNode<Integer> newNode = new BinaryTreeNode<Integer>(data);
            return newNode;
               
        }
         
        if(root.data < data)
        {
            root.right = insertData(root.right,data);
        }
        else
        {
            root.left = insertData(root.left,data);
        }
        return root;

    }
    public void insertData(int data)
    {
        root = insertData(root,data);
    }
  
  
    public boolean hasDataHelper(int data, BinaryTreeNode<Integer> root)
    {
        if(root == null)
        {
            return false;
        }
        if(root.data == data)
        {
            return true;
        }
        else if(data>root.data)
        {
            return hasDataHelper(data,root.right);
        }
        else
        {
            return hasDataHelper(data,root.left);
        }
    }
    public boolean search(int data)
    {
      return hasDataHelper(data,root);
    }
    
    public void deleteData(int data)
    {
		root = deleteData(data, root);
	}
	
	public BinaryTreeNode<Integer> deleteData(int data, BinaryTreeNode<Integer> root)
    {
		if (root == null)
        {
			return null;
		}
		if (data < root.data)
        {
			root.left = deleteData(data, root.left);
			return root;
		} else if (data > root.data)
        {
			root.right = deleteData(data, root.right);
			return root;
		} else
        {
			if (root.left == null && root.right == null)
            {
				return null;
			} else if (root.left == null)
            {
				return root.right;
                
			} else if (root.right == null) 
            {
				return root.left;
			} else
            {
				BinaryTreeNode<Integer> minNode = root.right;
				while (minNode.left != null) 
                {
					minNode = minNode.left;
				}
				root.data = minNode.data;
				root.right = deleteData(minNode.data, root.right);
				return root;
			}
		}
    }
		
        
		public void printTree(BinaryTreeNode<Integer> root)
        {
		if (root == null) 
        {
			return;
		}
		String toBePrinted = root.data + ":";
		if (root.left != null)
        {
			toBePrinted += "L:" + root.left.data + ",";
		}
		
		if (root.right != null)
        {
			toBePrinted += "R:" + root.right.data;
		}
		System.out.println(  toBePrinted);
		printTree(root.left);
		printTree(root.right);
	}
	
	public void printTree() 
    {
		printTree(root);
	}
	
}

    
	
	

