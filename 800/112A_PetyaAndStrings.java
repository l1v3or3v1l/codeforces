import java.util.*;

class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s1 = sc.next().toLowerCase();
        String s2 = sc.next().toLowerCase();
        if (s1.compareTo(s2) > 0) {
            System.out.println(1);
        } else if (s1.compareTo(s2) < 0) {
            System.out.println(-1);
        } else {
            System.out.println(0);
        }
        sc.close();
    }
}
