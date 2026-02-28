class Solution {
    public long zeroFilledSubarray(int[] nums) {
        long ans=0;
        long a=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]==0){
                a++;
                ans+=a;
            }
            else{
                a=0;
            }
        }
        return ans;
    }
}