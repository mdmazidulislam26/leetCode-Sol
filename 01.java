class Solution {
    public int[] twoSum(int[] nums, int target) {
        int[] arr = new int[2];
        for(int i = 0; i < nums.length-1; i++){
            if(nums[i]+nums[i+1]==target){
                arr[0] = i;
                arr[1] = i + 1;
                break;
            }
        }
        if(arr[0] == 0 && arr[1] == 0){
            for(int i = 0; i < nums.length-1; i++){
                for(int j = 1; j < nums.length; j++){
                    if(nums[i]+nums[j]==target && i!=j){
                        arr[0] = i;
                        arr[1] = j;
                        break;
                    }
                }
            }
        }    
        return arr;
    }
}  
