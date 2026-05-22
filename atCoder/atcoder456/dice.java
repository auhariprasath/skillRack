import java.util.*;
public class dice{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        if(x>=3 && x<=18){
            System.out.println("Yes");
        }else{
            System.out.println("No");
        }
    }
}