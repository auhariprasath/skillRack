import java.util.*;

class XmasOrHysteria {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int q = sc.nextInt();
        StringBuilder sb = new StringBuilder();

        while (q-- > 0) {
            int n = sc.nextInt();
            int m = sc.nextInt();

            int[][] arr = new int[n][2];
            for (int i = 0; i < n; i++) {
                arr[i][0] = sc.nextInt();
                arr[i][1] = i + 1;
            }

            Arrays.sort(arr, (a, b) -> a[0] - b[0]);

            int maxNode = arr[n - 1][1];

            if (m == n || m > n - m) {
                sb.append(-1).append('\n');
                continue;
            }

            int unpairedNonSurvivors = n - 2 * m;
            long sum = 0;
            for (int i = 0; i < unpairedNonSurvivors; i++) {
                sum += arr[i][0];
            }

            if (sum >= arr[n - 1][0]) {
                sb.append(-1).append('\n');
                continue;
            }

            List<int[]> attacks = new ArrayList<>();

            for (int i = 0; i < m; i++) {
                attacks.add(new int[]{arr[n - m + i][1], arr[n - m - 1 - i][1]});
            }

            for (int i = 0; i < unpairedNonSurvivors; i++) {
                attacks.add(new int[]{arr[i][1], maxNode});
            }

            sb.append(attacks.size()).append('\n');
            for (int[] atk : attacks) {
                sb.append(atk[0]).append(' ').append(atk[1]).append('\n');
            }
        }

        System.out.print(sb);
    }
}