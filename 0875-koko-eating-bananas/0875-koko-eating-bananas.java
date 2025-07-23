class Solution {
    boolean check(int[]piles, int h,int mid){
        int sum=0;
        for(int i=0;i<piles.length;i++){
            sum+=Math.ceil(piles[i]*1.0/mid);
        }
        return sum<=h;
    }
    public int minEatingSpeed(int[] piles, int h) {
        int low=1;
        int high=piles[0];
        for(int i=0;i<piles.length;i++){
            high=Math.max(piles[i],high);
        }
        int ans=0;
        while(low<=high){
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