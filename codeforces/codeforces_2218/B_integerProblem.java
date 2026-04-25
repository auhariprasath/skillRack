package codeforces_2218;
import java.util.*;
public class B_integerProblem {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int q = sc.nextInt();
        while(q-->0){
            int[] arr = new int[7];
            int sum = 0;
            int max = Integer.MIN_VALUE;
            for(int i=0;i<7;i++){
                arr[i] = sc.nextInt();
                if(arr[i]>max){
                    max = arr[i];
                }
            }
            // System.out.print(max);
            boolean flag = false;
            for(int i=0;i<7;i++){
                if(arr[i]!=max || flag){
                    sum+= arr[i];
                }else{
                    flag = true;
                }
            }
            sum = sum * -1;
            System.out.println(sum+max);
        }
    }
}
