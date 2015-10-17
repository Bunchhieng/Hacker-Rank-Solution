package Java;

import java.math.BigInteger;
import java.util.Scanner;

/**
 * Created by Bunchhieng on 10/17/15.
 */
public class BigIntegerDemo {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        BigInteger n = in.nextBigInteger();
        BigInteger m = in.nextBigInteger();
        System.out.println(n.add(m));
        System.out.println(n.multiply(m));
    }
}
