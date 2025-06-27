class Solution {
    public int majorityElement(int[] nums) {
        int c=1;
        int ans=nums[0];
        for(int i=1;i<nums.length;i++){
            if(c==0){
                ans=nums[i];
                c++;
            }
            else if(ans==nums[i]){
                c++;
            }
            else{
                c--;
            }
        }
        return ans;
    }
}