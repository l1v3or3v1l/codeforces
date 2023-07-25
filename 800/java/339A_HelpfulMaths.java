import java.util.*;

class Solution {

    static String get(int times, String that) {
        String s = "";
        for (int i = 0; i < times; i++) {
           s += that + "+";
        }
        return s;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int one = 0, two = 0, three = 0;
        String[] s = sc.next().split("\\+");
        sc.close();
        for (int i = 0; i < s.length; i++) {
            switch(s[i]) {
                case "1":
                    one++;
                    break;
                case "2":
                    two++;
                    break;
                case "3":
                    three++;
                    break;
            }
        }

        String out = "";
        out += get(one, "1");
        out += get(two, "2");
        out += get(three, "3");

        System.out.println(out.substring(0, out.length() - 1));
    }
}
