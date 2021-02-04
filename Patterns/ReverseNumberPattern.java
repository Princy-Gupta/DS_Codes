import java.util.Scanner;
public class Solution {


	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
        
        int n = input.nextInt();
        
        int i=1;
        
        while(i<=n)
        {
            int j=1;
            int x=i;
            while(j<i+1)
            {
                System.out.print(x);
                x--;
                j++;
            }
            System.out.println();
            i++;
        }
            
        
	}

}
