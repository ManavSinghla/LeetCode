class Solution {
    public int numSubarrayProductLessThanK(int[] nums, int k) {
        if(k<=1) return 0;
        int i=0;
        int j=0;
        int ans=0;
        int p=1;
        while(j<nums.length){
            p*=nums[j];
            while(i<nums.length && p>=k){
                p/=nums[i];
                i++;
            }
            ans+=j-i+1;
            j++;
        }
        return ans;
    }
}