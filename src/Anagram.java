import java.util.Arrays;
import java.util.HashMap;
import java.util.Scanner;

/**
 * Created by Bunchhieng on 10/16/15.
 */
public class Anagram {
    static boolean isAnagram(String A, String B) {
        //Complete the function

        if (A.length() != B.length()) {
            return false;
        }
        return sortCharacters(A).equals(sortCharacters(B));
    }

    private static String sortCharacters(String str) {
        char[] charArray = str.toLowerCase().toCharArray();
        Arrays.sort(charArray);
        System.out.println(String.valueOf(charArray));
        return String.valueOf(charArray);
    }
    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);
        String A=sc.next();
        String B=sc.next();
        boolean ret=isAnagram(A,B);
        if(ret)System.out.println("Anagrams");
        else System.out.println("Not Anagrams");

    }
}
