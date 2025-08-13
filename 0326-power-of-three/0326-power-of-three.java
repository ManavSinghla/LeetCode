class Solution {
    public boolean isPowerOfThree(int n) {
        while(n>0){
            if(n==1) return true;
            else if(n%3!=0) return false;
            n=n/3;
        }
        return false;
    }
}