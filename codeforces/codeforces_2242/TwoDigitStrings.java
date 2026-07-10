package codeforces.codeforces_2242;

import java.util.Scanner;

public class TwoDigitStrings {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int q = sc.nextInt();
        while(q-->0){
            int n = sc.nextInt();
            int m = sc.nextInt();

            String a = n+"";
            String b = m+"";

            StringBuilder sb1 = new StringBuilder();
            StringBuilder sb2 = new StringBuilder();

            sb1.append(a.charAt(0));
            sb2.append(b.charAt(0));
            int s1 = a.charAt(0)-'0';
            int s2 = b.charAt(0)-'0';

            for(int i=1;i<a.length();i++){
                s1 += a.charAt(i)-'0';
                s1 = s1%10;
                sb1.append(s1);
            }
            for(int j=1;j<b.length();j++){
                s2 += b.charAt(j)-'0';
                s2 = s2%10;
                sb2.append(s2);
            }
            if (s1 != s2) {
                System.out.println(-1);
                continue;
            }
            System.out.println(longestCommonSubsequence(sb1.toString(),sb2.toString()));
        }
    }
    public static int longestCommonSubsequence(String text1, String text2) {
        int n = text1.length();
        int m = text2.length();
        int[][] dp = new int[n+1][m+1];
        int ans = 0;
        for(int i=1;i<=n;i++){
            for(int j=1;j<=m;j++){
                char ch1 = text1.charAt(i-1);
                char ch2 = text2.charAt(j-1);

                if(ch1==ch2){
                    dp[i][j] = dp[i-1][j-1]+1;
                }else{
                    dp[i][j] = Math.max(dp[i-1][j],dp[i][j-1]);
                }
                ans = Math.max(dp[i][j],ans);
            }
        }

        return ans;

    }
}
