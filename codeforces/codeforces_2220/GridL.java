import java.util.*;
public class GridL {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int k = sc.nextInt();
        while(k-->0){
            long p = sc.nextLong();
            long q = sc.nextLong();
            long s = p+q+q;
            boolean flag = true;
            for(int n=0;;n++){
                long num = s - n;
                long den = n + n + 1;
                if(num<den*n){
                    flag = false;
                    break;
                }
                if(num%den==0){
                    long m = num/den;
                    long Lmax = Math.min(m*(n+1),(m+1)*n);
                    if(q<=Lmax){
                        System.out.println(n+" "+m);
                        break;
                    }
                }
                
            }
            if(!flag){
                System.out.println("-1");
            }
            
        }
    }
}
