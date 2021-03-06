public class Solution {

	public static int power(int x, int n) {
		/* Your class should be named Solution
		 * Don't write main().
		 * Don't read input, it is passed as function argument.
		 * Return output and don't print it.
		 * Taking input and printing output is handled automatically.
		 */
        int p=1;
        for(int i=0;i<n;i++)
        {
            p=p*x;
        }
        return p;
		
	}
}