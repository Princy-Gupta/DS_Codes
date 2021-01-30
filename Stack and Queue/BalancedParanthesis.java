import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Runner {

    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    public static void main(String[] args) throws NumberFormatException, IOException {
        String expression = br.readLine().trim();
        System.out.println(Solution.isBalanced(expression));
    }
}

import java.util.*;
public class Solution {

    public static boolean isBalanced(String expression)
    {
        Stack<Character> s = new Stack();
        int i=0;
        while(i<expression.length())
        {
            if(expression.charAt(i)=='(')
            {
                s.push('(');
                i++;
            }
            else if(expression.charAt(i)==')')
            {
                
                if(s.isEmpty() == true)
                    return false;
                else if(s.peek() == '(')
                {
                    s.pop();
                    i++;
                }
                    
            }
            else
            {
                i++;
                continue;
               
            }
        }
        
        if(s.size() == 0)
            return true;
        return false;
    }
}