   import java.util.*;
class TrieNode{
	char data;
	boolean isTerminating;
	TrieNode children[];
	int childCount;

	public TrieNode(char data) {
		this.data = data;
		isTerminating = false;
		children = new TrieNode[26];
		childCount = 0;
	}
}

public class Trie {
	private TrieNode root;
	
	public Trie() {
		root = new TrieNode('\0');
	}
    

	private void add(TrieNode root, String word){
		if(word.length() == 0){
			root.isTerminating = true;
			return;
		}		
		int childIndex = word.charAt(0) - 'a';
		TrieNode child = root.children[childIndex];
		if(child == null){
			child = new TrieNode(word.charAt(0));
			root.children[childIndex] = child;
			root.childCount++;
		}
		add(child, word.substring(1));
  
	}

	public void add(String word){
		add(root, word);
	}
	public void search(TrieNode  root, String word)
    {
        
    }
    public void search(String word)
    {
        search(root , word);
    }
	
    public  boolean find(TrieNode root, String word)
    {
        if(word.length()==0)
        {
            return true;
        }
        int childIndex=word.charAt(0)-'a';
        TrieNode child=root.children[childIndex];
        if(child==null)
        {
            return false;
        }
        return find(child, word.substring(1));
    }
    public boolean find(String word)
    {
        return find(root, word);
    }
    public TrieNode autoComplete(TrieNode root , String word)
    {
        if(word.length()==0)
        {
            return root;
        }
        int childIndex=word.charAt(0)-'a';
         TrieNode child=root.children[childIndex];
        if(child!=null)
        {
       
         return autoComplete(child,word.substring(1));
        }
        else
        {
            return null;
        }
        
        
    }
    public void finalFunction(TrieNode root, String word, String output)
    {
        if(root.isTerminating)
        {
            System.out.println(word + output);
        }
        for(int i =0; i < root.children.length; i++ )
        {
            TrieNode child=root.children[i];
            if(child!=null)
            {
                finalFunction(child, word, output+child.data);
            }
        }
        
    }
	public void autoComplete(ArrayList<String> input, String word) {
		// Complete this function
		// Print the output as specified in question
        for(int i=0; i<  input.size(); i++)
        {
            add(input.get(i));
        }
			      boolean exist=find(word);
       	if(!exist)
        {
            return ;
        } 
       	  TrieNode tempRoot=autoComplete(root,word);
     		finalFunction(tempRoot, word, "");
	}
}