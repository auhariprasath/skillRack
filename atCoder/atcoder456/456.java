import java.util.*;

public class 456 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[][] a = new int[3][6];

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 6; j++) {
                a[i][j] = sc.nextInt();
            }
        }

        int count = 0;

        for (int i = 0; i < 6; i++) {
            for (int j = 0; j < 6; j++) {
                for (int k = 0; k < 6; k++) {

                    int x = a[0][i];
                    int y = a[1][j];
                    int z = a[2][k];

                    if (x != y && y != z && x != z) {
                        if (x + y + z == 15) { // 4+5+6 = 15
                            count++;
                        }
                    }
                }
            }
        }

        double ans = count / 216.0;
        System.out.println(ans);
    }
}