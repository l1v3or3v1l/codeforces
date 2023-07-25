import java.io.*;
import java.util.*;

public class Solution {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt(), c = 0;
		int h[] = new int[n], a[] = new int[n];
		for (int i = 0; i < n; i++) {
			h[i] = sc.nextInt();
			a[i] = sc.nextInt();
		}
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				if (i != j && h[i] == a[j]) {
					++c;
				}
			}
		}
		System.out.println(c);
	}
}
