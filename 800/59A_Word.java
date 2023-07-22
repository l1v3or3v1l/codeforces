import java.io.*;
import java.util.*;

class Solution {
	public static void main (String args[]) {
		Scanner sc = new Scanner(System.in);
		String s = sc.next();
		int c = 0;
		for (int i = 0; i < s.length(); i++) {
			if (s.charAt(i) >= 97) {
				c++;
			}
		}
		if (c >= s.length()-c) {
			System.out.print(s.toLowerCase());
		} else {
			System.out.print(s.toUpperCase());
		}
	}
}
