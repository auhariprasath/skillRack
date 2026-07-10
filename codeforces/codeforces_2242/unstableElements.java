package codeforces.codeforces_2242;

import java.util.ArrayList;
import java.util.Scanner;

public class unstableElements {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();

        int[] arr = new int[n];
        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();
        }
        
        List<Integer> ls = new ArrayList<>();
        int b = 1;
        for(int i=0;i<n;i++){
            if(arr[i]==arr[i-1]){
                b++;
            }
            else{
                ls.add(b);
                b=1;
            }
        }
        ls.add(b);
        Collections.sort(ls);

        while(b>k){
            if(b>k){
                int a = binarySearch
            }
        }
    }
}
