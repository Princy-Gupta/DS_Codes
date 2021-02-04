import java.util.Scanner;
public class Solution {
	public static void main(String[] args) {
		
        Scanner input = new Scanner(System.in);
        
        int n = input.nextInt();
        
        int i=1;
        //int x=0;
        //int a=0;
        char abc = (char)(64+n);
        
        while(i<=n)
        {
         // x=1;
            
            
            int j=1;
            
            while(j<=i)
            {
                
                System.out.print(abc);
                abc++;
                j++;
                
            }
            
            System.out.println();
            
            i++;
            abc = (char)(abc-(j));
        }
        
    
        
	}
}