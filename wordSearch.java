class Solution {
    public boolean exist(char[][] board, String word) {
        int n = board.length;
        int m = board[0].length;
        
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                boolean[][] vis = new boolean[n][m];
                if (dfs(board, word, 0, i, j, n, m, vis)) {
                    return true;
                }
            }
        }
        return false;
    }

    public boolean dfs(char[][] board,String word, int c,int i,int j,int n,int m,boolean[][] vis){
        if (c == word.length()) {
            return true;
        }
        if (i < 0 || i >= n || j < 0 || j >= m || vis[i][j] || board[i][j] != word.charAt(c)){
            return false;
        }
        vis[i][j] = true;
        int[] x = {0,0,-1,+1};
        int[] y = {-1,+1,0,0};
        for(int l=0;l<4;l++){
            int d1 = i+x[l];
            int d2 = j+y[l];
                if(dfs(board,word,c+1,d1,d2,n,m,vis)){
                    vis[i][j] = false;
                    return true;
                }  
            }
        vis[i][j] = false;
        return false;
    }
}