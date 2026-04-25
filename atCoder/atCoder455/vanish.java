import java.util.*;

public class vanish {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        int[] arr = new int[n];
        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();
        }
        Map<Integer,Integer> map = new HashMap<>();
        int sum = 0;
        for(int i:arr){
            map.put(i,map.getOrDefault(i, 0)+1);
            sum+=i;
        }
        
        List<Integer> ls = new ArrayList<>();
        int total = 0;
        int key = 0;
        int val = 0;
        for(Map.Entry<Integer,Integer> hm: map.entrySet()){
            key = hm.getKey();
            val = hm.getValue();

            total = key * val;
            ls.add(total);
        }            
        
        Collections.sort(ls,Collections.reverseOrder());
        int m = ls.size();
        int min = Math.min(m,k);
        for(int i=0;i<min;i++){
            sum -= ls.get(i);
        }
        
        System.out.println(sum);
    }
}
