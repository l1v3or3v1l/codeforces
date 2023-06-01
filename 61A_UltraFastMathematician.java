import java.io.*;
import java.util.*;

public class Solution {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		String n = sc.nextLine(), m = sc.nextLine(), o = "";		
		for (int i = 0; i < n.length(); i++) {
			if (n.charAt(i) != m.charAt(i)) {
				o += "1";
			} else {
				o += "0";
			}
		}
		System.out.println(o);
	}
}
