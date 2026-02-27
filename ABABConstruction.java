import java.util.*;
public class Main{
     public static void main(String[] args){
          Scanner sc=new Scanner(System.in);
          int q=sc.nextInt();
          while(q-->0){

            boolean f=true;
               int n=sc.nextInt();
               String s=sc.next();
               if((n%2==1)&&s.charAt(0)=='b'){
                    f=false;
               }
               int ind=(n%2==1)?1:0;
               for(int i=ind;i<s.length();i+=2)
               {
                    if(s.charAt(i)==s.charAt(i+1)&&s.charAt(i)!='?'){
                         f=false;
                    }
               }
               if(f)System.out.println("YES");
          else System.out.println("NO");
          }
          
     }
}
