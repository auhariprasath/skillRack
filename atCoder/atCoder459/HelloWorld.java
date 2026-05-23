import java.util.*;
public class HelloWorld{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    String s = "HelloWorld";
    StringBuilder sb = new StringBuilder();
    for(int i=1;i<=10;i++){
      if(i==n){
        continue;
      }
      sb.append(s.charAt(i-1));
    }
    
    System.out.print(sb);
  }
}