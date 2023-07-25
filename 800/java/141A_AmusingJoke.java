import java.io.*;
import java.util.*;

public class Solution {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		String gr = sc.next() + sc.next();
		String p = sc.next();
		int f = 0, c = 0;
		HashMap<Character,Integer> map = new HashMap<Character,Integer>();
		map.put('A', 0);
		map.put('B', 0);
		map.put('C', 0);
		map.put('D', 0);
		map.put('E', 0);
		map.put('F', 0);
		map.put('G', 0);
		map.put('H', 0);
		map.put('I', 0);
		map.put('J', 0);
		map.put('K', 0);
		map.put('L', 0);
		map.put('M', 0);
		map.put('N', 0);
		map.put('O', 0);
		map.put('P', 0);
		map.put('Q', 0);
		map.put('R', 0);
		map.put('S', 0);
		map.put('T', 0);
		map.put('U', 0);
		map.put('V', 0);
		map.put('W', 0);
		map.put('X', 0);
		map.put('Y', 0);
		map.put('Z', 0);
		for (int i = 0; i < gr.length(); i++) {
			c = map.get(gr.charAt(i));
			map.replace(gr.charAt(i), ++c);
		}
		for(int i = 0; i < p.length(); i++){
			c = map.get(p.charAt(i));
			map.replace(p.charAt(i), --c);
		}
		for (Character name: map.keySet()) {
			if (map.get(name) != 0) {
				f = 1;
				break;
			}
		}
		if (f == 0) {
			System.out.print("YES");
		} else {
			System.out.print("NO");
		}
	}
}
