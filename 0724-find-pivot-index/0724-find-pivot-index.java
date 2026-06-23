class Solution {
    public int pivotIndex(int[] nums) {
        int s=0;
        int n=nums.length;
        for(int i=0;i<n;i++){
            s+=nums[i];
        }
        int l=0;
        int r=s-nums[0];
        if(l==r) return 0;
        for(int i=1;i<n;i++){
            l+=nums[i-1];
            r-=nums[i];
            if(l==r) return i;
        }
        return -1;
    }
}