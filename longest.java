import java.util.*;
public class longest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();
        }
        Map<Integer,Integer> map = new HashMap<>();
        map.put(0,-1);
        int count = 0;
        int maxLen = 0;
        for(int i=0;i<n;i++){
            if(arr[i] == 0){
                count++;
            }else{
                count--;
            }

            if(map.containsKey(count)){
                maxLen =Math.max(i - map.get(count),maxLen);
            }else{
                map.put(count,i);
            }
        }
        System.out.println(maxLen);
    }
}
