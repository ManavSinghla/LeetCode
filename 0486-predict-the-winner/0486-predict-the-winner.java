class Solution {
    int fun(int[] nums,int l,int r){
        if(l==r) return nums[l];
        int pL=nums[l]-fun(nums,l+1,r);
        int pR=nums[r]-fun(nums,l,r-1);
        return Math.max(pL,pR);
    }
    public boolean predictTheWinner(int[] nums) {
        return fun(nums,0,nums.length-1)>=0;
    }
}