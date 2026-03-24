import java.util.PriorityQueue;
import java.util.Scanner;

public class minHeap {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        PriorityQueue<Integer> minHeap = new PriorityQueue<>();
        int n = sc.nextInt();
        for(int i=0;i<n;i++){
            minHeap.add(-1 * sc.nextInt());
        }

        for(int i=0;i<n;i++){
            System.out.print(-1*minHeap.poll());
        }
    }
}
