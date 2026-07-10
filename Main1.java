import java.util.*;
public class Main1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int[][] arr = new int[n][m];
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                arr[i][j] = sc.nextInt();
            }
        }
        horizontal(arr, false,n);
        horizontal(arr, true, n);
    }

    public static void horizontal(int[][] arr,boolean flag,int n){
        if(flag){
            for(int i=0;i<n;i++){
                System.out.println(arr[i][0]);
            }
        }else{
            for(int i=0;i<n;i++){
                System.out.println(arr[n-i-1][0]);
            }
        }
    }

    public static void vertical(int[][] arr){

    }
}
