import java.io.*;
import java.util.*;

public class VDATES {
    public static void main (String args[]) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- > 0) {
            long d, l, r;
            d = sc.nextLong();
            l = sc.nextLong();
            r = sc.nextLong();
            if (d < l)
                System.out.println("Too Early");
            else if (d > r)
                System.out.println("Too Late");
            else
                System.out.println("Take second dose now");
        }
    }
}