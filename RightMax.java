import java.util.*;

public class RightMax {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while (t-- > 0) {

            int n = sc.nextInt();

            int maxSeen = 0;
            int count = 0;

            for (int i = 0; i < n; i++) {

                int x = sc.nextInt();

                if (x >= maxSeen) {
                    count++;
                    maxSeen = x;
                }
            }

            System.out.println(count);
        }
    }
}