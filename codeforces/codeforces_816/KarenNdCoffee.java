import java.util.*;

class KarenNdCoffee{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        int[] rec = new int[200002];
        int[] ts = new int[200002];
        
        while(a-->0){
            int k1 = sc.nextInt();
            int k2 = sc.nextInt();

            rec[k1] = rec[k1]+1;
            rec[k2+1] = rec[k2+1]-1;
        }

        for(int i=1;i<=200000;i++){
            rec[i] += rec[i-1];
        }

        for (int t = 1; t <= 200000; t++) {
            ts[t] = ts[t - 1];

            if (rec[t] >= b) {
                ts[t]++;
            }
        }

        while(c-->0){
            int left = sc.nextInt();
            int right = sc.nextInt();

            System.out.println(ts[right] - ts[left-1]);
        }

    }
}