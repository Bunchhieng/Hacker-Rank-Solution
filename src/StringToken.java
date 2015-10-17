import java.util.Scanner;

/**
 * Created by Bunchhieng on 10/17/15.
 */
public class StringToken {
    public static void main(String[] args) {
        int count = 0;
        Scanner scan = new Scanner(System.in);
        String s=scan.nextLine();
        if (s.trim().isEmpty()) {
            System.out.println(0);
        } else {
            String parts[] = s.trim().split("[!,?._'@\\s]+");
            System.out.println(parts.length);
            for(int i = 0; i < parts.length; i++) {
                System.out.println(parts[i]);
            }
        }
    }
}
