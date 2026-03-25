import java.util.*;
public class cPuddles{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int r=sc.nextInt();
        int c=sc.nextInt();
        char[][] m=new char[r][c];
        for(int i=0;i<r;i++)
        {
            m[i]=sc.next().toCharArray();
        }
        System.out.println(findOnlyBlack(m));

    }
    public static int findOnlyBlack(char[][]grid){
        int r=grid.length;
        int c=grid[0].length;
        int res=0;
        for(int i=0;i<r;i++){
            for(int j=0;j<c;j++){
                if(grid[i][j]=='.'){
                    if(dfs(grid,i,j)){
                        res++;
                    }
                }
            }
        }
        return res;
    }
    public static boolean dfs(char[][]g,int i,int j){
        int r=g.length;
        int c=g[0].length;
        if(i<0||i>=r||j<0||j>=c)return false;

        if(g[i][j]=='#')return true;

        g[i][j]='#';

        boolean up = dfs(g, i - 1, j);
        boolean down = dfs(g, i + 1, j);
        boolean left = dfs(g, i, j - 1);
        boolean right = dfs(g, i, j + 1);

        return up&&down&&left&&right;
    }
}