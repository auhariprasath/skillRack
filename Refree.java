import java.util.*;
public class Refree {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();
        }
        int xor = arr[0];
        for(int i=1;i<n;i++){
            xor^=arr[i];
        }
        int sh = 0;
        while((xor &(1<<sh))==0){
            sh++;
        }

        int og = 0;
        int zg = 0;
        for(int i:arr){
            if((i&(1<<og))==0){
                og^=i;
            }else{
                zg^=i;
            }
        }

        System.out.println(og+" "+zg);
    }
}
