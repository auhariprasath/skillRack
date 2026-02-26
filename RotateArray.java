class Solution {
    public void rotate(int[] nums, int k) {
        int n = nums.length;
        k = k%n;
        int rem = n - k;
        int[] arr = new int[rem];
        for(int i=0;i<rem;i++){
            arr[i] = nums[i];
        }
        for(int i=0;i<k;i++){
            nums[i]=nums[i+rem];
        }
        for(int i=k;i<n;i++){
            nums[i] = arr[i-k];
        }
    }
}
