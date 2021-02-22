import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        printMaze(0,0,n,"");

    }

    private static void printMaze(int cr, int cc, int n, String path) {
        if(cr == n-1 && cc == n-1)
        {
            System.out.println(path);
            return;
        }
        if(cr == n || cc ==n)
            return;
        printMaze(cr+1,cc,n,path+'H');
        printMaze(cr,cc+1,n,path+'V');
    }
}
