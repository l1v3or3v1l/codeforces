import java.io.*;
import java.util.*;

class Solution {
	public static void main (String args[]) {
		Scanner sc = new Scanner (System.in);
		int n = sc.nextInt(), temp, i, j;
		int a[] = new int[n];
		for (i = 0; i < n; i++) {
			a[i] = sc.nextInt();
		}
		for (i = 0; i < n - 1; i++) {
			for (j = 0; j < n - i - 1; j++) {
				if (a[j+1] < a[j]) {
					temp = a[j];
					a[j] = a[j + 1];
					a[j + 1] = temp;
				}
			}
		}
		for (i = 0; i < n; i++) {
			System.out.print(a[i] + " ");
		}
	}
}
