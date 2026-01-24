class Solution {
    boolean check(int[] nums,int d,int mid){
        int s=0;
        for(int i=0;i<nums.length;i++){
            s+=Math.ceil(nums[i]*1.0/mid);
        }
        return d>=s;
    }
    public int minEatingSpeed(int[] piles, int h) {
        int low=1;
        int high=0;
        for(int i=0;i<piles.length;i++){
            high=Math.max(high,piles[i]);
        }
        int ans=-1;
        while(high>=low){
            int mid=low+(high-low)/2;
            if(check(piles,h,mid)){
                ans=mid;
                high=mid-1;
            }
            else{
                low=mid+1;
            }
        }
        return ans;
    }
}