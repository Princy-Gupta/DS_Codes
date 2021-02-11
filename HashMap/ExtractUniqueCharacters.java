import java.util.HashMap;

public class Solution {

	public static String uniqueChar(String str){
		/* Your class should be named Solution
		 * Don't write main().
		 * Don't read input, it is passed as function argument.
		 * Return output and don't print it.
	 	 * Taking input and printing output is handled automatically.
		*/
       HashMap<Character,Boolean> seen = new HashMap<>();
        String abc="";
        
        for(int i=0;i<str.length();i++)
        {
            if(seen.containsKey(str.charAt(i)))
            {
               continue;
            }
            else
            {
                seen.put(str.charAt(i),true);
                abc= abc+str.charAt(i);
            }
        }
        return abc;

	}
}