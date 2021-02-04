import java.util.Scanner;
public class Solution {


	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
        int j=0;
       int n=s.nextInt();
        for(int i=1;i<=n;i++)
        {      j=0;
        while(j<i)
        {
            System.out.print("*");
            j++;
        }

		System.out.println();
        }
	}

}
