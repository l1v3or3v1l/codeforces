import java.io.*;
import java.util.*;

public class Solution {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		double n = sc.nextDouble(), p = 0;
		for (int i = 0; i < n; i++) {
			p += sc.nextDouble();
		}
		System.out.println(p / n);
	}
}
