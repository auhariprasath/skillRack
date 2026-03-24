import java.util.*;
class sping{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-->0){
            long a = sc.nextLong();
            long b = sc.nextLong();
            long c = sc.nextLong();
            long k = sc.nextLong();

            long ab = lcm(a,b);
            long bc = lcm(b,c);
            long ca = lcm(c,a);
            long abc = lcm(a,b,c);
            
            System.out.println(solve(k, a, abc, ab, ca));
            System.out.println(solve(k, b, abc, ab, bc));
            System.out.println(solve(k, c, abc, bc, ca));
        }
    }

    public static long lcm(long a,long b){
        long g = gcd(a,b);
        return (a*b)/gcd(a,b);
    }

    public static long solve(long k,long sin,long three,long d1,long d2){
        long l = (k/sin) * 6;
        l -= (k/three)*4;
        l -= (k/d1 - k/three)*3;
        l -= (k/d2 - k/three)*3;
        return l;
    }

    public static long lcm(long a,long b,long c){
        return lcm(a,lcm(b,c));
    }

    public static long gcd(long a, long b) {
        while (b != 0) {
            long temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }

}