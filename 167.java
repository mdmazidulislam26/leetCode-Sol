class Solution {
    public int[] twoSum(int[] numbers, int target) {
        int[] res = new int[2];
        if(true){
            int l = numbers.length -1;
            int  r = 0;
            while(l > r ){
                if(numbers[r] + numbers[l] == target){
                    break;
                }
                else if(numbers[r] + numbers[l] > target){
                    l--;
                }else{
                    r++;
                }
            }
            res[0]=r+1;
            res[1]=l+1;
        }
        return res;
    }
}
