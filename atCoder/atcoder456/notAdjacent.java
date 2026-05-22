package atCoder.atcoder456;
import java.util.*;

public class notAdjacent {

    static final int MOD = 998244353;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();

        int n = s.length();
        long count = 0;

        for (int i = 0; i < n; i++) {
            count++;

            for (int j = i + 1; j < n; j++) {
                if (s.charAt(j) == s.charAt(j - 1)) {
                    break; 
                }
                count++;
            }
        }

        System.out.println(count % MOD);
    }
}
