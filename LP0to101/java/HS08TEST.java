import java.io.*;
import java.util.*;

public class HS08TEST {
	public static void main(String[] args) throws Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		PrintStream p = new PrintStream(System.out, true);
		String[] inp = br.readLine().split(" ");
		float x = Float.parseFloat(inp[0]);
		float y = Float.parseFloat(inp[1]);

		if (x%5==0 && y>=x+0.50) {
			p.println(y-x-0.5);
		} else {
			p.println(y);
		}
	}
}