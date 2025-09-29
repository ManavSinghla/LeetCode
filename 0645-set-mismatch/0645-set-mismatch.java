class Solution {
    public int[] findErrorNums(int[] nums) {
        int i=0;
        int n=nums.length;
        while(i<n){
            int ci=nums[i]-1;
            if(nums[ci]!=nums[i]){
                int temp=nums[ci];
                nums[ci]=nums[i];
                nums[i]=temp;
            }
            else i++;
        }
        int[] ans={0,0};
        for(int j=0;j<n;j++){
            if(nums[j]!=j+1){
                ans[0]=nums[j];
                ans[1]=j+1;
            }
        }
        return ans;
    }
}