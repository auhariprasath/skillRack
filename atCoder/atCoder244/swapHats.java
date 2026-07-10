import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        char[] s = new char[3];
        char[] t = new char[3];

        for (int i = 0; i < 3; i++) s[i] = sc.next().charAt(0);
        for (int i = 0; i < 3; i++) t[i] = sc.next().charAt(0);

        int[] p = new int[3];

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (s[i] == t[j]) {
                    p[i] = j;
                }
            }
        }

        int inv = 0;
        for (int i = 0; i < 3; i++) {
            for (int j = i + 1; j < 3; j++) {
                if (p[i] > p[j]) inv++;
            }
        }

        System.out.println(inv % 2 == 0 ? "Yes" : "No");
    }
}