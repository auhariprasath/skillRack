package codeforces_2194;

import java.util.*;

public class Offshore {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int q = sc.nextInt();

        while (q-- > 0) {
            int a = sc.nextInt();
            long b = sc.nextLong();
            long c = sc.nextLong();

            long[] arr = new long[a];

            for (int i = 0; i < a; i++) {
                arr[i] = sc.nextLong();
            }

            long[] nums = new long[a];
            long tot = 0;

            for (int i = 0; i < a; i++) {
                nums[i] = (arr[i] / b) * c;
                tot += nums[i];
            }

            long max = Long.MIN_VALUE;

            for (int i = 0; i < a; i++) {
                long v = tot - nums[i] + arr[i];
                max = Math.max(max, v);
            }

            System.out.println(max);
        }

        sc.close();
    }
}