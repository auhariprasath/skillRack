import java.util.*;

public class ruggedTerrain {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        PriorityQueue<Integer> pq = new PriorityQueue<>();

        int[] need = new int[n];
        need[0] = arr[0];

        for (int i = 1; i < n; i++) {
            need[i] = need[i - 1] - 1;
        }

        for (int i = 0; i < n; i++) {
            int dig = arr[i] - need[i];
            if (dig > 0) {
                pq.add(dig);
            }
        }

        int alreadyDug = 0;
        int days = 0;

        while (!pq.isEmpty()) {
            int x = pq.poll();

            if (alreadyDug < x) {
                days++;
                alreadyDug = (2 * days) - 1;
            }
        }

        System.out.println(days);
    }
}
