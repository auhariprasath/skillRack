package codeforces_2218;

import java.util.Scanner;

public class C_67thPermutation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int q = sc.nextInt();

        while (q-- > 0) {
            int n = sc.nextInt();
            StringBuilder sb = new StringBuilder();

            int left = 1;
            int right = 3 * n;

            while (left < right) {
                sb.append(left).append(" ");
                sb.append(right - 1).append(" ");
                sb.append(right).append(" ");

                left++;
                right -= 2;
            }

            System.out.println(sb);
        }
    }
}