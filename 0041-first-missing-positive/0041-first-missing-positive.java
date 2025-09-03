class Solution {
    public int firstMissingPositive(int[] nums) {
        int i=0;
        int n=nums.length;
        while(i<n){
            if(nums[i]>0 && nums[i]<=n){
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
            else{
                i++;
            }
        }
        for(int j=0;j<n;j++){
            if(nums[j]-1!=j){
                return j+1;
            }
        }
        return n+1;
    }
}