package atCoder.atCoder464;

import java.util.*;

public class PlumagePalate {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int m = sc.nextInt();

        int[][] bird = new int[n][m];

        for (int i = 0; i < n; i++) {

            int before = sc.nextInt();
            int day = sc.nextInt();
            int after = sc.nextInt();

            for (int j = 0; j < m; j++) {

                if (j + 1 < day) {
                    bird[i][j] = before;
                } else {
                    bird[i][j] = after;
                }

            }
        }

        for (int j = 0; j < m; j++) {
            HashSet<Integer> set = new HashSet<>();

            for (int i = 0; i < n; i++) {
                set.add(bird[i][j]);
            }

            System.out.println(set.size());
        }

        sc.close();
    }
}