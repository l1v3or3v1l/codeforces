import java.io.*;
import java.util.*;

public class Solution {

	static String oddDivisor(long n) {
		int c = 0;
		while (n != 0) {
			if (n % 2 == 1) {
				c++;
				if (c == 2) {
					return "YES";
				}
			}
			n /= 2;
		}
		return "NO";
	}

	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		long n = 0;
		while(t-- != 0) {
			n = sc.nextLong();
			System.out.println(oddDivisor(n));
		}
	}
}
