package codeforces.codeforces_2242;

import java.util.Scanner;

public class PFD {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int q = sc.nextInt();
        while(q-->0){
            int n = sc.nextInt();
            int[] arr = new int[n];
            for(int i=0;i<n;i++){
                arr[i] = sc.nextInt();
            }

            int fend = -1;
            int send = -1;
            
            int count = 0;
            for(int i =0;i<n-2;i++){
                if(count>1 && arr[i+2]==3){
                    count++;
                }else{
                    count--;
                }

                if(count>=0){
                    fend = i;
                    if(count>0 && i!=n-3 && arr[i+1]==3){
                        fend = i+1;
                    }
                    break;
                }
            }

            count =0;
        }
    }
}
