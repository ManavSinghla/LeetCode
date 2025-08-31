class Solution {
    int fun(int[] nums,int left,int right){
        if(left==right) return nums[left];
        int pickLeft=nums[left]-fun(nums,left+1,right);
        int pickRight=nums[right]-fun(nums,left,right-1);
        return Math.max(pickLeft,pickRight);
    }
    public boolean predictTheWinner(int[] nums) {
        return fun(nums,0,nums.length-1)>=0;
    }
}