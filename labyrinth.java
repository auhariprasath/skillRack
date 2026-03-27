import java.util.*;

public class labyrinth{

    public static int[] dir = {1,0,-1,0,1};
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        char[][] ch = new char[n][m];
        for(int i=0;i<n;i++){
            ch[i] = sc.next().toCharArray();
        }
        //int val = find(ch);
        find(ch);

    }
    public static void find(char[][] ch){
        int n = ch.length;
        int m = ch[0].length;
        
        int count = 0;
        Queue<Pair> q = new LinkedList<>();
        int[][] dirg = new int[n][m];
        for(int d[]: dirg){
            Arrays.fill(d,-1);
        }
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                if(ch[i][j] == 'A'){
                    q.add(new Pair(i,j));
                    dirg[i][j] = 5;
                    break;
                }
            }
            if(q.size()==1)break;
        }
        boolean flag = false;
        int f = -1;
        int s = -1;
        String dirs = "DLUR";
        while(!q.isEmpty() && !flag){
            Pair pair = q.poll();
            int first = pair.a;
            int second = pair.b;

            for(int i=0;i<4;i++){
                int x1 = first+dir[i];
                int x2 = second+dir[i+1];
                if(x1>0 && x2>0 && x1<=n && x2<=m && ch[x1][x2]!='#' && dirg[x1][x2]==-1){
                    if(ch[x1][x2]=='B'){
                        flag = true;
                        f = x1;
                        s = x2;
                        dirg[x1][x2] = i;
                        break;
                    }
                    q.offer(new Pair(x1,x2));
                    dirg[x1][x2] = i;
                }
            }
        }
        int rone = f;
        int rtwo = s;
        String ans = "";
        while(ch[rone][rtwo]!='A'){
            int dfind = dirg[f][s];
            // ans+=dirs.charAt(dfind);
            rone+=dir[dfind];
            rtwo+=dir[dfind];
            // System.out.println(rone+" "+rtwo);
        }

        if(flag){
            System.out.println("yes");
        }

        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                System.out.print(dirg[i][j]+" ");
            }
            System.out.println();
        }
        
    }
}
class Pair{
    int a;
    int b;
    Pair(int a,int b){
        this.a = a;
        this.b = b;
    }
}