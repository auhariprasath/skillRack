import java.util.Scanner;

class passingTheBall{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-->0){
            int n = sc.nextInt();
            sc.nextLine();
            String s = sc.next();
            int ans = 0;
            for(int i=0;i<n;i++){
                char ch = s.charAt(i);
                if(ch=='L'){
                    ans = i+1;
                    break;
                }
            }
            System.out.println(ans);
        }
        
    }
}