class Solution {
    public int jump(int[] nums) {
        int ans=0;
        int max=0;
        int re=0;
        for(int i=0;i<nums.length-1;i++){
            if(re>=nums.length) break;
            max=Math.max(max,nums[i]+i);
            if(i==re){
                ans++;
                re=max;
            }
        }
        return ans;
    }
}