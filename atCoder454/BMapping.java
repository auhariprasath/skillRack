import java.util.*;
public class BMapping{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int m = sc.nextInt();
    int[] arr = new int[n];
    Set<Integer> set = new HashSet<>();
    boolean flag1 = true;
    for(int i=0;i<n;i++){
      arr[i]= sc.nextInt();
      if(set.contains(arr[i])){
        flag1 = false;
      }
      set.add(arr[i]);
    }
    
    if(flag1){
      System.out.println("Yes");
    }else{
      System.out.println("No");
    }
    
    boolean flag2 = true;
    for (int i = 1; i <= m; i++) {
        if (!set.contains(i)) {
            flag2 = false;
            break;
        }
    }

    if(flag2){
      System.out.println("Yes");
    }else{
      System.out.println("No");
    }
  }
}