import java.util.*;
public class FishBones {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[][] arr = new int[n][2];
        for(int i=0;i<n;i++){
            arr[i][0] = sc.nextInt();
            arr[i][1] = sc.nextInt()-1;
        }

        int k = sc.nextInt();
        sc.nextLine();
        String[] s = new String[k];
        for(int i=0;i<k;i++){
            s[i] = sc.nextLine();
        }
        
        for(int i=0;i<k;i++){
            String ks = s[i];
            if(ks.length() != n){
                System.out.println("No");
                continue;
            }
            boolean flag = true;
            for(int j=0;j<n;j++){
                int a = arr[j][0];
                int b = arr[j][1];
                boolean found = false;
                for(int l=0;l<k;l++){
                    String lk = s[l];
                   if(lk.length() == a && b >= 0 && b < lk.length() && j < ks.length() && lk.charAt(b) == ks.charAt(j)){
                        found = true;
                        break;
                    }
                }
                if(!found){
                    flag = false;
                    break;
                }
            }
            System.out.println(flag ? "Yes" : "No");
        }
    }
}
