import java.util.*;

public class MaxSum{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int T = sc.nextInt();

        while (T-- > 0) {
            int N = sc.nextInt();
            int K = sc.nextInt();

            int[] A = new int[N];
            int[] B = new int[N];

            for (int i = 0; i < N; i++) A[i] = sc.nextInt();
            for (int i = 0; i < N; i++) B[i] = sc.nextInt();

            long[][] arr = new long[N][2];

            for (int i = 0; i < N; i++) {
                arr[i][0] = A[i];
                arr[i][1] = B[i];
            }

            Arrays.sort(arr, (x, y) -> Long.compare(x[0], y[0]));

            PriorityQueue<Long> pq = new PriorityQueue<>(Collections.reverseOrder());

            long sum = 0;
            long ans = Long.MAX_VALUE;

            for (int i = 0; i < N; i++) {
                long a = arr[i][0];
                long b = arr[i][1];

                if (K == 1) {
                    ans = Math.min(ans, a * b);
                } else if (pq.size() == K - 1) {
                    ans = Math.min(ans, a * (sum + b));
                }
                pq.offer(b);
                sum += b;
                if (pq.size() > K - 1) {
                    sum -= pq.poll();
                }
            }
            System.out.println(ans);
        }
    }
}