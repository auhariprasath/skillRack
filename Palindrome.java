package skillRack;
import java.util.*;
public class Palindrome {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        int flag = 0;
        for(char ch:s.toCharArray()){
            flag = flag^(1<<ch-'a');
        }
        if(flag==0 || ((flag)&flag-1)==0){
            System.out.println("Yes");
        }else{
            System.out.println("No");
        }
    }
}