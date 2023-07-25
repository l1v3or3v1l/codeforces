import java.io.*;
import java.util.*;

class Solution {
	public static void main (String args[]) {
		Scanner sc = new Scanner (System.in);
		long n = sc.nextLong();
		long k = sc.nextLong();
		long i = 2 * k - 1;
		if (i > n) {
			if (n % 2 == 0) {
				i = 2 * k - n;
			} else {
				i = 2 * k - n - 1;
			}
		}
		System.out.println(i);
	}
}
