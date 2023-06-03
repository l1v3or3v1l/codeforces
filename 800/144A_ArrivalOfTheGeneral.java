import java.io.*;
import java.util.*;

public class Solution {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt(), lo = sc.nextInt(), hi = lo, lo_i = 1, hi_i = 1, tmp = 0;
		for (int i = 1; i < n; i++) {
			tmp = sc.nextInt();
			if (tmp > hi) {
				hi = tmp;
				hi_i = i + 1;
			} else if (tmp <= lo) {
				lo = tmp;
				lo_i = i + 1;
			}
		}
		int c = n - lo_i + hi_i - 2;
		if (lo_i > hi_i) {
			c++;
		}
		System.out.println(c);
	}
}
