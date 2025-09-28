class Solution {
    public int majorityElement(int[] nums) {
        int c=1;
        int lead=nums[0];
        for(int i=1;i<nums.length;i++){
            if(c==0){
                lead=nums[i];
                c++;
            }
            else if(nums[i]==lead) c++;
            else c--;
        }
        return lead;
    }
}