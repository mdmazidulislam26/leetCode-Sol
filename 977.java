class Solution {
    public int[] sortedSquares(int[] nums) {
        int l = 0;
        int r = nums.length - 1;
        int i = nums.length - 1;
        int[] arr = new int[nums.length];
        while(l<=r){
            if(Math.abs(nums[l]) <= nums[r]){
                arr[i] = nums[r] * nums[r];
                r--;
                i--; 
            }else{
                arr[i] = nums[l] * nums[l];
                l++;
                i--;
            }
        }
        return arr;
    }
}
