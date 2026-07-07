package codeforces.codeforces_2241;

import java.util.Scanner;

public class AnAlternativeWay {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();

        while (t-- > 0) {
            int n = sc.nextInt();

            long[] x = new long[n];

            long[] a = new long[n];
            long[] b = new long[n];

            for (int i = 0; i < n; i++) a[i] = sc.nextLong();
            for (int i = 0; i < n; i++) b[i] = sc.nextLong();

            for (int i = 0; i < n; i++) {
                x[i] = ((i & 1) == 0) ? (b[i] - a[i]) : (a[i] - b[i]);
            }

            boolean ok = true;

            if (x[0] < 0) ok = false;

            long cur = x[0];

            for (int i = 1; i < n && ok; i++) {
                long need = Math.max(0L, x[i]);

                if ((i & 1) == 1) {
                    if (cur < need) ok = false;
                } else {
                    long nxt = cur + x[i] - x[i - 1];
                    if (nxt < need) ok = false;
                    cur = nxt;
                }
            }

            System.out.println(ok ? "YES" : "NO");
        }

        sc.close();
    }
}