import java.io.*;
import java.util.*;

public class Solution {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int k, l, m, n, d, c = 0;
		k = sc.nextInt();
		l = sc.nextInt();
		m = sc.nextInt();
		n = sc.nextInt();
		d = sc.nextInt();
		for (int i = 1; i <= d; i++) {
			if (i % k == 0 || i % l == 0 || i % m == 0 || i % n == 0) {
				c++;
			}
		}
		System.out.println(c);
	}
}
