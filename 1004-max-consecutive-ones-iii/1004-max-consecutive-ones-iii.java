class Solution {
    public int longestOnes(int[] nums, int k) {
        int ans=0;
        int i=0;
        int c=0;
        for(int j=0;j<nums.length;j++){
            if(nums[j]==1){
                ans=Math.max(j-i+1,ans);
            }
            else{
                if(k>c){
                    c++;
                    ans=Math.max(j-i+1,ans);
                }
                else{
                    while(nums[i]==1) i++;
                    i++;
                    j--;
                    c--;
                }
            }
        }
        return ans;
    }
}