import java.io.*;
import java.util.*;

public class Solution {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt(), m = sc.nextInt();
		int sec = n * m;
		int p = 1;
		while (sec != 0) {
			sec -=  m + n - 1;
			n--;
			m--;
			p++;
		}
		if (p % 2 == 0) {
			System.out.print("Akshat");
		} else {
			System.out.print("Malvika");
		}
	}
}
