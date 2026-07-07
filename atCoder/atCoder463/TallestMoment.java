package atCoder.atCoder463;

import java.util.Scanner;

public class TallestMoment {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] h = new int[n];
        int[] l = new int[n];

        for (int i = 0; i < n; i++) {
            h[i] = sc.nextInt();
            l[i] = sc.nextInt();
        }

        int t = sc.nextInt(); 
        int[] time = new int[t];

        for (int i = 0; i < t; i++) {
            time[i] = sc.nextInt();
        }

        int[] rightMax = new int[n];
        rightMax[n - 1] = h[n - 1];

        for (int i = n - 2; i >= 0; i--) {
            rightMax[i] = Math.max(rightMax[i + 1], h[i]); 
        }

        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < t; i++) {
            int idx = upperBound(l, time[i]);
            sb.append(rightMax[idx]).append("\n");
        }

        System.out.print(sb);
    }

    static int upperBound(int[] arr, int x) {
        int l = 0;
        int r = arr.length;

        while (l < r) {
            int mid = (l + r) / 2;

            if (arr[mid] <= x) {
                l = mid + 1;
            } else {
                r = mid;
            }
        }

        return l;
    }
}