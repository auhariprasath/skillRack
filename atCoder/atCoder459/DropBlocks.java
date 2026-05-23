package atCoder.atCoder459;
import java.util.*;
public class DropBlocks {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n+1];
        int q = sc.nextInt();
        int[][] queries = new int[q][2];
        for(int i=0;i<q;i++){
            queries[i][0] = sc.nextInt();
            queries[i][1] = sc.nextInt();
        }

        Set<Integer> set = new HashSet<>();
        for(int i=0;i<q;i++){
            int left = queries[i][0];
            int right = queries[i][1];

            if(set.size()==n){
                for(int j=1;j<=n;j++){
                    if(arr[j]==1){
                        set.remove(j);
                    }
                    arr[j] = arr[j]-1;
                }
            }

            if(left==1){
                arr[right] = arr[right]+1;
                set.add(right);
            }else{
                int count = 0;
                for(int j=1;j<=n;j++){
                    if(arr[j]>=right){
                        count++;
                    }
                }
                System.out.println(count);
            }
        }
    }
}
