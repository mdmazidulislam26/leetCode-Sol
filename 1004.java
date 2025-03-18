class Solution {
    public int longestOnes(int[] nums, int k) {
        int left = 0;
        int ans = 0;
        int window = 0;
        int n = nums.length;
        for(int i = 0; i < n ; i++){
            window += nums[i];
            while(window + k < i - left +1){
                window -= nums[left];
                left++;
            }
            ans = Math.max(ans,i - left +1);
        }
        return ans;
    }
}
