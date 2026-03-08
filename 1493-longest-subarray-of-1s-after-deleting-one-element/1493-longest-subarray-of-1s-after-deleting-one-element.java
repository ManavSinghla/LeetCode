class Solution {
    public int longestSubarray(int[] nums) {
        int i=0;
        int j=0;
        int n=nums.length;
        int c=0;
        int ans=0;
        while(j<n){
            if(nums[j]==1){
                ans=Math.max(j-i+1,ans);
                j++;
            }
            else{
                if(c==0){
                j++;
                c++;
                }
                else{
                    while(nums[i]==1) i++;
                    i++;
                    c=0;
                }
            }
        }
        return ans-1;
    }
}