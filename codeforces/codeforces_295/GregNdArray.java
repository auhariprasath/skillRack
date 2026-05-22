import java.util.*;

public class GreyNdArray {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int m = sc.nextInt();
        int k = sc.nextInt();

        long[] arr = new long[n + 1];

        for (int i = 1; i <= n; i++) {
            arr[i] = sc.nextLong();
        }

        long[][] queries = new long[m][3];

        for (int i = 0; i < m; i++) {
            queries[i][0] = sc.nextLong();
            queries[i][1] = sc.nextLong();
            queries[i][2] = sc.nextLong();
        }

        int[][] operation = new int[k][2];

        for (int i = 0; i < k; i++) {
            operation[i][0] = sc.nextInt();
            operation[i][1] = sc.nextInt();
        }

        HashMap<Integer, Long> map = new HashMap<>();

        for (int i = 0; i < k; i++) {

            int left = operation[i][0] - 1;
            int right = operation[i][1] - 1;

            map.put(left, map.getOrDefault(left, 0L) + 1);

            map.put(right + 1,
                    map.getOrDefault(right + 1, 0L) - 1);
        }

        long[] op = new long[m];

        op[0] = map.getOrDefault(0, 0L);

        for (int i = 1; i < m; i++) {
            op[i] = op[i - 1] + map.getOrDefault(i, 0L);
        }

        long[] res = new long[n + 2];

        for (int i = 0; i < m; i++) {

            long l = queries[i][0];
            long r = queries[i][1];
            long d = queries[i][2];

            long total = d * op[i];

            res[(int) l] += total;
            res[(int) r + 1] -= total;
        }

        long sum = 0;

        for (int i = 1; i <= n; i++) {

            sum += res[i];

            arr[i] += sum;

            System.out.print(arr[i] + " ");
        }
    }
}