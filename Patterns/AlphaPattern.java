import java.util.Scanner;
public class Solution {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        
        int i=1;
        int a=0;
        
        while(i<=n)
        {
            
            int j=0;
            while(j<i)
            {
                char abc = (char)(65+a);
                System.out.print(abc);
                j++;
            }
            a++;
            
            
            
            System.out.println();
            i++;
            
        }

		
	}

}