import java.io.*;
import java.util.*;

public class Solution {
	public static void main (String args[]) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt(), p, q, c = 0;
		while(n-- != 0) {
			p = sc.nextInt();
			q = sc.nextInt();
			if (q - p >= 2) {
				c++;
			}
		}
		System.out.println(c);
	}
}
