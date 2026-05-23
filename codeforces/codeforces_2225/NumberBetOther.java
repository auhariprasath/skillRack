import java.util.*;

public class NumberBetOther {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        while (n-- > 0) {
            long x = sc.nextLong();
            long y = sc.nextLong();

            long a = y / x;
            boolean flag = false;

            for (long z = x + x; z < y; z += z) {
                long b = z / x;

                if (a % b != 0) {
                    System.out.println("YES");
                    flag = true;
                    break;
                }
            }

            if (!flag) {
                System.out.println("NO");
            }
        }
    }
}