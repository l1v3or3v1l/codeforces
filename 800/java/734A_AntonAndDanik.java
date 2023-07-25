import java.io.*;
import java.util.*;

class Solution {
	public static void main (String args[]) {
		Scanner sc = new Scanner (System.in);
		int n = sc.nextInt(), anton = 0, danik = 0;
		String s = sc.next();
		for (int i = 0; i < s.length(); i++) {
			if (s.charAt(i) == 'A') {
				anton++;
			}
			if (s.charAt(i) == 'D') {
				danik++;
			}
		}
		if (anton > danik) {
			System.out.println("Anton");
		} else if (danik > anton) {
			System.out.println("Danik");
		} else {
			System.out.println("Friendship");
		}
	}
}
