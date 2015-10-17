import java.util.Scanner;

/**
 * Created by Bunchhieng on 10/16/15.
 */
public class LexiCompare {
    public static String lexMax(String str, int length) {
        String max = "";
        if (str.length() == length) max = str;
        for (int i = 0; i < str.length() - length; i++) {
            if (max.compareTo(str.substring(i, i + length)) < 0) {
                max = str.substring(i, i + length);
            }
        }
        return max;
    }

    public static String lexMin(String str, int length) {
        String min = str.substring(str.length() - length, str.length() - 1);
        for (int i = 0; i < str.length() - length; i++) {
            if (min.compareTo(str.substring(i, i + length)) > 0) {
                min = str.substring(i, i + length);
            }
        }
        return min;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String str = in.next();
        int t = in.nextInt();

        System.out.println(lexMin(str, t));
        System.out.println(lexMax(str, t));
    }
}
