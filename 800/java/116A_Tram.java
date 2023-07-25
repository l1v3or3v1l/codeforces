import java.io.*;
import java.util.*;

class Solution {
	public static void main (String args[]) {
		Scanner sc = new Scanner (System.in);
		int n = sc.nextInt();
		int minCapacity = 0, exit, entry, currentCapacity = 0;
		while (n--  != 0) {
			exit = sc.nextInt();
			entry = sc.nextInt();
			currentCapacity += entry - exit;
			if (currentCapacity > minCapacity) {
				minCapacity = currentCapacity;
			}
		}
		System.out.println(minCapacity);
	}
}
