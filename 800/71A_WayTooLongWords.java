import java.util.*;

class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        while (n-- != 0) {
            String str = sc.next();
            if (str.length() > 10) {
                String newstr = str.charAt(0) + Integer.toString(str.length() - 2) + str.charAt(str.length() - 1);
                str = newstr;
            } 
            System.out.println(str);
        }
        sc.close();
    }
}