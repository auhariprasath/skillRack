package atCoder.atCoder376;

public import java.util.*;
class PrepareAnotherBox{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] toys = new int[n];
		for(int i=0;i<n;i++){
			toys[i] = sc.nextInt();
		}
		int[] box = new int[n-1];
		for(int i=0;i<n-1;i++){
			box[i] = sc.nextInt();
		}
		
		Arrays.sort(toys);
		Arrays.sort(box);
		
		List<Integer> ls = new ArrayList<>();
		int j = n - 2;

		for(int i = n - 1; i >= 0; i--) {

    	if(j < 0){
        	ls.add(toys[i]);
        	continue;
    	}

    	int t = toys[i];
    	int b = box[j];

    	if(b >= t){
        	j--;
	    }else{
    	    ls.add(t);
    	}
	}		
		if(ls.size()>=2){
			System.out.print(-1);
		}else{
			System.out.print(ls.get(0));
		}
	}
} {
    
}
