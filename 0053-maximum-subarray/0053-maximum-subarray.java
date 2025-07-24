class Solution {
    public int maxSubArray(int[] nums) {
        int max=0;
        int curr=0;
        for(int i=0;i<nums.length;i++){
            curr=Math.max(nums[i],curr+nums[i]);
            max=Math.max(curr,max);
        }
        return max;
    }
}