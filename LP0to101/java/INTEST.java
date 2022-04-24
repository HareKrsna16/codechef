import java.io.*;
import java.util.*;

public class INTEST {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		PrintWriter p = new PrintWriter(System.out, true);
		long n , k, t, out=0;
		n = sc.nextLong();
		k = sc.nextLong();
		while(n!=0) {
			t = sc.nextLong();
			if (t % k == 0)
				++out;
			--n;
		}
		p.println(out);
	}
}