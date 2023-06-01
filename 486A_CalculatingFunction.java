import java.io.*;
import java.util.*;

public class Solution {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		long n = sc.nextLong(), sum = 0;
		if (n % 2 == 0) {
			sum = 0 - (n / 2) * (n / 2);
			sum += (n / 2) * ((n / 2) + 1);
		} else {
			sum = 0 - ((n + 1) / 2) * ((n + 1) / 2);
			sum += ((n - 1) / 2) * (((n - 1) / 2) + 1);
		}
		System.out.println(sum);
	}
}
