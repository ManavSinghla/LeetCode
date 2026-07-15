class Solution {
    public int gcdOfOddEvenSums(int n) {
        int sumOdd=0;
        int sumEven=0;
        for(int i=1;i<n*2;i+=2){
            sumOdd+=i;
        }
        for(int i=2;i<=n*2;i+=2){
            sumEven+=i;
        }
        int x=Math.max(sumOdd,sumEven);
        for(int i=x;i>=0;i--){
            if(sumOdd%i==0 && sumEven%i==0){
                return i;
            }
        }
        return 1;
    }
}