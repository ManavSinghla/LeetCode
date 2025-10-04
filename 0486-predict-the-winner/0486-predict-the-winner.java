class Solution {
    int fun(int[] nums,int l,int r){
        if(l==r) return nums[l];
        int left=nums[l]-fun(nums,l+1,r);
        int right=nums[r]-fun(nums,l,r-1);
        return Math.max(left,right);
    }
    public boolean predictTheWinner(int[] nums) {
        if(fun(nums,0,nums.length-1)>=0) return true;
        return false;
    }
}