class Solution {
    public int maxSubarraySumCircular(int[] nums) {
        int n=nums.length;
        int ans=nums[0];
        int sum=nums[0];
        int minSum=nums[0];
        int min=nums[0];
        int t=nums[0];
        for(int i=1;i<n;i++){
            t+=nums[i];
            sum=Math.max(nums[i],sum+nums[i]);
            ans=Math.max(sum,ans);
            minSum=Math.min(nums[i],minSum+nums[i]);
            min=Math.min(minSum,min);
        }
        if(sum<0) return ans;
        return Math.max(ans,t-min);
    }
}