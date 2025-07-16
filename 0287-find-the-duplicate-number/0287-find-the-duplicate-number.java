class Solution {
    public int findDuplicate(int[] nums) {
        int i=0;
        while(i<nums.length){
            int ci=nums[i]-1;
            if(nums[ci]!=nums[i]){
                int temp=nums[i];
                nums[i]=nums[ci];
                nums[ci]=temp;
            }
            else{
                i++;
            }
        }
        for(int j=0;j<nums.length;j++){
            if(nums[j]-1!=j){
                return nums[j];
            }
        }
        return -1;
    }
}