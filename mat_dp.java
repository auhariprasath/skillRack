import java.util.Scanner;
public class mat_dp {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[][] arr = new int[n][n];
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                arr[i][j] = sc.nextInt();
            }
        }
        int[][] parallel = new int[n][n];
        int firstMax = 0;
        int secondMax = 0;
        for(int i=0;i<n;i++){
            parallel[0][i] = arr[0][i];
            if (parallel[0][i] > firstMax) {
                secondMax = firstMax;
                firstMax = parallel[0][i];
            } else if (parallel[0][i] > secondMax && parallel[0][i] != firstMax) {
                secondMax = parallel[0][i];
            }
        }
        for(int i=1;i<n;i++){
            int newFirst = 0;
            int newSecond = 0;

            for(int j=0;j<n;j++){
                if(parallel[i-1][j] == firstMax){
                    parallel[i][j] = arr[i][j] + secondMax;
                } else {
                    parallel[i][j] = arr[i][j] + firstMax;
                }

                if (parallel[i][j] > newFirst) {
                    newSecond = newFirst;
                    newFirst = parallel[i][j];
                } else if (parallel[i][j] > newSecond && parallel[i][j] != newFirst) {
                    newSecond = parallel[i][j];
                }
            }

            firstMax = newFirst;
            secondMax = newSecond;
        }

        System.out.println(firstMax);
    }
}