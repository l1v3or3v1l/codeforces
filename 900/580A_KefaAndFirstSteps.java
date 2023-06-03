import java.io.*;
import java.util.*;

class Solution {
	public static void main (String args[]) {
		Scanner sc = new Scanner (System.in);
		int n = sc.nextInt();
		int a[] = new int[n+1];
		for (int i = 0; i < n; i++) {
			a[i] = sc.nextInt();
		}
		int total = 0;
		int current = 0;
		a[n] = 0;
		for (int i = 0; i < n; i++) {
			if (a[i] <= a[i+1]) {
				current++;
			} else {
				if (current + 1 > total) {
					total = current + 1;	
				}
				current = 0;
			}
		}
		System.out.println(total);
	}
}
