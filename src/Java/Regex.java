package Java;

import java.util.Scanner;

/**
 * Created by Bunchhieng on 10/17/15.
 */
public class Regex {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        while (in.hasNext()) {
            String IP = in.next();
            System.out.println(IP.matches(new myRegex().pattern));
        }
    }
}

class myRegex {
    public final String pattern = "(?:(?:25[0-5]|2[0-4][0-9]|[01]?[0-9][0-9]?)\\.){3}(?:25[0-5]|2[0-4][0-9]|[01]?[0-9][0-9]?)";
}
