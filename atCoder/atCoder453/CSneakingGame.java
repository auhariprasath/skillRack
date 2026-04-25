package atCoder.atCoder453;

import java.util.Scanner;

public class CSneakingGame {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr =  new int[n];
        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();
        }

        double d = 0.5;
        boolean flag = true;
        int count = 0;
        for(int i=0;i<n;i++){
            if(flag){
                d -= arr[i];
                if(d<0){
                    count++;
                }
            }else{
                d += arr[i];
                if(d>0){
                    count++;
                }
            }
            flag = !flag;
        }

        System.out.println(count);
    }
}
