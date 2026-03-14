import java.util.Scanner;

public class allInOneGun {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while (t-- > 0) {

            int n = sc.nextInt();
            long h = sc.nextLong();
            long k = sc.nextLong();

            int[] arr = new int[n];

            long sum = 0;

            for (int i = 0; i < n; i++) {
                arr[i] = sc.nextInt();
                sum += arr[i];
            }

            long rr = (h - 1) / sum;
            long ans = rr * (n + k);

            h -= rr * sum;

            int[] rb = new int[n];
            rb[n - 1] = arr[n - 1];

            for (int i = n - 2; i >= 0; i--) {
                rb[i] = Math.max(rb[i + 1], arr[i]);
            }

            long prefix = 0;
            int lmin = Integer.MAX_VALUE;

            for (int i = 0; i < n; i++) {

                prefix += arr[i];
                lmin = Math.min(lmin, arr[i]);

                if (prefix >= h || prefix - lmin + rb[i] >= h) {
                    ans += i + 1;
                    break;
                }
            }

            System.out.println(ans);
        }
    }
}