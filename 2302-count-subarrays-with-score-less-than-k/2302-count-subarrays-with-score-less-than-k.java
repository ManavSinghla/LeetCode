class Solution {
    public long countSubarrays(int[] nums, long k) {
        if(k==1) return 0;
        int i=0;
        int j=0;
        long ans=0;
        long sum=0;
        long p=1;
        int n=nums.length;
        while(j<n){
            sum+=nums[j];
            p=sum*(j-i+1);
            while(i<=j && p>=k){
                sum-=nums[i];
                i++;
                p=sum*(j-i+1);
            }
            ans+=j-i+1;
            j++;
        }
        return ans;
    }
}