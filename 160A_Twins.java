import java.io.*;
import java.util.*;

class Solution {
	
	static int[] greatest(int a[]) {
		int[] great = { a[0], 0 };
		for (int i = 1; i < a.length; i++) {
			if (a[i] > great[0]) {
				great[0] = a[i];
				great[1] = i;
			}
		}
		return great;
	}

	static int sum(int a[]) {
		int sum = a[0];
		for (int i = 1; i < a.length; i++) {
			sum += a[i];
		}
		return sum;
	}

	public static void main (String args[]) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int a[] = new int[n];
		for (int i = 0; i < n; i++) {
			a[i] = sc.nextInt();
		}
		int taken = 0;
		int takenArray[] = new int[2];
		int totalTakenValue = 0;
		while (totalTakenValue <= sum(a)) {
			takenArray = greatest(a);
			totalTakenValue += takenArray[0];
			taken++;	
			a[takenArray[1]] = 0;
		}
		System.out.println(taken);
	}
}
