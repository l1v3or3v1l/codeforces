import java.io.*;
import java.util.*;

class Solution {
	static boolean distinct(String n) {
		Set<String> st = new HashSet<String>();
		for (String t: n.split("")) {
			st.add(t);
		}
		if (st.size() == n.length()) {
			return true;
		}
		return false;
	}
	public static void main (String args[]) {
		Scanner sc = new Scanner (System.in);
		int y = sc.nextInt();
		for (int i = y+1; ; i++)
		if (distinct(Integer.toString(i)) == true) {
			System.out.println(i);
			break;
		}
	}
}
