import java.io.*;
import java.util.*;

class Solution {
	public static void main (String args[]) {
	Scanner sc = new Scanner (System.in);
	String s = sc.next();
	for (int i = 0; i < s.length(); i++) {
		if (s.charAt(i) == 'H' || s.charAt(i) == 'Q' || s.charAt(i) == '9') {
			System.out.println("YES");
			return;
		}
	}
	System.out.println("NO");
	}
}
