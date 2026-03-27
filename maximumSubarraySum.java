import java.util.*;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

// Custom FastScanner implementation using BufferedReader and StringTokenizer
class FastScanner {
    private BufferedReader br;
    private StringTokenizer st;

    public FastScanner(InputStream in) {
        br = new BufferedReader(new InputStreamReader(System.in));
    }

    // Method to read the next token
    String next() {
        while (st == null || !st.hasMoreElements()) {
            try {
                String line = br.readLine();
                if (line == null) return null;
                st = new StringTokenizer(line);
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        return st.nextToken();
    }

    // Methods to parse data types
    int nextInt() { return Integer.parseInt(next()); }
    long nextLong() { return Long.parseLong(next()); }
    double nextDouble() { return Double.parseDouble(next()); }
}

public class maximumSubarraySum {
    public static void main(String[] args) {
        FastScanner sc = new FastScanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];

        for(int i=0;i<n;i++){
                arr[i] = sc.nextInt();
            }
        long sum = 0;
        long max = arr[0];
        for(int i=0;i<n;i++){
            sum += arr[i];
            max = Math.max(sum,max);

            if(sum<0){
                sum = 0;
            }
            
        }

        System.out.println(max);
    }
}
