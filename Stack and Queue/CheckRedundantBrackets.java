import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Runner {

    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    public static void main(String[] args) throws NumberFormatException, IOException {

    	String expression = br.readLine().trim();
    	System.out.println(Solution.checkRedundantBrackets(expression));
    }
}



import java.util.*;
public class Solution {

	public static boolean checkRedundantBrackets(String expression) 
    {
		Stack<Character> s = new Stack<>();
        int count = 0;
        for(int i=0;i<expression.length();i++)
        {
            if(expression.charAt(i) == '(')
            {
                s.push('(');
                count = 0;
            }
            else if(expression.charAt(i) == ')')
            {
                if(count == 0 || count == 1)
                    return true;
                s.pop();
                count=0;
                
            }
            else
            {
                count++;
            }
        }
        return false;
	}
}