class Solution {
    public int longestConsecutive(int[] nums) {
        int n=nums.length;
        if(n==0) return 0;
        Arrays.sort(nums);
        int ans=1;
        int temp=1;
        for(int i=1;i<n;i++){
            if(nums[i-1]==nums[i]);
            else if(nums[i-1]+1==nums[i]){
                temp++;
            }
            else{
                temp=1;
            }
            ans=Math.max(ans,temp);
        }
        return ans;
    }
}