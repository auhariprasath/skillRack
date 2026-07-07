import java.util.*;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        addNum(sc.nextInt());

        int n = sc.nextInt();

        for (int i = 0; i < n; i++) {
            int f = sc.nextInt();
            int s = sc.nextInt();
            addNum(f);
            addNum(s);
            System.out.println(findMedian());

        }

    }

    // static int n = 0;
    static PriorityQueue<Integer> minHeap = new PriorityQueue<>();
    static PriorityQueue<Integer> maxHeap = new PriorityQueue<>(Collections.reverseOrder());

    public static void addNum(int num) {
        // n++;

        minHeap.add(num);
        maxHeap.add(minHeap.poll());

        if (maxHeap.size() > minHeap.size() + 1) {
            minHeap.add(maxHeap.poll());
        }
    }

    public static int findMedian() {
        return maxHeap.peek();
    }

}