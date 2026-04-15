class Solution {
    public int majorityElement(int[] nums) {
        int c=1;
        int ans=nums[0];
        for(int i=1;i<nums.length;i++){
            if(ans==nums[i]){
                c++;
            }
            else if(c==1){
                ans=nums[i];
                c=1;
            }
            else c--;
        }
        return ans;
    }
}