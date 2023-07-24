import java.io.*;
import java.util.*;

public class Solution {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt(), n, c;
		while (t-- != 0){
			n = sc.nextInt();
			c = 0;
			if (n % 2020 == 0 || n % 2021 == 0) {
				System.out.println("YES");
			} else {
				for (int i = 1; i <= 500; i++) {
					for (int j = 1; j <= 500; j++) {
						if (i*2020 + j*2021 == n) {
							System.out.println("YES");
							c = 1;
							break;
						} else if (i*2020 + j*2021 > n){
							break;
						}
					}
					if (c == 1) {
						break;
					}
				}
				if (c == 0) {
					System.out.println("NO");
				}
			}
		}
	}
}
