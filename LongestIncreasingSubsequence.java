package skillRack;
class Solution {
    public int lengthOfLIS(int[] nums) {
        
        int n = nums.length;
        int[] arr = new int[n];   
        int s = 0;

        for(int i = 0; i < n; i++){
            int pos = lowerBound(arr, 0, s, nums[i]);
            arr[pos] = nums[i];  

            if(pos == s){
                s++;
            }
        }

        return s;
    }

    public int lowerBound(int arr[], int l, int r, int k){
        while(l < r){
            int mid = (l + r) / 2;

            if(arr[mid] >= k){
                r = mid;
            } else {
                l = mid + 1;
            }
        }
        return l;
    }
}