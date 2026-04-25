import java.util.*;

public class spiralGalaxy {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int H = sc.nextInt();
        int W = sc.nextInt();
        String[] grid = new String[H];

        for (int i = 0; i < H; i++) {
            grid[i] = sc.next();
        }

        int count = 0;

        for (int h1 = 0; h1 < H; h1++) {
            for (int h2 = h1; h2 < H; h2++) {
                for (int w1 = 0; w1 < W; w1++) {
                    for (int w2 = w1; w2 < W; w2++) {

                        boolean ok = true;

                        for (int i = h1; i <= h2 && ok; i++) {
                            for (int j = w1; j <= w2; j++) {

                                int si = h1 + h2 - i;
                                int sj = w1 + w2 - j;

                                if (grid[i].charAt(j) != grid[si].charAt(sj)) {
                                    ok = false;
                                    break;
                                }
                            }
                        }

                        if (ok) count++;
                    }
                }
            }
        }

        System.out.println(count);
    }
}

