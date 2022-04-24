import java.util.*;
import java.io.*;

public class FLOW004 {
	public static void main (String[] args) {
		Scanner sc = new Scanner(System.in);
		PrintWriter p = new PrintWriter(System.out, true);
		int t = sc.nextInt();
		while(t!=0) {
			int n = sc.nextInt();
			int sum = n%10;
			while(n!=0) {
				if (n < 10)
					sum += n;
				n/=10;
			}
			p.println(sum);
			--t;
		}
	}
}