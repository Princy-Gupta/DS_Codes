
import java.util.*;
public class Main {
    static int count = 0;
    public static void main(String args[]) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int m = s.nextInt();

        char str[][] = new char[n][m];
        for(int i=0;i<n;i++)
        {
            String sa = s.next();
            for(int j=0;j<m;j++)
            {
                str[i][j] = sa.charAt(j);
            }
        }
        int check1[][] = new int[n][m];
        boolean check[][] = new boolean[n][m];
        printMaze(str,0,0,n-1,m-1,check,check1);

       if(count == 0)
       {
           System.out.print("NO PATH FOUND");
       }

    }
    public static void printMaze(char str[][],int cr,int cc,int n,int m,boolean check[][],int check1[][])
    {
        
        if(cr > n || cc > m || cr < 0 || cc < 0 || check[cr][cc] || str[cr][cc] == 'X')
        {
            return;
        }
        if(cr == n && cc == m)
        {
            check1[cr][cc]=1;
            count = 1;
            print(check1,n,m);
           
        }
        check [cr][cc] = true;
        check1[cr][cc]= 1;
         printMaze(str,cr-1,cc,n,m,check,check1);
        printMaze(str,cr+1,cc,n,m,check,check1);
        printMaze(str,cr,cc-1,n,m,check,check1);
        printMaze(str,cr,cc+1,n,m,check,check1);
        // printMaze(str,cr-1,cc,n,m,check);
        // printMaze(str,cr+1,cc,n,m,check);
        check [cr][cc] = false;
        check1[cr][cc]= 0;

    }
    public static void print(int check[][],int n,int m)
    {
         for(int i=0;i<=n;i++)
        {
            for(int j=0;j<=m;j++)
            {
                System.out.print(check[i][j] + " ");
            }
            System.out.println();
        }
    }
}





/*5 4
OXOO
OOOX
XOXO
XOOX
XXOO*/