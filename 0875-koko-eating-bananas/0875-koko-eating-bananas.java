class Solution {
    boolean check(int[] piles, int h, int mid){
        int s=0;
        for(int i=0;i<piles.length;i++){
            s+=Math.ceil(piles[i]*1.0/mid);
        }
        return s<=h;
    }
    public int minEatingSpeed(int[] piles, int h) {
        int low=1;
        int high=1000000000;
        int ans=-1;
        while(high>=low){
            int mid=low+(high-low)/2;
            if (check(piles,h,mid)){
                ans=mid;
                high=mid-1;
            }
            else low=mid+1;
        }
        return ans;
    }
}