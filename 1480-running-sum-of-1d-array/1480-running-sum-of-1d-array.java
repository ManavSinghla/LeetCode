class Solution {
    public int[] runningSum(int[] nums) {
        int temp=0;
        int n=nums.length;
        int[] ans=new int[n];
        for(int i=0;i<n;i++){
            ans[i]=nums[i]+temp;
            temp=ans[i];
        }
        return ans;
    }
}