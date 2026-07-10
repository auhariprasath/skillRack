package atCoder.atCoder465;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ReversePermutation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.nextLine();
        String s = sc.nextLine();

        boolean flag = false;
        List<Integer> front = new ArrayList<>();
        List<Integer> back = new ArrayList<>();
        for(int i=n-1;i>=0;i--){
            char c = s.charAt(i);
            if(c=='o'){
                flag = !flag;
                if(flag){
                    front.add(i+1);
                }else{
                    back.add(i+1);
                }
            }else{
                if(flag){
                    front.add(i+1);
                }else{
                    back.add(i+1);
                }
            }
        }

        for(int i=back.size()-1;i>=0;i--){
            front.add(back.get(i));
        }

        for(int i:front){
            System.out.print(i+" ");
        }
    }
}
