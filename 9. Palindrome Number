class Solution {
    public boolean isPalindrome(int x) {
        int num = Math.abs(x);
        int n = 0;
        while(true){
            if(num/10 == 0){
                n = n * 10 + (num % 10);
                break;
            }
            n = n * 10 + (num % 10);
            num = num/10;
        }
        if(n != x){
           return false;
        }
       return true;
    }
}
