class Solution {
    boolean check(int[] nums,int d,int mid){
        int s=0;
        int c=1;
        for(int i=0;i<nums.length;i++){
            if(s+nums[i]>mid){
                c++;
                s=0;
            }
            s+=nums[i];
        }
        return d>=c;
    }
    public int shipWithinDays(int[] weights, int days) {
        int low=0;
        int high=0;
        for(int i=0;i<weights.length;i++){
            low=Math.max(low,weights[i]);
            high+=weights[i];
        }
        int ans=-1;
        while(high>=low){
            int mid=low+(high-low)/2;
            if(check(weights,days,mid)){
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