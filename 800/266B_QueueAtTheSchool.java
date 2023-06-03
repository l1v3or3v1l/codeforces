import java.io.*;
import java.util.*;

class Solution {
	public static void main (String args[]) {
		Scanner sc = new Scanner (System.in);
		int n = sc.nextInt();
		int t = sc.nextInt();
		char a[] = sc.next().toCharArray();
		while (t-- > 0) {
			for (int i = 0; i < n - 1; i++) {
				if (a[i] == 'B' && a[i+1] == 'G') {
					a[i] = 'G';
					a[i+1] = 'B';
					i++;
				}
			}
		}
		System.out.println(String.valueOf(a));
	}
}
