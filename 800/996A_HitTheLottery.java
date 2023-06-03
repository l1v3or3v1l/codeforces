import java.io.*;
import java.util.*;

public class Solution {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt(), nb = 0;
		
		while (n != 0) {
			if (n >= 100) {
				nb += n / 100;
				n %= 100;
			} else if (n >= 20) {
				nb += n / 20;
				n %= 20;
			} else if (n >= 10) {
				nb += n / 10;
				n %= 10;
			} else if (n >= 5){
				nb += n / 5;
				n %= 5;
			} else {
				nb += n;
				n %= 1;
			}
		}
		System.out.println(nb);
	}
}
