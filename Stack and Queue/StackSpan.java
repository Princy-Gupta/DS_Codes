import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Runner {

    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    public static int[] takeInput() throws NumberFormatException, IOException {
    	int size = Integer.parseInt(br.readLine().trim());
    	int[] input = new int[size];

    	if (size == 0) {
    		return input;
    	}

    	String[] values = br.readLine().trim().split(" ");

    	for(int i = 0; i < size; i++) {
    		input[i] = Integer.parseInt(values[i]);
    	}

    	return input;
    }

    public static void printArray(int[] arr) {
    	for (int i = 0 ; i < arr.length; i++) {
    		System.out.print(arr[i] + " ");
    	}

    	System.out.println();
    }

    public static void main(String[] args) throws NumberFormatException, IOException {
    	int[] input = takeInput();

    	int[] output = Solution.stockSpan(input);

    	printArray(output);

    }
}


import java.util.*;


public class Solution {

    public static int[] stockSpan(int[] price) {
        // Write your code here
        int i;
      Stack<Integer> s= new Stack<>();
        int[] arr= new int[price.length];
        s.push(0);
        arr[0]=1;
for(i=1;i<price.length;i++)
{
    while(!s.isEmpty() && price[s.peek()] < price[i]) 
  {
   s.pop(); 
  }
    if(s.isEmpty()) 
{
  arr[i] = i + 1; 
}

else 
{ 
   arr[i] = i - s.peek(); 
} 

s.push(i);
    
}
        return arr;
        
    }
        
}
