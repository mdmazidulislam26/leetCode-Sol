// my sol
class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        int max = 0;
        int count = 0;
        for(int i = 0; i < nums.length ; i++){
            if(nums[i] == 1){
                count++;
            }else{
                count = 0;
            }
            if(max < count) max = count;
        }
        return max;
        
    }
}
