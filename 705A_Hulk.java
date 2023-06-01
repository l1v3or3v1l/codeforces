import java.io.*;
import java.util.*;

public class Solution {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		String s = "I";
		for (int i = 1; i <= n; i++) {
			if (i != 1) {
				s += " that I";
			}
			if (i % 2 != 0) {
				s += " hate";
			} else {
				s += " love";
			}
		}
		s += " it";
		System.out.println(s);
	}
}
