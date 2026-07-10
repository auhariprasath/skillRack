package atCoder.atCoder164;

import java.util.Scanner;

public class multipleOf2019 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Map<Integer,Integer> map = new HashMap<>();

        String s = sc.nextLine();
        int rem = 0;
        int n = 2019;
        for(int i=n-1;i>=0;i--){
            int c = s.charAt(i) - '0';
            rem =(rem+dig+tenPower*10)%n;
            tenPower =(tenPower*10)%n;

            if(remCount.find(rem!=remCount.end())){
                count+= RCount[rem];
                remCount[rem]++;
            }else{
                remCount[rem]-1;
            }
        }
        
    }
}
