import java.util.*;

class Cycle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int vertex = sc.nextInt();
        int n = sc.nextInt();

        ArrayList<Integer>[] graph = new ArrayList[vertex + 1];
        for (int i = 0; i <= vertex; i++) {
            graph[i] = new ArrayList<>();
        }

        Queue<int[]> q = new LinkedList<>();

        for (int i = 0; i < n; i++) {
            int u = sc.nextInt();
            int v = sc.nextInt();

            graph[u].add(v);

            if (u == 1) {
                q.offer(new int[]{v, 1}); // {currentNode, distance}
            }
        }

        boolean[] visited = new boolean[vertex + 1];

        while (!q.isEmpty()) {
            int[] cur = q.poll();

            int node = cur[0];
            int dist = cur[1];

            if (node == 1) {
                System.out.println(dist);
                return;
            }

            if (visited[node]) continue;
            visited[node] = true;

            for (int next : graph[node]) {
                q.offer(new int[]{next, dist + 1});
            }
        }

        System.out.println(-1);
    }
}