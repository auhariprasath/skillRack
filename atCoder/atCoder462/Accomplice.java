package atCoder.atCoder462;

import java.util.Scanner;

public class Accomplice {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int k = sc.nextInt();

        long[] in = new long[1000005];

        for (int i = 0; i < n; i++) {
            int a = sc.nextInt();
            int b = sc.nextInt();

            int r = b - k;

            if (r >= a) {
                in[a]++;
                in[r + 1]--;
            }
        }

        for (int i = 1; i <= 1000000; i++) {
            in[i] += in[i - 1];
        }

        long ans = 0;

        for (int t = 1; t <= 1000000; t++) {
            long inside = in[t];

            if (inside >= 2) {
                ans += inside * (inside - 1) / 2;
            }
        }

        System.out.println(ans);
    }
}