class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        int temp=0;
        int ans=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]==0) temp=0;
            else temp++;
            ans=Math.max(ans,temp);
        }
        return ans;
    }
}