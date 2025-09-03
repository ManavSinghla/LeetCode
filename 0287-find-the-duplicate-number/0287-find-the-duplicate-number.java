class Solution {
    public int findDuplicate(int[] nums) {
        for(int i=0;i<nums.length;i++){
            int ci=nums[i]-1;
            if(nums[ci]!=nums[i]){
                int temp=nums[ci];
                nums[ci]=nums[i];
                nums[i]=temp;
                i--;
            }
        }
        int ans=-1;
        for(int i=0;i<nums.length;i++){
            if(nums[i]-1!=i){
                ans=nums[i];
            }
        }
        return ans;
    }
}