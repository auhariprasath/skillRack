package atCoder.atCoder391;

import java.util.Scanner;

public class pigeonHole {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int q = sc.nextInt();

        int[] ploc = new int[n+1];
        int[] hcnt = new int[n+1];
        for(int i=1;i<=n;i++){
            ploc[i] = i;
            hcnt[i] = 1;
        }

        int count = 0;
        while(q-->0){
            int qt = sc.nextInt();
            if(qt==1){
                int p = sc.nextInt();
                int hole = sc.nextInt();
                int curr = ploc[p];
                if(--hcnt[curr]==1)count--;
                if(++hcnt[hole]==2)count++;

                ploc[p] = hole;
            }else{
                System.out.println(count);
            }
        }
    }
}
