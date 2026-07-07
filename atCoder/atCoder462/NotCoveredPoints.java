package atCoder.atCoder462;

import java.util.*;

public class NotCoveredPoints {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[][] arr = new int[n][2];
        for(int i=0;i<n;i++){
            arr[i][0] = sc.nextInt();
            arr[i][1] = sc.nextInt();
        }
        Arrays.sort(arr,
            (a,b) ->{
                return a[0] - b[0];
            }
        );

        int min = arr[0][1];
        int count = 1;
        for(int i=0;i<n;i++){
            int a = arr[i][1];
            if(min>a){
                min = Math.min(a,min);
                count++;
            }
        }
        System.out.println(count);
    }
}
