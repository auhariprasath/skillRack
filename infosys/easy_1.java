package infosys;

import java.util.Scanner;

public class easy_1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] arr = new int[n];

        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();
        }

        int k = sc.nextInt(); 
        int[][] queries = new int[k][4];

        for(int i=0;i<k;i++){
            for(int j=0;j<4;j++){
                queries[i][j] = sc.nextInt();
            }
        }

        int[] pen = new int[n];
        for(int i=0;i<n;i++){
            pen[i] = -1;
        }

        int left = n;
        int right = -1;  

        for(int i=k-1;i>=0;i--){
            int l = queries[i][0];
            int r = queries[i][1];  
            int x = queries[i][2];
            int y = queries[i][3];

            for(int j=l; j<left && j<=r; j++){
                if(pen[j] == -1){
                    pen[j] = x + (j - l) * y;
                }
            }

            for(int j=Math.max(r, right)+1; j<=r; j++){
                if(pen[j] == -1){
                    pen[j] = x + (j - l) * y;
                }
            }

            left = Math.min(left, l);
            right = Math.max(right, r);
        }

        for(int i=0;i<n;i++){
            if(pen[i] == -1){
                pen[i] = arr[i];
            }
        }

        int sum = 0;
        for(int i=0;i<n;i++){
            sum += pen[i];
        }

        System.out.println(sum);
    }

    
}
