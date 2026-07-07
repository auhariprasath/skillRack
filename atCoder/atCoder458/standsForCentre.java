import java.util.Scanner;

public class standsForCentre {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        int res = 0;
        int n = s.length();
        for(int i=0;i<n;i++){
            if(s.charAt(i) =='C'){
                res+= Math.min(n-i-1,i)+1;
            }
        }

        System.out.print(res);
    }
}
