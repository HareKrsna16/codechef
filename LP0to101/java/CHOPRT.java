import java.io.*;
import java.util.*;

public class CHOPRT {
	public static void main (String[] args) {
		Scanner sc = new Scanner(System.in);
		PrintWriter p = new PrintWriter(System.out, true);
		int t, a, b;
		t = sc.nextInt();;
		while(t!=0) {
			a = sc.nextInt();
			b = sc.nextInt();
			if (a > b)
				p.println(">");
			else if (a < b)
				p.println("<");
			else
				p.println("=");
			--t;
		}
	}
}