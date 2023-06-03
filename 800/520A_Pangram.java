import java.io.*;
import java.util.*;

public class Solution {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt(), sum = 0;
		String s = (sc.next()).toUpperCase();;
		Set<Character> set = new HashSet<>();
        for (char ch : s.toCharArray()) {
            set.add(ch);
        }
		if (set.size() == 26) {
			System.out.println("YES");
		} else {
			System.out.println("NO");
		}
	}
}
