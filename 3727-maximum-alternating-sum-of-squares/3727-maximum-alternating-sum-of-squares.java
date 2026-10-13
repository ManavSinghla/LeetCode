class Solution {
    public long maxAlternatingSum(int[] nums) {
        int n=nums.length;
        for(int i=0;i<n;i++){
            nums[i]=Math.abs(nums[i]);
        }
        Arrays.sort(nums);
        long ans=0;
        for(int i=0;i<n/2;i++){
            ans+=Math.pow(nums[n-i-1],2)-Math.pow(nums[i],2);
        }
        if(n%2!=0) ans+=Math.pow(nums[n/2],2);
        return ans;
    }
}