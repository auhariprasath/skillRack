import java.util.*;

class CStrawBerry {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int m = sc.nextInt();

        int[] Aarr = new int[m];
        int[] Barr = new int[m];

        for (int i = 0; i < m; i++) {
            Aarr[i] = sc.nextInt();
            Barr[i] = sc.nextInt();
        }

        Queue<Integer> q = new LinkedList<>();
        boolean[] visited = new boolean[n + 1];

        q.add(1);
        visited[1] = true;

        int count = 1;

        while (!q.isEmpty()) {
            int curr = q.poll();

            for (int i = 0; i < m; i++) {
                if (curr == Aarr[i]) {
                    if (!visited[Barr[i]]) {
                        visited[Barr[i]] = true;
                        q.add(Barr[i]);
                        count++;
                    }
                }
            }
        }

        System.out.println(count);
    }
}