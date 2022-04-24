import java.io.*;
import java.util.*;

public class FLOW010 {
	public static void main (String[] args) throws Exception {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		PrintWriter p = new PrintWriter(System.out, true);
		int t = Integer.parseInt(bf.readLine().split(" ")[0]);
		while(t!=0) {
			char c = bf.readLine().toLowerCase().charAt(0);
			switch (c) {
				case 'b':
					p.println("BattleShip");
					break;
				case 'c':
					p.println("Cruiser");
					break;
				case 'd':
					p.println("Destroyer");
					break;
				case 'f':
					p.println("Frigate");
					break;
			}
			--t;
		}
	}
}