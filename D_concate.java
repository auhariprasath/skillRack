import java.util.*;

public class D_concate {

    static List<Integer> gi = new ArrayList<>();
    static List<String> twop = new ArrayList<>();

    static void dfs(String s) {

        if (s.length() > 0) {
            gi.add(Integer.parseInt(s));
        }

        for (int i = 0; i < twop.size(); i++) {

            if (s.length() + twop.get(i).length() <= 9) {
                dfs(s + twop.get(i));
            }
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();

        long val = 1;
        while (true) {
            String s = String.valueOf(val);

            if (s.length() > 9) break;

            twop.add(s);
            val *= 2;
        }
        dfs("");
        Collections.sort(gi);
        System.out.println(gi.get(N - 1));
    }
}