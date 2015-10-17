import java.util.Scanner;

/**
 * Created by OWNER on 10/16/2015.
 */
public class Loop {
    public static void main(String[] args) {
        int a, b, n, sum = 0;

        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        for(int i = 0; i < t; i++) {
            a = in.nextInt();
            b = in.nextInt();
            n = in.nextInt();
            for(int j = 0; j < n; j++) {
                sum += Math.pow(2, j)*b;
                System.out.printf("%d ", sum + a);
            }
            System.out.println();
            sum = 0;
        }
    }
}
