class Solution {
    public int rob(int[] nums) {
        int n=nums.length;
        if(n==1) return nums[0];
        if(n==2) return Math.max(nums[0],nums[1]);
        int[] ans1=new int[n-1];
        int[] ans2=new int[n-1];
        ans1[0]=nums[0];
        ans1[1]=Math.max(nums[0],nums[1]);
        ans2[0]=nums[1];
        ans2[1]=Math.max(nums[1],nums[2]);
        for(int i=2;i<n-1;i++){
            ans1[i]=Math.max(ans1[i-1],ans1[i-2]+nums[i]);
        }
        for(int i=2;i<n-1;i++){
            ans2[i]=Math.max(ans2[i-1],ans2[i-2]+nums[i+1]);
        }
        return Math.max(ans1[n-2],ans2[n-2]);
    }
}