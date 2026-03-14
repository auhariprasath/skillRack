import java.util.Scanner;

public class ReverseAndCheckPalindrome {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        
        int m = 0;
        while(n>0){
            m = n%10 + m*10;
            n = n/10;
        }
        if(prime(m)){
            System.out.println("prime");
        }else{
            System.out.println("Not a prime");
        }
    }

    public static boolean prime(int m){
        if(m<=1){
            return false;
        }
        for(int i=2;i*i<=m;i++){
            if(m%i==0){
                return false;
            }
        }
        return true;
    }
}