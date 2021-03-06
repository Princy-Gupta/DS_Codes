import java.util.*;
public class Main {
    static int count = 0;
    public static void main(String args[]) 
    {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();

        printMaze(0,0,n-1,m-1,"");
        System.out.println();
        System.out.print(count);

        
    }
    public static void printMaze(int r,int c,int n,int m,String ans)
    {
        if(r == n && c == m)
        {
            count++;
            System.out.print(ans + " ");
            return;
        }
        if(r > n || c > m)
        {
            return;
        }
        printMaze(r+1,c,n,m,ans+"V");
        printMaze(r,c+1,n,m,ans+"H");

    }
}
