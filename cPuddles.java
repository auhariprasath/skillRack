import java.util.*;

public class cPuddles {

    static int[] one = {0, 0, 1, -1};
    static int[] sec = {1, -1, 0, 0};

    static boolean[][] visited;
    static char[][] grid;
    static boolean touchesBorder;

    public static int puddles(int n, int m) {

        int count = 0;

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {

                if (grid[i][j] == '.' && !visited[i][j]) {
                    touchesBorder = false;

                    dfs(i, j, n, m);

                    if (!touchesBorder) {
                        count++;
                    }
                }
            }
        }

        return count;
    }

    public static void dfs(int i, int j, int n, int m) {

        // out of bounds
        if (i < 0 || j < 0 || i >= n || j >= m) return;

        // already visited or black
        if (visited[i][j] || grid[i][j] == '#') return;

        visited[i][j] = true;

        // check border
        if (i == 0 || i == n - 1 || j == 0 || j == m - 1) {
            touchesBorder = true;
        }

        for (int l = 0; l < 4; l++) {
            int x = i + one[l];
            int y = j + sec[l];

            dfs(x, y, n, m);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int m = sc.nextInt();
        
        grid = new char[n][m];
        visited = new boolean[n][m];

        for (int i = 0; i < n; i++) {
            String s = sc.next();
            grid[i] = s.toCharArray();
        }

        System.out.println(puddles(n, m));
    }
}