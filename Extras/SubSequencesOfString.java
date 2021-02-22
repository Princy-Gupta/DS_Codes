public class main {
    public static void main(String[] args) {
        printSub("abc","");
    }

    private static void printSub(String abc, String s) {
        if(abc.length() == 0)
        {
            System.out.println(s);
            return;
        }
        char zeroth = abc.charAt(0);
        String leftString = abc.substring(1);

        printSub(leftString,s);
        printSub(leftString,s+zeroth);
    }
}
