import java.io.*;
import java.util.*;

public class Solution {

	static Scanner sc = new Scanner(System.in);
	static Set<Integer> set = new HashSet<Integer> ();

	static void input(int i) {
		while(i-- != 0) {
			set.add(sc.nextInt());
		}
	}

	public static void main(String args[]) {
		int n = sc.nextInt();
		input(sc.nextInt());
		input(sc.nextInt());

		if (set.size() == n) {
			System.out.println("I become the guy.");
		} else {
			System.out.println("Oh, my keyboard!");
		}
		
	}
}
