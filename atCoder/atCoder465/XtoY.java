package atCoder.atCoder465;

import java.util.Scanner;

public class XtoY {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int q = sc.nextInt();

        while (q-- > 0) {
            long x = sc.nextLong();
            long y = sc.nextLong();
            long k = sc.nextLong();

            long ans = 0;

            while (x != y) {
                if (x > y)
                    x /= k;
                else
                    y /= k;
                ans++;
            }

            System.out.println(ans);
        }
    }
}