import java.util.Scanner;

/**
 * Created by Bunchhieng on 10/17/15.
 */
public class Factorial {
        private static int fac(int num) {
            if (num == 0 || num == 1) {
                return 1;
            }
            return fac(num - 1) * num;
        }

        public static void main(String[] args) {
            Scanner in = new Scanner(System.in);
            int num = in.nextInt();
            if (num >= 0) {
                System.out.println(fac(num));
            }
        }
}
