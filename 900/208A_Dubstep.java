import java.io.*;
import java.util.*;

class Solution {
	public static void main (String args[]) {
		Scanner sc = new Scanner (System.in);
		String s[] = sc.next().split("WUB");
		for (int i = 0; i < s.length; i++) {
			if (s[i] != "") {
				System.out.print(s[i] + " ");
			}	
		}
	}
}
