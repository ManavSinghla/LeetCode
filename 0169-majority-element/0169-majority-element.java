class Solution {
    public int majorityElement(int[] nums) {
        int c=1;
        int a=nums[0];
        for(int i=1;i<nums.length;i++){
            if(c==0){
                c++;
                a=nums[i];
            }
            else if(a==nums[i]) c++;
            else c--;
        }
        return a;
    }
}