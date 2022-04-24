import java.io.*;
import java.util.*;

public class FLOW007 {
	public static void main (String[] args) {
		Scanner sc = new Scanner(System.in);
		PrintWriter p = new PrintWriter(System.out, true);
		int t, n, rev;
		t = sc.nextInt();
		while(t!=0) {
			n = sc.nextInt();
			rev=0;
			while(n!=0) {
				rev = rev*10 + n%10;
				n/=10;
			}
			p.println(rev);
			--t;
		}
	}
} 