import java.util.*;
public class Main{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int month = sc.nextInt();
        int day = sc.nextInt();
        int[][] def = {
            {1,7},
            {3,3},
            {5,5},
            {7,7},
            {9,9}
        };
        boolean flag = false;
        for(int i=0;i<5;i++){
            int f = def[i][0];
            int s = def[i][1];
            if(f==month && s == day){
                System.out.println("Yes");
                flag = true;
                return;
            }
        }
        if(!flag){
            System.out.println("No");
        }
    }
}
