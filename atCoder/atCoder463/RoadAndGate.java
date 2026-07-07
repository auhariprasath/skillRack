import java.util.*;

public class Main {

    static class Edge {
        int to;
        long wt;

        Edge(int to, long wt) {
            this.to = to;
            this.wt = wt;
        }
    }

    static class Pair implements Comparable<Pair> {
        int node;
        long dist;

        Pair(int node, long dist) {
            this.node = node;
            this.dist = dist;
        }

        public int compareTo(Pair other) {
            return Long.compare(this.dist, other.dist);
        }
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int M = sc.nextInt();
        long Y = sc.nextLong();

        int A = N + 1;
        int B = N + 2;

        ArrayList<Edge>[] graph = new ArrayList[N + 3];

        for (int i = 0; i < N + 3; i++) {
            graph[i] = new ArrayList<>();
        }

        
        for (int i = 0; i < M; i++) {
            int u = sc.nextInt();
            int v = sc.nextInt();
            long t = sc.nextLong();

            graph[u].add(new Edge(v, t));
            graph[v].add(new Edge(u, t));
        }

        long[] X = new long[N + 1];

        for (int i = 1; i <= N; i++) {
            X[i] = sc.nextLong();
        }

        for (int i = 1; i <= N; i++) {
            graph[i].add(new Edge(A, X[i]));
            graph[B].add(new Edge(i, X[i]));
        }

        graph[A].add(new Edge(B, Y));

        long INF = Long.MAX_VALUE;

        long[] dist = new long[N + 3];
        Arrays.fill(dist, INF);

        PriorityQueue<Pair> pq = new PriorityQueue<>();

        dist[1] = 0;
        pq.add(new Pair(1, 0));

        while (!pq.isEmpty()) {

            Pair cur = pq.poll();

            if (cur.dist != dist[cur.node])
                continue;

            for (Edge e : graph[cur.node]) {

                long nd = cur.dist + e.wt;

                if (nd < dist[e.to]) {
                    dist[e.to] = nd;
                    pq.add(new Pair(e.to, nd));
                }
            }
        }

        StringBuilder ans = new StringBuilder();

        for (int i = 2; i <= N; i++) {
            ans.append(dist[i]).append(" ");
        }

        System.out.println(ans);
    }
}