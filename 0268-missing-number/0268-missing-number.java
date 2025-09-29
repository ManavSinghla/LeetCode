class Solution {
    public int missingNumber(int[] nums) {
        for(int i=0;i<nums.length;i++){
            int ci=nums[i];
            if(ci<nums.length && i!=ci){
                int temp=nums[ci];
                nums[ci]=nums[i];
                nums[i]=temp;
                i--;
            }
        }
        for(int i=0;i<nums.length;i++){
            if(i!=nums[i]){
                return i;
            }
        }
        return nums.length;
    }
}