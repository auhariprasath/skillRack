package infosys;

import java.util.Collection;
import java.util.Collections;
import java.util.PriorityQueue;
import java.util.Scanner;

public class mock_test_1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int a[] = new int[n];
        int b[] = new int[n];

        PriorityQueue<Integer> maxHeap = new PriorityQueue<>(Collections.reverseOrder());
        for(int i=0;i<n;i++){
            maxHeap.add(sc.nextInt());
        }
        PriorityQueue<Integer> minHeap = new PriorityQueue<>();
        for(int i=0;i<n;i++){
            minHeap.add(sc.nextInt());
        }
        
        int MOD = (int)1e9+7;
        long ans = 0L;
        for(int i=0;i<n;i++){
            int o = maxHeap.poll();
            while(o-->0){
                ans = ((ans*2)+1)%MOD;
            }
            int g = minHeap.poll();
            while(g-->0){
                ans = (ans*2)%MOD;
            }
        }
        System.out.println(ans);
    }
}
