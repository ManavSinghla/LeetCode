class Solution {
    public int pivotIndex(int[] nums) {
        int sum=0;
        for(int i=0;i<nums.length;i++){
            sum+=nums[i];
        }
        int rsum=sum-nums[0];
        int lsum=0;
        if(rsum==lsum) return 0;
        for(int i=1;i<nums.length;i++){
            rsum-=nums[i];
            lsum+=nums[i-1];
            if(rsum==lsum) return i;
        }
        return -1;
    }
}