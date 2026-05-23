package atCoder.atCoder459;
import java.util.*;

public class 459 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        StringBuilder sb = new StringBuilder();
        for(int i=0;i<n;i++){
            int k = 2;
            String s = sc.next();
            char ch = s.charAt(0);
            int num = ch - 'a';
            if(ch=='s'){
                sb.append("7");
            }else if(ch=='v'){
                sb.append("8");
            }else if(ch=='y' || ch=='z'){
                sb.append('9');
            }else{
                num = (num/3)+2;
                sb.append(num+"");
            }
            
        }
        System.out.println(sb);
    }
}
