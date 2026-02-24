package skillRack;
import java.util.*;

public class Heapify {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();

        int[] arr = new int[N + 1];

        for (int i = 1; i <= N; i++) {
            arr[i] = sc.nextInt();
        }
        for (int st = 1; st <= N; st += 2) {

            ArrayList<Integer> seq = new ArrayList<>();

            for (int i = st; i <= N; i = i * 2) {
                seq.add(arr[i]);
            }

            Collections.sort(seq);

            int idx = 0;

            for (int i = st; i <= N; i = i * 2, idx++) {
                if (arr[i] != seq.get(idx)) {
                    System.out.println("NO");
                    return;
                }
            }
        }

        System.out.println("YES");
    }

    
}