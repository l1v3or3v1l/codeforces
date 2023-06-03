import java.io.*;
import java.util.*;

public class Solution {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt(), g = 1, a = sc.nextInt(), b;
		while(--n != 0) {
			b = sc.nextInt();
			if (a != b) {
				g++;
			}
			a = b;
		}
		System.out.println(g);
	}
}
