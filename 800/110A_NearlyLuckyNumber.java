import java.io.*;
import java.util.*;

class Solution {
	
	static int getCount (String s) {
		int count = 0;
		for (int i = 0; i < s.length(); i++) {
			if (s.charAt(i) == '4' || s.charAt(i) == '7') {
				count++;	
			}
		}
		return count;
	}
	
	public static void main (String args[]) {
		Scanner sc = new Scanner(System.in);
		String n = sc.next();
		int count = getCount(n);
		String c = Integer.toString(count);
		count = getCount(c);
		if (count == c.length()) {
			System.out.println("YES");
		} else {
			System.out.println("NO");
		}
	}	
}
