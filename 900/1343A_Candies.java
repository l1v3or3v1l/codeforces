import java.io.*;
import java.util.*;

public class Solution {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		long n, sum, x;
		while (t-- != 0) {
			n = sc.nextLong();
			for (long k = 2; k <= n;k++) {
				x = n / (long)(Math.pow(2, k) - 1);
				sum = x * (long)(Math.pow(2, k) - 1);
				if ( sum == n) {
					System.out.println(x);
					break;
				}
			}
		}
	}
}