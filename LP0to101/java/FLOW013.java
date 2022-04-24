import java.io.*;
import java.util.*;

public class FLOW013 {
	public static void main(String[] args) throws Exception{
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		PrintWriter p = new PrintWriter(System.out, true);
		int t, a, b, c;
		t = Integer.parseInt(bf.readLine().split(" ")[0]);
		while(t!=0) {
			String[] in = bf.readLine().split(" ");
			a = Integer.parseInt(in[0]);
			b = Integer.parseInt(in[1]);
			c = Integer.parseInt(in[2]);
			if (a + b + c == 180)
				p.println("YES");
			else {
				p.println("NO");
			}
			--t;
		}
	}
}