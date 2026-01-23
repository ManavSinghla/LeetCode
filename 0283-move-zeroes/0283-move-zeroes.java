class Solution {
    public void moveZeroes(int[] nums) {
        int j=0;
        int i=0;
        while(i<nums.length){
            if(nums[i]!=0) nums[j++]=nums[i];
            i++;
        }
        while(j<nums.length) nums[j++]=0;
    }
}