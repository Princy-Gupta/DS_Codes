import java.util.Scanner;
public class Solution {


	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
        
    	int n = input.nextInt();
        
       int i=1;
        char var='A';
        int j=1;
        while(i<=n)
        {
            j=1;
            while(j<=i)
            {
                System.out.print(var);
                var++;
                j++;
            }
            System.out.println();
            i++;
            var=(char)(var-(j-2));
        }
	}

}
