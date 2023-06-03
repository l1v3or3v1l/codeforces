import java.io.*;
import java.util.*;

class Solution {
	public static void main (String args[]) {
		Scanner sc = new Scanner (System.in);
		String n = sc.next();
		if (n.contains("1111111") == true || n.contains("0000000") == true) {
			System.out.println("YES");
		} else {
			System.out.println("NO");
		}
	}
}
