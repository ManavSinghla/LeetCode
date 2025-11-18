class Solution {
    public int[] findErrorNums(int[] nums) {
        int i=0;
        while(nums.length>i){
            int ci=nums[i]-1;
            if(nums[ci]!=nums[i]){
                int temp=nums[ci];
                nums[ci]=nums[i];
                nums[i]=temp;
            }
            else i++;
        }
        int[] ans={-1,-1};
        for(int j=0;j<nums.length;j++){
            if(nums[j]-1!=j){
                ans[0]=nums[j];
                ans[1]=j+1;
                break;
            }
        }
        return ans;
    }
}