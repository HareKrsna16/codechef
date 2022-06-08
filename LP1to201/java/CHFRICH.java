import java.io.*;
import java.util.*;

public class CHFRICH {
    public static void main (String[] args) {
        Scanner sc = new Scanner (System.in);
        int t, a, b, x;
        t = sc.nextInt();
        while(t!=0) {
            a = sc.nextInt();
            b = sc.nextInt();
            x = sc.nextInt();
            System.out.println((b-a)/x);
            t--;
        }
    }
}