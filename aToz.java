package skillRack;
import java.util.Scanner;

public class aToz {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        int flag = 0;
        for (char ch : s.toCharArray()) {
            int val = ch-'a';
            flag = flag | (1 << val);
        }
        if (flag == (1 << 26) - 1) {
            System.out.println("yes");
        } else {
            System.out.println("no");
        }
    }
}