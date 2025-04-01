class Solution {
    public int majorityElement(int[] nums) {
        Arrays.sort(nums);
        int majorElement=nums[0];
        int prvCount=00;
        int count=1;
        for(int i =0; i < nums.length-1; i++){
            if(nums[i] == nums[i+1]){
                count++;
            }
            if(prvCount < count){
                prvCount = count;
                majorElement = nums[i];
            }
            if(nums[i] != nums[i+1]){
                count = 1;
            }
        }
        return majorElement;
    }
}
