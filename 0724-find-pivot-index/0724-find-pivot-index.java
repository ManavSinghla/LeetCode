class Solution {
    public int pivotIndex(int[] nums) {
        int s=0;
        int n=nums.length;
        for(int i=0;i<n;i++){
            s+=nums[i];
        }
        int lsum=0;
        int rsum=s-nums[0];
        if(lsum==rsum) return 0;
        for(int i=1;i<n;i++){
            lsum+=nums[i-1];
            rsum-=nums[i];
            if(lsum==rsum) return i;
        }
        return -1;
    }
}