class Solution {
    public int countPartitions(int[] nums) {
        int ans=0;
        int sum=0;
        for(int i=0;i<nums.length;i++){
            sum+=nums[i];
        }
        int l=nums[0];
        int r=sum-l;
        if((r-l)%2==0) ans++;
        for(int i=1;i<nums.length-1;i++){
            l+=nums[i];
            r-=nums[i];
            if((r-l)%2==0) ans++;
        }
        return ans;
    }
}