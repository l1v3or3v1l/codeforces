import java.io.*;
import java.util.*;

public class Solution {

	static void sort(int[] arr) {  
    	int n = arr.length;  
        int temp = 0;  
        for(int i=0; i < n; i++){  
        	for(int j=1; j < (n-i); j++){  
             	if(arr[j-1] > arr[j]){   
					temp = arr[j-1];  
                    arr[j-1] = arr[j];  
                    arr[j] = temp;  
                }        
            }	  
        } 
	}

	static int min(int a, int b) {
		if (a < b) {
			return a;
		} else {
			return b;
		}
	}

	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt(), m = sc.nextInt();
		int f[] = new int[m];
		for (int i = 0; i < m; i++){
			f[i] = sc.nextInt();
		}
		sort(f);
		int best = (int)Double.POSITIVE_INFINITY;
		for (int k = 0; k < m - n + 1; k++) {
			best = min(best, f[k+n-1] - f[k]);
		}
		System.out.println(best);
	}
}
