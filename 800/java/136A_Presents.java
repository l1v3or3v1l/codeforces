import java.io.*;
import java.util.*;

public class Solution {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt(), p[] = new int[n], s[] = new int[n], tmp = 0;
		for (int i = 1; i <= n; i++) {
			tmp = sc.nextInt();
			s[tmp - 1] = i;
		}
		for (int i = 0; i < s.length; i++) {
			System.out.print(s[i] + " ");
		}
	}
}
