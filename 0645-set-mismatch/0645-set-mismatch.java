class Solution {
    public int[] findErrorNums(int[] nums) {
        int i=0;
        int n=nums.length;
        while(i<n){
            int ci=nums[i]-1;
            if(nums[i]!=nums[ci]){
                int temp=nums[nums[i]-1];
                nums[nums[i]-1]=nums[i];
                nums[i]=temp;
            }
            else{
                i++;
            }
        }
        int[] ans=new int[2];
        for(int j=0;j<n;j++){
            if(j+1!=nums[j]){
                ans[0]=nums[j];
                ans[1]=j+1;
            }
        }
        return ans;
    }
}