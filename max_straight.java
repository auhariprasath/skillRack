import java.util.*;
class max_straight{
  public static void main(String[] args){
    Scanner sc=new Scanner(System.in);
    int n=sc.nextInt();
    int[]a=new int[n];
    int max=1;
    for(int i=0;i<n;i++)a[i]=sc.nextInt();
    HashMap<Integer,Integer>map=new HashMap<>();
    for(int i=n-1;i>=0;i--){
      if(map.containsKey(a[i]+1)){
        map.put(a[i],map.get(a[i]+1)+1);
        max=Math.max(max,map.get(a[i]));
      }
      else{
        map.put(a[i],1);
      }
    }
    System.out.println(max);
  }
}
