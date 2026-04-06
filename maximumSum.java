import java.util.*;

class maximumSum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int m = sc.nextInt();

        int[][] arr = new int[n][m];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                arr[i][j] = sc.nextInt();
            }
        }

        int fmax = Integer.MIN_VALUE;
        int smax = Integer.MIN_VALUE;

        for (int j = 0; j < m; j++) {
            if (arr[0][j] > fmax) {
                smax = fmax;
                fmax = arr[0][j];
            } else if (arr[0][j] > smax && arr[0][j] != fmax) {
                smax = arr[0][j];
            }
        }

        for (int i = 1; i < n; i++) {
            int currfmax = Integer.MIN_VALUE;
            int currsmax = Integer.MIN_VALUE;

            for (int j = 0; j < m; j++) {
                if (arr[i - 1][j] == fmax) {
                    arr[i][j] += smax;
                } else {
                    arr[i][j] += fmax;
                }

                if (arr[i][j] > currfmax) {
                    currsmax = currfmax;
                    currfmax = arr[i][j];
                } else if (arr[i][j] > currsmax && arr[i][j] != currfmax) {
                    currsmax = arr[i][j];
                }
            }

            fmax = currfmax;
            smax = currsmax;
        }

        System.out.println(fmax);
    }
}