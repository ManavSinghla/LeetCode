class Solution {
    public int longestMonotonicSubarray(int[] nums) {
        int ans=1;
        int l=1;
        int h=1;
        for(int i=1;i<nums.length;i++){
            if(nums[i]>nums[i-1]){
                if(l!=1) l=1;
                h++;
            }
            else if(nums[i]<nums[i-1]){
                if(h!=1) h=1;
                l++;
            }
            else{
                l=1;
                h=1;
            }
            ans=Math.max(ans,Math.max(l,h));
        }
        return ans;
    }
}