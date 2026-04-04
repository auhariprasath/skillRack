import java.util.*;
import java.io.*;

class FastScanner {
    private BufferedReader reader;
    private StringTokenizer tokenizer;

    public FastScanner(InputStream in) {
        reader = new BufferedReader(new InputStreamReader(in));
    }

    public String next() {
        while (tokenizer == null || !tokenizer.hasMoreElements()) {
            try {
                tokenizer = new StringTokenizer(reader.readLine());
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        return tokenizer.nextToken();
    }

    public int nextInt() {
        return Integer.parseInt(next());
    }
}

public class SegmentTree {

    public static void main(String[] args) {
        FastScanner sc = new FastScanner(System.in);
        int n = sc.nextInt();
        int q = sc.nextInt();
        int pow = 0;
        while ((1 << pow) < n)
            pow++;
        int newN = 1 << pow;
        long[] segArr = new long[newN * 2];

        for (int i = 0; i < n; i++) {
            segArr[newN + i] = sc.nextInt();
        }

        for (int i = newN - 1; i > 0; i--) {
            segArr[i] = segArr[i * 2] + segArr[i * 2 + 1];
        }
        StringBuilder sb = new StringBuilder();
        while (q-- > 0) {
            int queryType = sc.nextInt();

            if (queryType == 1) {
                int k = sc.nextInt() - 1;
                int u = sc.nextInt();
                update(segArr, k + newN, u);
            } else {
                int left = sc.nextInt() - 1;
                int right = sc.nextInt() - 1;
                sb.append(query(segArr, left, right, newN)+"\n");
            }
        }
        System.out.println(sb);
    }

    public static long query(long[] segArr, int left, int right, int newN) {
        long sum = 0;

        left += newN;
        right += newN;

        while (left <= right) {
            if ((left % 2) == 1)
                sum += segArr[left++];
            if ((right % 2) == 0)
                sum += segArr[right--];
            left /= 2;
            right /= 2;
        }

        return sum;
    }

    public static void update(long[] segArr, int i, int val) {
        segArr[i] = val;

        while (i > 1) {
            i /= 2;
            segArr[i] = segArr[i * 2] + segArr[i * 2 + 1];
        }
    }
}

