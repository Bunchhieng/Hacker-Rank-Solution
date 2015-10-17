import java.util.Scanner;

/**
 * Created by Bunchhieng on 10/16/15.
 */
public class Palindrome {
    /*
    public static boolean isPalindrome(String s) {
        int n = s.length();
        for (int i=0;i<(n / 2) + 1;++i) {
            if (s.charAt(i) != s.charAt(n - i - 1)) {
                return false;
            }
        }

        return true;
    }
    */
    public static boolean isPalindrome(String str) {
        return str.equals(new StringBuilder(str).reverse().toString());
    }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String str = in.next();

        if (isPalindrome(str)) System.out.println("Yes");
        else System.out.println("No");
    }
}
