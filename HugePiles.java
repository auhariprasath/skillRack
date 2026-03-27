import java.util.Scanner;

public class HugePiles {
    public static boolean flag = false;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int q = sc.nextInt();
        while(q-->0){
            int a = sc.nextInt();
            int b = sc.nextInt();
            int max = a;
            int min = a;
            int count = 0;
            boolean flag = false;
            while(max>=b || min>=b){
                if(max==b || min == b){
                    flag = true;
                    break;
                }
                count++;
                max = (max+1)/2;
                min = min/2;
            }

            if(flag){
                System.out.println(count);
            }
            else{
                System.out.println(-1);
            }
        }


        // int a = sc.nextInt();
        // int b = sc.nextInt();
        // int max = a;
        // int min = a;
        // find(a,0,b);
    }

    // public static void find(int a,int k,int b){
    //     if(a == b){
    //         flag = true;
    //         return;
    //     }

    //     find((a+1)/2,k++,b);
    //     find(a/2,k++,b);
    // }
}
