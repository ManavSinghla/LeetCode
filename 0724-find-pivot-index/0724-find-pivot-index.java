class Solution {
    public int pivotIndex(int[] nums) {
        int n=nums.length;
        int s=0;
        for(int i=0;i<n;i++){
            s+=nums[i];
        }
        int ls=0;
        int rs=s-nums[0];
        if(ls==rs) return 0;
        for(int i=1;i<n;i++){
            ls+=nums[i-1];
            rs-=nums[i];
            if(ls==rs) return i;
        }
        return -1;
    }
}