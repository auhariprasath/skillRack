import java.util.Scanner;

public class subMatrixSum {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();

        int[][] arr = new int[n][m];
        for(int i = 0; i < n; i++){
            for(int j = 0; j < m; j++){
                arr[i][j] = sc.nextInt();
            }
        }

        int[][] pref = new int[n][m];

        for(int i = 0; i < n; i++){
            for(int j = 0; j < m; j++){
                pref[i][j] = arr[i][j];

                if(i > 0) pref[i][j] += pref[i-1][j];
                if(j > 0) pref[i][j] += pref[i][j-1];
                if(i > 0 && j > 0) pref[i][j] -= pref[i-1][j-1];
            }
        }

        
        int r1 = sc.nextInt();
        int c1 = sc.nextInt();
        int r2 = sc.nextInt();
        int c2 = sc.nextInt();

        int sum = pref[r2][c2];

        if(r1 > 0) sum -= pref[r1-1][c2];
        if(c1 > 0) sum -= pref[r2][c1-1];
        if(r1 > 0 && c1 > 0) sum += pref[r1-1][c1-1];

        System.out.println(sum);
    }
}