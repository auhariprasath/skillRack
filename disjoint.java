import java.util.Scanner;

public class disjoint {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[][] arr = new int[n][2];
        for(int i=0;i<n;i++){
            arr[i][0] = sc.nextInt();
            arr[i][1] = sc.nextInt();
        }


    }

    private static void merge(int ldr[],int ltldr,int rtldr){
        ldr[rtldr] = ltldr;
    }

    
}
