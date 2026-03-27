import java.util.Scanner;

public class countingRooms {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        char[][] ch = new char[n][m];
        for(int i=0;i<n;i++){
            ch[i] = sc.next().toCharArray();
        }

        int val = find(ch);
        System.out.println(val);
    }

    public static int find(char[][] ch){
        int n = ch.length;
        int m = ch[0].length;
        
        int count = 0;
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                if(ch[i][j] == '.'){
                    dfs(ch,i,j);
                    count++;
                }
            }
        }
        return count;
    }

    public static void dfs(char[][]g,int i,int j){
        int r=g.length;
        int c=g[0].length;
        if(i<0||i>=r||j<0||j>=c||g[i][j]=='#')return;

        g[i][j]='#';

        dfs(g, i - 1, j);
        dfs(g, i + 1, j);
        dfs(g, i, j - 1);
        dfs(g, i, j + 1);

    }
}
