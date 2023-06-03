import java.io.*;
import java.util.*;

class Solution {
	public static void main (String args[]) {
		Scanner sc = new Scanner (System.in);
		String s = sc.next();
		String t = (new StringBuffer(sc.next()).reverse()).toString();
		if (s.equals(t)) {
			System.out.println("YES");
		} else {
			System.out.println("NO");
		}
	}
}
