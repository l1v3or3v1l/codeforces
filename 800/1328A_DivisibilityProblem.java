import java.io.*;
import java.util.*;

public class Solution {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		double a, b;
		while (t-- != 0) {
			a = sc.nextDouble();
			b = sc.nextDouble();
			System.out.println((int)(Math.ceil(a / b) * b - a));
		}
	}
}