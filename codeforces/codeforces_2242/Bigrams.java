package codeforces.codeforces_2242;

import java.util.Scanner;

public class Bigrams {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int q = sc.nextInt();
        while(q-->0){
            int n = sc.nextInt();

            int[] arr = new int[n];
            boolean flag = false;
            int count = 0;
            for(int i=0;i<n;i++){
                arr[i] = sc.nextInt();
                if(arr[i] >=3){
                    flag = true;
                }
                if(arr[i]==2){
                    count++;
                }
            }
            
            if(flag){
                System.out.println("Yes");
            }
            else{
                if(count>=2){
                    System.out.println("Yes"); 
                }
                else{
                    System.out.println("No");
                }
            }
        }
    }
}