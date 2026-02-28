class B-mpp{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        Map<Character,Integer> map = new HashMap<>();

        int max = 0;
        for(int i=0;i<s.length();i++){
            char ch = s.charAt(i);
            int val = map.get(ch);
            max = Math.max(max,val);
            map.put(ch,map.getOrDefault(ch,0)+1);
        }

        Set<Character> set = new HashSet<>();
        for(Map.Entry<Character,Integer> hm: map.entrySet()){
            char ch = hm.getKey();
            int val = hm.getValue();

            if(val==max){
                set.add(ch);
            }
        }

        for(int i=0;i<s.length();i++){
            char ch = s.charAt(i);
            if(!set.contains(ch)){
                System.out.print(ch);
            }
        }
    }
}