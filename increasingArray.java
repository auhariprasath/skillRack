import java.util.*;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

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

public class increasingArray {
    public static void main(String[] args) {
        FastScanner sc = new FastScanner(System.in);
        int n = sc.nextInt();
        long[] arr = new long[n];
        arr[0] = sc.nextInt();
        long count = 0;
        for(int i=1;i<n;i++){
            arr[i] = sc.nextInt();
            long k = 0;
            if(arr[i-1]>arr[i]){

                k= arr[i-1] - arr[i];
                // System.out.println(k+" "+i);
                count+= k;
                arr[i] += k;
            }
        }
        System.out.println(count);
    }
}
