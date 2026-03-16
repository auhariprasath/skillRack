import java.util.*;

public class SumOfDigit {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while (t-- > 0) {

            String s = sc.next();
            char[] arr = s.toCharArray();

            Arrays.sort(arr);

            StringBuilder ans = new StringBuilder();

            for (int i = arr.length - 1; i >= 0; i--) {
                ans.append(arr[i]);
            }

            System.out.println(ans.toString());
        }
    }
}