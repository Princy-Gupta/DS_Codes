import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.StringTokenizer;

class QueueEmptyException extends Exception {
}

class QueueUsingLL<T> {

	class Node<T> {
		T data;
		Node<T> next;

		Node(T data) {
			this.data = data;
		}
	}

	private Node<T> head;
	private Node<T> tail;
	private int size = 0;

	public int size() {
		return size;
	}

	public boolean isEmpty() {
		if (size == 0) {
			return true;
		}
		return false;
	}

	public T front() throws QueueEmptyException {
		if (size == 0) {
			QueueEmptyException e = new QueueEmptyException();
			throw e;
		}

		return head.data;
	}

	public void enqueue(T element) {
		Node<T> newNode = new Node<T>(element);

		if (head == null) {
			head = newNode;
			tail = newNode;
		} else {
			tail.next = newNode;
			tail = newNode;
		}

		size++;
	}

	public T dequeue() throws QueueEmptyException {
		if (head == null) {
			QueueEmptyException e = new QueueEmptyException();
			throw e;
		}
		if (head == tail) {
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

	TreeNode(T data) {
		this.data = data;
		children = new ArrayList<TreeNode<T>>();
	}
}

public class Main {

	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));;
	static StringTokenizer st;

	public static TreeNode<Integer> takeInputLevelWise() throws IOException {
		QueueUsingLL<TreeNode<Integer>> pendingNodes = new QueueUsingLL<TreeNode<Integer>>(); // Queue of node that are
		// entered themselves
		// but their children
		// aren't added yet
		st = new StringTokenizer(br.readLine());
		int rootData = Integer.parseInt(st.nextToken());
		TreeNode<Integer> root = new TreeNode<Integer>(rootData);
		pendingNodes.enqueue(root);
		while (!pendingNodes.isEmpty()) {
			TreeNode<Integer> currentNode;
			try {
				currentNode = pendingNodes.dequeue();
				int numChild = Integer.parseInt(st.nextToken());
				for (int i = 0; i < numChild; i++) {
					int currentChild = Integer.parseInt(st.nextToken());
					TreeNode<Integer> childNode = new TreeNode<Integer>(currentChild);
					pendingNodes.enqueue(childNode);
					currentNode.children.add(childNode);
				}
			} catch (QueueEmptyException e) {
			}
		}
		return root;
	}

	public static void main(String[] args) throws IOException {
		TreeNode<Integer> root = takeInputLevelWise();
		Solution.printPostOrder(root);

	}

}





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

	public static void printPostOrder(TreeNode<Integer> root)
    {
		/* Your class should be named Solution.
		 * Don't write main() function.
		 * Don't read input, it is passed as function argument.
		 * Print output as specified in the question
		 */
        if(root == null)
            return;
        
        for(int i=0;i<root.children.size();i++)
        {
            printPostOrder(root.children.get(i));
        }
        System.out.print(root.data + " ");
	}

}