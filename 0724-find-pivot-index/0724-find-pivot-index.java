class Solution {
    public int pivotIndex(int[] nums) {
        int sum=0;
        for(int i=0;i<nums.length;i++){
            sum+=nums[i];
        }
        int lSum=0;
        int Rsum=sum-nums[0];
        if(lSum==Rsum) return 0;
        for(int i=1;i<nums.length;i++){
            lSum+=nums[i-1];
            Rsum-=nums[i];
            if(lSum==Rsum) return i;
        }
        return -1;
    }
}