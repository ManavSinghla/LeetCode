class Solution {
    public int findMiddleIndex(int[] nums) {
        int sum=0;
        for(int i=0;i<nums.length;i++){
            sum+=nums[i];
        }
        int lsum=0;
        int rsum=sum-nums[0];
        if(lsum==rsum) return 0;
        for(int i=1;i<nums.length;i++){
            lsum+=nums[i-1];
            rsum-=nums[i];
            if(lsum==rsum) return i;
        }
        return -1;
    }
}