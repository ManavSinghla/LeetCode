class Solution {
    public int missingNumber(int[] nums) {
        for(int i=0;i<nums.length;i++){
            int ci=nums[i];
            if(nums.length>ci && nums[ci]!=nums[i]){
                int temp=nums[i];
                nums[i]=nums[ci];
                nums[ci]=temp;
                i--;
            }
        }
        for(int i=0;i<nums.length;i++){
            if(nums[i]!=i){
                return i;
            }
        }
        return nums.length;
    }
}