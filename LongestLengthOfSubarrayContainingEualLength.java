import java.util.*;
class LongestLengthOfSubarrayContainingEualLength{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        int c = 0;
        int n = s.length();
        int max = 0;
        Map<Integer,Integer> map = new HashMap<>();
        map.put(0,-1);
        for(int i=0;i<n;i++){
            char ch = s.charAt(i);
            if(ch=='a'){
                c++;
            }else{
                c--;
            }

            if(map.containsKey(c)){
                max = Math.max(i-map.get(c),max);
            }else{
                map.put(c,i);
            }
        }

        System.out.print(max);
    }
}