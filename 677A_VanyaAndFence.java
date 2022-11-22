import java.io.*;
import java.util.*;

class Solution {
	public static void main (String args[]) {
		Scanner sc = new Scanner(System.in);
		int n, h, i, c = 0;
		n = sc.nextInt();
		h = sc.nextInt();
		while (n-- != 0) {
			i = sc.nextInt();
			if ((i - h) > 0) {
				c++;
			}
			c++;
		}
		System.out.println(c);
	}
}
