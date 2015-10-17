import java.util.Scanner;

/**
 * Created by Bunchhieng on 10/16/15.
 */
public class EndOfFile {
    public static void main(String[] args) {
        int i = 1;
        Scanner in = new Scanner(System.in);

        while (in.hasNext()) {
            System.out.println(i + " " + in.nextLine());
            i++;
        }
    }
}
