import java.io.*;
import java.util.*;

public class Solution {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int n = 4;
		Set<Integer> set = new HashSet<Integer> ();
		while (n-- != 0) {
			set.add(sc.nextInt());
		}
		System.out.println(4 - set.size());
	}
}
