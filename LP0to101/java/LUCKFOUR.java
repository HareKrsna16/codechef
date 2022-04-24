import java.io.*;
import java.util.*;

public class LUCKFOUR {
	public static void main (String[] args) {
		Scanner sc = new Scanner(System.in);
		PrintWriter p = new PrintWriter(System.out, true);
		long t, n, out;
		t = sc.nextLong();
		while(t!=0) {
			n = sc.nextLong();
			out = 0;
			while(n!=0) {
				if (n%10 == 4)
					++out;
				n/=10;
			}
			p.println(out);
			--t;
		}
	}
}