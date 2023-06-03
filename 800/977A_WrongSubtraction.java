import java.io.*;
import java.util.*;

class Solution {
	public static void main (String args[]) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int i = sc.nextInt();
		while(i-- != 0) {
			if (n % 10 == 0) {
				n /= 10;
			}
			else {
				--n;
			}
		}	
		System.out.println(n);
	}
}
