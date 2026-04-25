import java.util.*;

public class OIEExcursion {
    static void solve(Scanner sc) {
        int N = sc.nextInt();
        int m = sc.nextInt();

        int[] arr = new int[N];
        int[] dp = new int[N];
        Arrays.fill(dp, 1);

        int max1 = 1;

        for (int i = 0; i < N; i++) {
            arr[i] = sc.nextInt();
        }

        for (int i = 1; i < N; i++) {
            if (arr[i] == arr[i - 1]) {
                dp[i] = dp[i - 1] + 1;
                max1 = Math.max(max1, dp[i]);
            }
        }

        if (max1 < m) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            solve(sc);
        }
    }
}