package Java;

import java.math.BigDecimal;
import java.util.*;

/**
 * Created by Bunchhieng on 10/17/15.
 */
public class BigDecimalDemo {
    public static void main(String []argh)
    {
        //Input
        Scanner sc= new Scanner(System.in);
        int n=sc.nextInt();
        String []s=new String[n+2];
        for(int i=0;i<n;i++)
        {
            s[i]=sc.next();
        }

        //Write your code here
        List<BigDecimal> dec = new ArrayList<>();
        Arrays.asList(s);

        //Output
        for(int i=0;i<n;i++)
        {
            System.out.println(s[i]);
        }

    }
}
