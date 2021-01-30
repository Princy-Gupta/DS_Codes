import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Runner {

    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    public static void main(String[] args) throws NumberFormatException, IOException {

    	System.out.println(Solution.countBracketReversals(br.readLine().trim()));

    }
}

import java.util.*;
public class Solution {

	
	// Function returns -1 if brackets can't be balanced
	public static int countBracketReversals(String input){
		
		// Write your code here
        int len = input.length();
        
        if(len == 0)
            return 0;
        if(len % 2 != 0)
            return -1;
        Stack<Character> stack = new Stack<>();
        
        for(int i=0;i<len;i++)
        {
            char current = input.charAt(i);
        
        
        if(current == '{')
        {
            stack.push(current);
        
        }
        else
        {
            if(!stack.isEmpty() && stack.peek() == '{')
            {
               stack.pop();
            }
            else
            {
                stack.push(current);
            }
        }
        }
        
        int count = 0;
        
        while(!stack.isEmpty())
        {
             char c1 = stack.pop();
                char c2 = stack.pop();
            if(c1 != c2)
            {
                count += 2;
            }
            else
            {
                count += 1;
            }
        }
        return count;

	}
	
	

}
