package infosys;

import java.util.*;

public class Narray {
    static int MOD = 1_000_000;
    static List<Integer>[] tree;
    static int[] color;
    static int n;

    static int dfs(int node, Set<Integer> used) {
        if (used.contains(color[node])) return 0;

        used.add(color[node]);
        int max = 1;

        for (int child : tree[node]) {
            int val = 1 + dfs(child, used);
            max = Math.max(max, val);
        }

        used.remove(color[node]); 
        return max;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        n = sc.nextInt();

        int[] node = new int[n + 1];
        color = new int[n + 1];

        for (int i = 1; i <= n; i++) node[i] = sc.nextInt();
        for (int i = 1; i <= n; i++) color[i] = sc.nextInt();

        tree = new ArrayList[n + 1];
        for (int i = 0; i <= n; i++) tree[i] = new ArrayList<>();

        for (int i = 1; i <= n; i++) {
            if (node[i] != 0) {
                tree[node[i]].add(i);
            }
        }

        int q = sc.nextInt();
        long ans = 0;

        for (int i = 0; i < q; i++) {
            int s = sc.nextInt();
            ans = (ans + dfs(s, new HashSet<>())) % MOD;
        }

        System.out.println(ans);
    }
}