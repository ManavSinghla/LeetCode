class Solution {
    public int rob(int[] nums) {
        int n=nums.length;
        if(n==1) return nums[0];
        int[] ans=new int[n];
        int[] ans1=new int[n];
        ans[0]=nums[0];
        ans[1]=Math.max(nums[0],nums[1]);
        ans1[0]=0;
        ans1[1]=nums[1];
        for(int i=2;i<n-1;i++){
            ans[i]=Math.max(ans[i-1],nums[i]+ans[i-2]);
        }
        for(int i=2;i<n;i++){
            ans1[i]=Math.max(ans1[i-1],nums[i]+ans1[i-2]);
        }
        return Math.max(ans[n-2],ans1[n-1]);
    }
}