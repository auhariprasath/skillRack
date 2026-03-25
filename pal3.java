import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class pal3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.nextLine();
        String s = sc.nextLine();
        int[] lar = new int[26];
        int[] rar = new int[26];

        for(int i=0;i<n;i++){
            rar[s.charAt(i)-'a']++;    
        }
        int count = 0;
        for(int i=0;i<n;i++){
            char ch = s.charAt(i);
            rar[s.charAt(i)-'a']--;
            for(int j=0;j<26;j++){
                if(lar[j] > 0 && rar[j] > 0){
                    count+=(lar[j]*rar[j]);
                }
            }
            lar[s.charAt(i)-'a']++;
        }
        System.out.println(count);
    }
}
