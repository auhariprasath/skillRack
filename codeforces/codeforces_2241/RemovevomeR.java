package codeforces.codeforces_2241;

import java.util.Scanner;

public class RemovevomeR {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();

        while (t-- > 0) {
            int n = sc.nextInt();
            String s = sc.next();

            int blocks = 0;

            for (int i = 1; i < n; i++) {
                if (s.charAt(i) != s.charAt(i - 1)) {
                    blocks++;
                }
            }

            System.out.println(blocks == 1 ? 2 : 1);
        }
    }
}