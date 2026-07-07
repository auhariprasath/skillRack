import java.util.*;
public class XmasOrHysteria {

   
    static class Elf {
        long ap; 
        int id;  

        Elf(long ap, int id) {
            this.ap = ap;
            this.id = id;
        }
    }

  
    static class Pair {
        int first;
        int second;

        Pair(int first, int second) {
            this.first = first;
            this.second = second;
        }
    }

    public static void main(String[]args) {
        Scanner sc=new Scanner(System.in);
        int q=sc.nextInt();
        while(q-->0){
        int N = sc.nextInt();
        int M = sc.nextInt();
        

        List<Elf> elf = new ArrayList<>(N);
        for (int i = 0; i < N; i++) {
            long ap = sc.nextLong();
            elf.add(new Elf(ap, i + 1));
        }

        if (M > N / 2) {
            System.out.println("-1");
            continue;
        }

        List<Pair> ans = new ArrayList<>();

        if (M != 0) {
            
            elf.sort((e1, e2) -> {
                if (e1.ap != e2.ap) {
                    return Long.compare(e2.ap, e1.ap);
                }
                return Integer.compare(e2.id, e1.id);
            });

            
            while (elf.size() > 2 * M) {
                Elf smallest = elf.remove(elf.size() - 1); 
                Elf nextSmallest = elf.get(elf.size() - 1); 
                
                ans.add(new Pair(nextSmallest.id, smallest.id));
            }

            
            for (int i = 0; i < M; i++) {
                ans.add(new Pair(elf.get(i).id, elf.get(i + M).id));
            }
        } else {
          
            elf.sort((e1, e2) -> {
                if (e1.ap != e2.ap) {
                    return Long.compare(e1.ap, e2.ap);
                }
                return Integer.compare(e1.id, e2.id);
            });

            int aidx = N - 2;
            long largbal = elf.get(N - 1).ap;

           
            while (largbal > 0 && aidx >= 0) {
                largbal -= elf.get(aidx).ap;
                aidx--;
            }

            if (largbal > 0) {
               System.out.println("-1");
                continue;
            }

           
            for (int i = 0; i <= aidx; i++) {
                ans.add(new Pair(elf.get(i).id, elf.get(i + 1).id));
            }

            
            for (int i = aidx + 1; i <= N - 2; i++) {
                ans.add(new Pair(elf.get(i).id, elf.get(N - 1).id));
            }
        }

        System.out.println(ans.size());
        for (Pair p : ans) {
            System.out.println(p.first+" "+p.second);
        }
    }

    }
}