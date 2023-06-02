import java.io.*;
import java.util.*;

public class Solution {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		String s = sc.nextLine();
		String s1[] = s.substring(1, s.length()-1).split(", ");
		Set <Character> set = new HashSet<Character> ();
		for (int i = 0; i < s1.length; i++) {
			if (s1[i].length() > 0)
				set.add(s1[i].charAt(0));
		}
		System.out.println(set.size());
	}
}
