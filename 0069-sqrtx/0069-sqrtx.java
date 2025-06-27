class Solution {
    public int mySqrt(int x) {
        long low=0;
        long high=x;
        long temp=-1;
        while(low<=high){
            long mid=low+(high-low)/2;
            if((mid*mid)==x){
                return (int)mid;
            }
            else if((mid*mid)>x){
                high=mid-1;
            }
            else{
                low=mid+1;
                temp=mid;
            }
        }
        return (int)temp;
    }
}