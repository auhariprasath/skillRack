import java.util.*;
class BArray{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int q = sc.nextInt();
        while(q-->0){
            int n = sc.nextInt();
            int[] arr = new int[n];
            for(int i=0;i<n;i++){
                arr[i] = sc.nextInt();
            }
            int arr2[] = new int[n];
            for(int i=0;i<n;i++){
                int minCount = 0;
                int maxCount = 0;
                for(int j=i+1;j<n;j++){
                    if(arr[i]>arr[j]){
                        minCount++;
                    }else if(arr[j]>arr[i]){
                        maxCount++;
                    }
                }
                arr2[i] = Math.max(minCount,maxCount);
            }

            for(int i=0;i<n;i++){
                System.out.print(arr2[i]+" ");
            }
            System.out.println();
        }
    }
}