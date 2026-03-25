import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

class largestIsland {
    int count;
    int k = 0;
    int[] dir = {1,0,-1,0,1};
    public int largestIsland(int[][] grid) {
        int m = grid.length;
        int n = grid[0].length;
        int[][] dup = new int[m][n];
        boolean[][] b = new boolean[m][n];
        List<int[]> arr = new ArrayList<>();
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                if(grid[i][j]==1){
                    k++;
                    count = 0;
                    dfs(grid,dup,i,j,m,n,k,b);
                    if(count!=0){
                        int[] dum = new int[3];
                        dum[0] = k;
                        dum[1] = count;

                        arr.add(dum);
                    }
                }
            }
        }
        Map<Integer, Integer> map = new HashMap<>();
        int max = 0;
        for (int[] a : arr) {
            map.put(a[0], a[1]);
            max = Math.max(max, a[1]);
        }
        boolean hasZero = false;
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (grid[i][j] == 0) {
                    hasZero = true;
                    Set<Integer> set = new HashSet<>();

                    for (int d = 0; d < 4; d++) {
                        int ni = i + dir[d];
                        int nj = j + dir[d + 1];
                        if (ni >= 0 && ni < m && nj >= 0 && nj < n) {
                            int id = dup[ni][nj];
                            if (id != 0) set.add(id);
                        }
                    }

                    int cur = 1;
                    for (int id : set) {
                        cur += map.get(id);
                    }
                    max = Math.max(max, cur);
                }
            }
        }

        if (!hasZero) return m * n;
        return max;
    }


    public void dfs(int[][] grid,int[][] dup,int i, int j,int m,int n,int k,boolean[][] b){
       if (i < 0 || j < 0 || i >= m || j >= n || b[i][j] || grid[i][j] == 0) {
    return;
}

        b[i][j] = true;
        count++;
        dup[i][j] = k;
        dfs(grid,dup,i+1,j,m,n,k,b);
        dfs(grid,dup,i-1,j,m,n,k,b);
        dfs(grid,dup,i,j+1,m,n,k,b);
        dfs(grid,dup,i,j-1,m,n,k,b);
    }
}