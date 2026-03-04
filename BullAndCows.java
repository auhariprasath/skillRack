public class BullAndCows {
    public String getHint(String secret, String guess) {
        int[] s = new int[10];
        int[] g = new int[10];

        for(int i=0;i<secret.length();i++){
            char ch = secret.charAt(i);
            int num = ch - '0';
            s[num]++;
        }
        for(int i=0;i<guess.length();i++){
            char ch = guess.charAt(i);
            int num = ch - '0';
            g[num]++;
        }

        int common = 0;
        for(int i=0;i<10;i++){
            if(s[i]!=0 && g[i]!=0){
                common+=Math.min(s[i],g[i]);
            }
        }

        int count = 0;
        for(int i=0;i<guess.length();i++){
            char ch1 = secret.charAt(i);
            char ch2 = guess.charAt(i);
            int num1 = ch1 - '0';
            int num2 = ch2 - '0';
            if(num1==num2){
                count++;
            }
        }

        int rem = common - count;
        return count+"A"+rem+"B";
    }
}