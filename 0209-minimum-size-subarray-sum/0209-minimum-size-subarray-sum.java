class Solution {
    public int minSubArrayLen(int target, int[] nums) {
        int n=nums.length;
        int i=0;
        int j=0;
        int sum=0;
        int ans=n+1;
        while(j<n){
            sum+=nums[j];
            while(sum>=target){
                ans=Math.min(ans,j-i+1);
                sum-=nums[i];
                i++;
            }
            j++;
        }
        if(ans==n+1) return 0;
        return ans;
    }
}