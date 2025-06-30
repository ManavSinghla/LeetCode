class Solution {
    public int missingNumber(int[] nums) {
        int i=0;
        int n=nums.length;
        while(i<n){
            if(nums[i]!=i && nums[i]<n){
                int temp=nums[nums[i]];
                nums[nums[i]]=nums[i];
                nums[i]=temp;
            }
            else{
                i++;
            }
        }
        for(int j=0;j<n;j++){
            if(j!=nums[j]){
                return j;
            }
        }
        return n;
    }
}