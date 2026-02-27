class Solution {
    int[][] directions = {{0,1},{0,-1},{1,0},{-1,0}};
    public int longestIncreasingPath(int[][] matrix) {
        int n = matrix.length;
        int m = matrix[0].length;
        int[][] path = new int[n][m];
        int ans = 1;
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                if(path[i][j]==0){
                    path[i][j] = dfs(matrix,i,j,n,m,path);
                    ans =Math.max(ans,path[i][j]);
                }
                
            }
        }
        return ans;
    }

    public int dfs(int[][] matrix,int i,int j,int n,int m,int[][] path){
        if(path[i][j]!=0){
            return path[i][j];
        }

        int max = 1;
        for(int[] dir : directions){
            int x = i + dir[0];
            int y = j + dir[1];

            if(x >= 0 && x < n && y >= 0 && y < m 
               && matrix[x][y] > matrix[i][j]){

                int len = 1 + dfs(matrix, x, y,n,m, path);
                max = Math.max(max, len);
            }
        }
        path[i][j] = max;
        return max;
    }
}
