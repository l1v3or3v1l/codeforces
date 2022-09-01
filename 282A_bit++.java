import java.util.*;

class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n, x = 0;
        n = sc.nextInt();
        while (n-- != 0) {
            String s = sc.next();
            if (s.charAt(1) == '+') {
                x++;
            } else if (s.charAt(1) == '-') {
                x--;
            }
        }
        System.out.println(x);
        sc.close();
    }
}
