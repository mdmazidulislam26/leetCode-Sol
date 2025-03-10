// 1st
class Solution {
    public int differenceOfSums(int n, int m) {
        int x = n / m;
        int num2 = m * x * ( x + 1) / 2;
        int num1 = n * (n + 1) / 2 - num2;
        return num1 - num2;
    }
}
// 2nd 
class Solution {
    public int differenceOfSums(int n, int m) {
    /// optional
        if(m > n){
            m = 0;
            for(int i = 1; i <= n ; i++){
                m += i;
            }
            return m;
        }
      /// optional
        if(m == 1){
            m = 0;
            for(int i = 1; i <= n ; i++){
                m += i;
            }
            return 0-m;
        }

        int sum1 = 0;
        int sum2 = 0;

        for(int i = 1; i <= n ; i++){
            if(i%m == 0){
                sum2 += i;
                continue;
            }
            sum1 += i;
        }
        return sum1 - sum2;
    }
}
