import java.util.*;
public class Solution {

	public static void reverseStack(Stack<Integer> input, Stack<Integer> extra)
    {
		while(!input.isEmpty())
        {
            int x = input.pop();
            extra.push(x);
        }
        Stack<Integer> s = new Stack<>();
        while(!extra.isEmpty())
        {
            int x = extra.pop();
            s.push(x);
        }
        while(!s.isEmpty())
        {
            int x = s.pop();
            input.push(x);
        }
        
        
       
	}
}

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class Runner {

    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    public static Stack<Integer> takeInput() throws NumberFormatException, IOException {
        int size = Integer.parseInt(br.readLine().trim());
        Stack<Integer> input = new Stack<>();

        if (size == 0) {
            return input;
        }
        
        String[] values = br.readLine().trim().split(" ");

        for(int i = 0; i < size; i++) {
            input.push(Integer.parseInt(values[i]));
        }

        return input;
    }

    public static void main(String[] args) throws NumberFormatException, IOException {
        Stack<Integer> input = takeInput();
        Stack<Integer> empty = new Stack<>();

        Solution.reverseStack(input, empty);

        while(!input.isEmpty()) {
            System.out.print(input.pop() + " ");
        }

    }
}