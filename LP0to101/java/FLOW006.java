import java.io.*;
import java.util.*;

public class FLOW006 {
	public static void main (String[] args) {
		Scanner sc = new Scanner(System.in);
		PrintWriter p = new PrintWriter(System.out, true);
		int t, n, sum;
		t = sc.nextInt();
		while(t!=0) {
			n = sc.nextInt();
			sum=0;
			while(n!=0) {
				sum += n%10;
				n/=10;
			}
			p.println(sum);
			--t;
		}
	}
}