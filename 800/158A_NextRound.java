import java.io.*;

class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n, k, count = 0;
        String in[] = br.readLine().split(" ");
        n = Integer.parseInt(in[0]);
        k = Integer.parseInt(in[1]);
        String[] i = br.readLine().split(" ");
        while (--n >= 0) {
            if (Integer.parseInt(i[n]) >= Integer.parseInt(i[k-1]) && Integer.parseInt(i[n]) > 0) {
                count++;
            }
        }
        System.out.println(count);
    }
}