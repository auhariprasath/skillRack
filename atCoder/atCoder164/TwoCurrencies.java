import java.util.*;

public class Main {

    static class City {

        int des, sil, ti;

        City(int des, int sil, int ti) {
            this.des = des;
            this.sil = sil;
            this.ti = ti;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        long s = sc.nextLong();

        HashMap<Integer, ArrayList<City>> g = new HashMap<>();
        for (int i = 1; i <= n; i++) {
            g.put(i, new ArrayList<>());
        }

        for (int i = 1; i <= m; i++) {
            int src = sc.nextInt();
            int des = sc.nextInt();
            int sil = sc.nextInt();
            int ti = sc.nextInt();
            g.get(src).add(new City(des, sil, ti));
            g.get(des).add(new City(src, sil, ti));
        }

        int coins[] = new int[n + 1];
        int wt[] = new int[n + 1];
        for (int i = 1; i <= n; i++) {
            coins[i] = sc.nextInt();
            wt[i] = sc.nextInt();
        }

        int startSilver = (int) Math.min(s, 2500);

        long[][] dist = new long[n + 1][2500 + 1];
        for (int i = 0; i <= n; i++) {
            Arrays.fill(dist[i], Long.MAX_VALUE);
        }

        PriorityQueue<long[]> pq = new PriorityQueue<>((a, b) -> Long.compare(a[2], b[2]));

        dist[1][startSilver] = 0;
        pq.add(new long[]{1, startSilver, 0});

        while (!pq.isEmpty()) {
            long[] curr = pq.poll();
            int currCity = (int) curr[0];
            int currSilver = (int) curr[1];
            long currTime = curr[2];

            if (currTime > dist[currCity][currSilver]) {
                continue;
            }

            int nextSilver = Math.min(2500, currSilver + coins[currCity]);
            long nextTime = currTime + wt[currCity];
            if (nextTime < dist[currCity][nextSilver]) {
                dist[currCity][nextSilver] = nextTime;
                pq.add(new long[]{currCity, nextSilver, nextTime});
            }

            for (City edge : g.get(currCity)) {
                if (currSilver >= edge.sil) {
                    int remSilver = currSilver - edge.sil;
                    long travelTime = currTime + edge.ti;
                    if (travelTime < dist[edge.des][remSilver]) {
                        dist[edge.des][remSilver] = travelTime;
                        pq.add(new long[]{edge.des, remSilver, travelTime});
                    }
                }
            }
        }

        for (int t = 2; t <= n; t++) {
            long ans = Long.MAX_VALUE;
            for (int si = 0; si <= 2500; si++) {
                ans = Math.min(ans, dist[t][si]);
            }
            System.out.println(ans);
        }
        sc.close();
    }
}
