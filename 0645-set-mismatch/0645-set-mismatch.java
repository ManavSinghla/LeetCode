class Solution {
    public int[] findErrorNums(int[] nums) {
        int i=0;
        while(i<nums.length){
            int ci=nums[i]-1;
            if(nums[ci]!=nums[i]){
                int temp=nums[ci];
                nums[ci]=nums[i];
                nums[i]=temp;
            }
            else{
                i++;
            }
        }
        int[] ans=new int[2];
        for(int j=0;j<nums.length;j++){
            if(nums[j]!=j+1){
                ans[0]=nums[j];
                ans[1]=j+1;
            }
        }
        return ans;
    }
}