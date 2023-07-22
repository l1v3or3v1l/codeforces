import java.io.*;
import java.util.*;

public class Solution {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		String s = sc.next();
		if (Integer.parseInt(s) < 0) {
			int lastDigitRemoved = Integer.parseInt(s.substring(0, s.length() - 1));
			int secondLastDigitRemoved = Integer.parseInt(s.substring(0, s.length() - 2) + s.charAt(s.length() - 1));
			if (lastDigitRemoved > secondLastDigitRemoved) {
				System.out.println(lastDigitRemoved);
			} else {
				System.out.println(secondLastDigitRemoved);
			}
		} else {
			System.out.println(s);
		}
	}
}
